package com.test.coding.baekjoon.math;

import java.io.*;
import java.util.*;

/**
 *
 * $_1001 의 설명
 * 패키지: com.test.coding.baekjoon.math
 * 알고리즘 분류: 수학, 구현, 사칙연산
 * 문제: 두 정수 A와 B를 입력받은 다음, A-B를 출력하는 프로그램을 작성하시오.
 * 입력: 첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
 * 출력: 첫째 줄에 A-B를 출력한다.
 * 주의사항:
 * 일시: 2024. 07. 08.
 * 정답율: 69%
 * 수행시간: 128ms
**/
public class $_1001 {

    static int A, B;

    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            StringTokenizer st = new StringTokenizer(br.readLine());

            A = Integer.parseInt(st.nextToken());
            B = Integer.parseInt(st.nextToken());

            bw.write(String.valueOf(minus(A, B)));
            bw.flush();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    static int minus(int a, int b) {
        return a - b;
    }
}
