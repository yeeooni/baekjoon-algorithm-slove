package com.test.coding.baekjoon.math;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

/**
 *
 * $_1000 의 설명
 * 패키지: com.test.coding.baekjoon.math
 * 알고리즘 분류: 수학, 구현, 사칙연산
 * 문제: 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 * 입력: 첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
 * 출력: 첫째 줄에 A+B를 출력한다.
 * 주의사항:
 * 일시: 2024. 03. 10.
 * 정답율: 38%
 * 수행시간: 188ms
**/
public class $_1000 {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        if(input.hasNextInt()) {
            int x = input.nextInt(), y = input.nextInt();
            bw.write(String.valueOf(exec(x, y)));
            bw.flush();
        }
    }

    static int exec(int x, int y){
        return x + y;
    }

}