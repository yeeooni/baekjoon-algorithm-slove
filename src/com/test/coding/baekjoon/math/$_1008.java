package com.test.coding.baekjoon.math;

import java.io.*;
import java.util.StringTokenizer;

/**
 *
 * $_1008 의 설명
 * 패키지: com.test.coding.baekjoon.input_output_and_arithmetic_operations
 * 알고리즘 분류: 수학, 구현, 사칙연산
 * 문제: 두 정수 A와 B를 입력받은 다음, A/B 출력
 * 입력: 첫째 줄 A, B (0 < A, B < 10)
 * 출력: 첫째 줄에 A/B 출력
 * 주의사항: 실제 정답과 출력값의 절대오차 또는 상대오차가 10^-9 이하이면 정답이다.(정수형은 사용하지 말라는 뜻)
 * 일시: 2024. 03. 13.
 * 정답율: 34%
 * 수행시간: 132ms
**/
public class $_1008 {

    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))){

            StringTokenizer st = new StringTokenizer(br.readLine());
            double a = Double.parseDouble(st.nextToken()), b = Double.parseDouble(st.nextToken());

            bw.write(String.valueOf(a / b));
            bw.flush();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

}
