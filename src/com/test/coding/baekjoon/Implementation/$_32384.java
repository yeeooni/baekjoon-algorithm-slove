package com.test.coding.baekjoon.Implementation;

import java.util.Scanner;

/**
 *
 * $_32384 의 설명
 * 패키지: com.test.coding.baekjoon.Implementation
 * 알고리즘 분류: 구현
 * 문제: 사랑은 고려대입니다.
 * 입력: 첫 번째 줄에 정수 $N(1\leq N\leq 10)$이 주어진다.
 * 출력: 첫 번째 줄에 LoveisKoreaUniversity를 공백으로 구분하여 $N$번 출력한다.
 * 주의사항:
 * 일시: 2024. 11. 4.
 * 정답율: 82%
 * 수행시간: 172ms
**/
public class $_32384 {

    private static final String TEXT = "LoveisKoreaUniversity";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNextInt()) {
            int n = scanner.nextInt();

            StringBuilder builder = new StringBuilder();
            for(int i = 0; i < n; i++) {
                builder.append(TEXT).append(" ");
            }

            System.out.print(builder);
        }
        scanner.close();
    }

}
