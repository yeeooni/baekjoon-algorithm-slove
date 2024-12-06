package com.test.coding.baekjoon.Implementation;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * $_23881 의 설명
 * 패키지: com.test.coding.baekjoon.Implementation
 * 알고리즘 분류: 구현, 정렬, 시뮬레이션
 * 문제: 문제가 길어서 생략(https://www.acmicpc.net/problem/23881)
 * 입력: 첫째 줄에 배열 A의 크기 N(5 ≤ N ≤ 10,000), 교환 횟수 K(1 ≤ K ≤ N)가 주어진다.
 *      다음 줄에 서로 다른 배열 A의 원소 A1, A2, ..., AN이 주어진다. (1 ≤ Ai ≤ 109)
 * 출력: K 번째 교환되는 두 개의 수를 작은 수부터 한 줄에 출력한다. 교환 횟수가 K 보다 작으면 -1을 출력한다.
 * 주의사항:
 * 일시: 2024. 12. 6.
 * 정답율: 40%
 * 수행시간: 404ms
**/

class Selection {

    int n;  //arr len
    int k;  //swap count
    int[] arr; //arr

    static int count;

    static {
        count = 0;
    }

    Selection(int n, int k) {
        this.n = n;
        this.k = k;
        arr = new int[n];
    }

    void selectionSort(int[] arr, int n){
        int i, j, max = 0;

        for(i = n - 1; i > 0; i--){
            max = i;
            for(j = i - 1; j >= 0; j--){
                if(arr[max] < arr[j]){ //더 큰값을 찾음
                    max = j;
                }
            }
            if(max != i){
                count ++;
                if(count == k) break;
                swap(i, max);
            }
        }

        if(count < k) System.out.println(-1);
        else System.out.println(arr[i] + " " + arr[max]);
    }

    void swap(int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}

public class $_23881 {

    public static void main(String[] args) {
        int i = 0;

        Scanner scanner = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(scanner.nextLine());
        Selection selection = new Selection(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        st = new StringTokenizer(scanner.nextLine());
        scanner.close();

        //배열 초기화
        while (st.hasMoreTokens()) {
            selection.arr[i++] = Integer.parseInt(st.nextToken());
        }
        selection.selectionSort(selection.arr, selection.n);
    }


}
