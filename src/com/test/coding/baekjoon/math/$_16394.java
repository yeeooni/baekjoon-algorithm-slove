package com.test.coding.baekjoon.math;

import java.util.Scanner;

/**
 *
 * $_16394 의 설명
 * 패키지: com.test.coding.baekjoon.math
 * 알고리즘 분류: 수학, 사칙연산
 * 문제: 홍익대학교는 1946년에 개교하였다.
 *      특정 년도가 주어졌을 때, 그 해가 개교 몇 주년인지 출력하라.
 *      단, 홍익대학교는 없어지지 않는다고 가정한다.
 * 입력: 입력으로 첫 줄에 특정 년도를 알리는 정수 N이 주어진다. 정수 N은 1,946 부터 1,000,000 사이의 값이다. (1,946 ≤ N ≤ 1,000,000)
 * 출력: 출력으로 홍익대학교의 개교 주년을 나타내는 정수를 출력한다.
 * 주의사항:
 * 일시: 2024. 11. 6.
 * 정답율: 85%
 * 수행시간: 172ms
**/
public class $_16394 {

    private static final int YEAR = 1946;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNextInt()) {
            int year = scanner.nextInt();
            System.out.println(year - YEAR);
        }
    }

}
