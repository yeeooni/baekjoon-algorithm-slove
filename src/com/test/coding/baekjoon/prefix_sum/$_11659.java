package com.test.coding.baekjoon.prefix_sum;

import java.io.*;
import java.util.StringTokenizer;

/**
 *
 * $_11659의 설명
 * 패키지: com.test.coding.baekjoon.prefix_sum
 * 알고리즘 분류: 누적합
 * 문제: 수 N개가 주어졌을 때, i번째 수부터 j번째 수까지 합을 구하는 프로그램을 작성하시오.
 * 입력: 첫째 줄에 수의 개수 N과 합을 구해야 하는 횟수 M이 주어진다. 둘째 줄에는 N개의 수가 주어진다. 수는 1,000보다 작거나 같은 자연수이다. 셋째 줄부터 M개의 줄에는 합을 구해야 하는 구간 i와 j가 주어진다.
 * 출력: 총 M개의 줄에 입력으로 주어진 i번째 수부터 j번째 수까지 합을 출력한다.
 * 주의사항: 첫번째 인덱스는 0으로 패딩처리, 합배열을 이용하여 구간합을 구함
 * 일시: 2024. 7. 4.
 * 정답율: 38%
 * 수행시간: 724ms
**/
public class $_11659 {

    static int count;

    public static void main(String[] args){
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))){

            StringTokenizer st = new StringTokenizer(br.readLine()); //N, S

            int N[] = new int[Integer.parseInt(st.nextToken()) + 1]; //배열
            int S[] = new int[N.length];    //합배열
            int start, end;

            count = Integer.parseInt(st.nextToken()); //연산횟수

            st = new StringTokenizer(br.readLine()); //배열의 값

            for(int i = 1; i < N.length; i++){
                N[i] = Integer.parseInt(st.nextToken());
                S[i] = S[i-1] + N[i];
            }

            while(count != 0){
                st = new StringTokenizer(br.readLine()); //시작, 종료 인덱스
                start = Integer.parseInt(st.nextToken());
                end = Integer.parseInt(st.nextToken());
                count--;

                bw.write(String.valueOf(S[end] - S[start - 1]) + "\n");
            }

//            System.out.println("기존 배열의 값은 : " + Arrays.toString(N));
//            System.out.println("합의 배열의 값은 : " + Arrays.toString(S));

            bw.flush();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
