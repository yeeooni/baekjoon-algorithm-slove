package com.test.coding.baekjoon.math;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * $_5717 의 설명
 * 패키지: com.test.coding.baekjoon.math
 * 알고리즘 분류: 수학, 사칙연산
 * 문제: 상근이의 남자 친구의 수와 여자 친구의 수가 주어졌을 때, 친구는 총 몇 명인지 구하는 프로그램을 작성하시오.
 * 입력: 입력은 여러 개의 테스트 케이스로 이루어져 있다. 각 테스트 케이스는 두 정수 M과 F로 이루어져 있으며, 각각은 상근이의 남자 친구의 수와 여자 친구의 수이다. (1 ≤ M, F ≤ 5)
 *      입력의 마지막 줄에는 0이 두 개 주어진다.
 * 출력: 각 테스트 케이스마다 상근이의 친구의 수를 출력한다.
 * 주의사항:
 * 일시: 2024. 11. 26.
 * 정답율: 78%
 * 수행시간: 168ms
**/
public class $_5717 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for(;;){
            StringTokenizer st = new StringTokenizer(scanner.nextLine());
            int result = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
            if(result == 0) break;
            System.out.println(result);
        }

        scanner.close();
    }

}
