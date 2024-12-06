package com.test.coding.baekjoon.Implementation;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

class $_Selection {

    int n;  //arr len
    int k;  //swap count
    int[] arr; //arr

    static int count;

    static {
        count = 0;
    }

    $_Selection(int n, int k) {
        this.n = n;
        this.k = k;
        arr = new int[n];
    }

    void selectionSort(int[] arr, int n){
        int i, j, max;

        for(i = n - 1; i > 0; i--){
            max = i;
            for(j = i - 1; j >= 0; j--){
                if(arr[max] < arr[j]){ //더 큰값을 찾음
                    max = j;
                }
            }
            if(max != i){
                count ++;
                // 스왑을 먼저한다. (바뀐 값을 출력해야하기 때문)
                swap(i, max);

                if(count == k) {
                    break;
                }
            }
        }
    }

    void swap(int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}

public class $_23882 {

    public static void main(String[] args) {
        int i = 0;

        Scanner scanner = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(scanner.nextLine());
        $_Selection selection = new $_Selection(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        st = new StringTokenizer(scanner.nextLine());
        scanner.close();

        //배열 초기화
        while (st.hasMoreTokens()) {
            selection.arr[i++] = Integer.parseInt(st.nextToken());
        }
        selection.selectionSort(selection.arr, selection.n);

        if($_Selection.count < selection.k) System.out.println(-1);
        else System.out.println(Arrays.toString(selection.arr).replaceAll("[\\[\\],]", ""));
    }


}
