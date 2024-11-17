package com.test.coding.baekjoon.math;

import java.util.Scanner;

/**
 *
 * $_16430 의 설명
 * 패키지: com.test.coding.baekjoon.math
 * 알고리즘 분류: 수학, 사칙연산
 * 문제: 톰은 마트에서 치즈 1kg 을 사서 집으로 돌아왔습니다.
 *      그런데 톰이 한눈을 판 사이 제리가 와서 A/B kg 만큼 훔쳐갔습니다.
 *      제리가 치즈를 훔쳐 간 후 톰이 가지고 있는 치즈의 무게는 얼마인가요?
 * 입력: 첫 번째 줄에 두 정수 A, B (1 ≤ A < B ≤ 9) 가 주어집니다.
 *      A와 B는 서로소임이 보장됩니다.
 * 출력: 정답을 기약분수로 표현했을 때 P/Q kg 이라면 첫 번째 줄에 P와 Q를 공백을 사이에 두고 출력합니다.
 * 주의사항:
 * 일시: 2024. 11. 17.
 * 정답율: 84%
 * 수행시간: 172ms
**/
public class $_16430 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int p = scanner.nextInt(), q = scanner.nextInt();

        //톰의 치즈: 1kg
        //제리가 가져간 치즈: A/Bkg
        //톰의 남은 치즈양: a/b - b/b

        //8/8 - 5/8 -> a-b/b
        print(p, q);
    }

    static void print(int a, int b){
        System.out.println(a - b + " " + b);
    }

}
