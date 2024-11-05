package com.test.coding.baekjoon.math;

import java.util.Scanner;

/**
 *
 * $_27433 의 설명
 * 패키지: com.test.coding.baekjoon.math
 * 알고리즘 분류: 수학, 사칙연산
 * 문제: 0보다 크거나 같은 정수 N이 주어진다. 이때, N!을 출력하는 프로그램을 작성하시오.
 * 입력: 첫째 줄에 정수 N(0 ≤ N ≤ 20)이 주어진다.
 * 출력: 첫째 줄에 N!을 출력한다.
 * 주의사항: 정수형의 범위를 잘 생각하자.
 * 일시: 2024. 11. 6.
 * 정답율: 47%
 * 수행시간: 176ms
**/
public class $_27433 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNextInt()) {
            int n = scanner.nextInt();
            System.out.print(factorial(n));
        }
        scanner.close();
    }

    static long factorial(int n) {
        if(n <= 0) return 1;
        return n * factorial(n - 1);
    }
}
