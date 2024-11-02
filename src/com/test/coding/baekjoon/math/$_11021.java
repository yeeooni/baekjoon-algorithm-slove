package com.test.coding.baekjoon.math;

import java.io.*;
import java.util.*;

/**
 *
 * $_11021 의 설명
 * 패키지: com.test.coding.baekjoon.math
 * 알고리즘 분류: 수학, 구현, 사칙연산
 * 문제: 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 * 입력: 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
 *      각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
 * 출력: 각 테스트 케이스마다 "Case #x: "를 출력한 다음, A+B를 출력한다. 테스트 케이스 번호는 1부터 시작한다.
 * 주의사항:
 * 일시: 2024. 11. 2.
 * 정답율: 49%
 * 수행시간: 124ms
**/
public class $_11021 {

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            int t = Integer.parseInt(br.readLine());
            StringTokenizer st;

            for(int i = 1; i <= t; i++) {
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
                bw.write(String.format("Case #%d: %d", i, a + b));
                bw.newLine();
            }
            bw.flush();

        } catch(IOException ioe) {
            ioe.printStackTrace();
        }
    }

}
