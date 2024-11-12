package com.test.coding.baekjoon.math;

import java.util.Scanner;

/**
 *
 * $_29751 의 설명
 * 패키지: com.test.coding.baekjoon.math
 * 알고리즘 분류: 수학, 기하학, 사칙연산
 * 문제: 양의 정수 $W$, $H$가 주어진다. 밑변의 길이가 $W$이고, 높이가 $H$인 삼각형의 넓이를 구하시오.
 * 입력: 정수 $W$, $H$가 공백으로 구분되어 주어진다. $(1 \le W, H \le 100)$ 
 * 출력: 밑변의 길이가 $W$이고, 높이가 $H$인 삼각형의 넓이를 출력한다. 넓이는 항상 소수점 아래 첫 번째 자리까지 출력한다.
 * 주의사항:
 * 일시: 2024. 11. 12.
 * 정답율: 70%
 * 수행시간: 168ms
**/
public class $_29751 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int w = scanner.nextInt(), h = scanner.nextInt();
        System.out.print((w * h) / 2.);
        scanner.close();
    }

}
