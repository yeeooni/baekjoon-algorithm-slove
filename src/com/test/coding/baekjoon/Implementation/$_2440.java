package com.test.coding.baekjoon.Implementation;

import java.io.*;

/**
 *
 * $_2440 의 설명
 * 패키지: com.test.coding.baekjoon.Implementation
 * 알고리즘 분류: 구현
 * 문제: 첫째 줄에는 별 N개, 둘째 줄에는 별 N-1개, ..., N번째 줄에는 별 1개를 찍는 문제
 * 입력: 첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
 * 출력: 첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
 * XXXXX
 * XXXX
 * XXX
 * XX
 * X
 * 주의사항:
 * 일시: 2024. 10. 18.
 * 정답율: 68%
 * 수행시간: 108ms
**/
public class $_2440 {

    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))){

            short n = Short.parseShort(br.readLine());
            for(int i = 1; i <= n; i++){
                for (int j = n - i; j >= 0; j--){
                    bw.write("*");
                }
                bw.newLine();
            }

            bw.flush();
        }catch (IOException e){
            e.getStackTrace();
        }
    }

}
