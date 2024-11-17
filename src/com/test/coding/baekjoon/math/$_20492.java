package com.test.coding.baekjoon.math;

import java.util.Scanner;

/**
 *
 * $_20492 의 설명
 * 패키지: com.test.coding.baekjoon.math
 * 알고리즘 분류: 수학, 사칙연산
 * 문제: 선린인터넷고등학교의 한 학생은 프로그래밍 대회에 참가하여 거액의 상금을 수상하는 영광을 누리게 되었다. 하지만, 이 학생이 상금 금액의 전부를 수령하게 되는 것은 아니다. 상금의 일부를 제세공과금으로 납부하고, 나머지 금액을 수령하게 된다.
 *      일반적으로, 대회에서 상금을 받으면 전체 금액의 22%를 제세공과금으로 국가에 납부하고, 나머지 금액을 수령하게 된다. 하지만, 상금의 80%를 필요 경비로 인정하게 되면, 나머지 20% 중 22%만을 제세공과금으로 납부해도 된다.
 *      대회 상금의 금액이 주어질 때, 다음 두 경우 각각에 대해 이 학생이 실제로 수령하는 금액을 구해보자.
 *      전체 상금의 22%를 제세공과금으로 납부하는 경우
 *      상금의 80%를 필요 경비로 인정받고, 나머지 금액 중 22%만을 제세공과금으로 납부하는 경우
 * 입력: 상금의 금액을 나타내는 하나의 정수 $N$이 주어진다.
 * 출력: 1번 경우에 대한 답과 2번 경우에 대한 답을 사이에 공백을 두고 출력한다.
 * 주의사항:
 * 일시: 2024. 11. 17.
 * 정답율: 64%
 * 수행시간: 172ms
**/
public class $_20492 {

    //1. 총 상금에서 22% 제세공과금
    private static final float TEX = .22F;

    //2. 총 상금 나머지 20% 중 22% 제외
    private static final float TEX_REMAINDER = TEX * .2F;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        print(l);
    }

    static void print(int n){
        StringBuilder sb = new StringBuilder();
        int one = (int) (n - n * TEX);
        int two = (int) (n - (n * TEX_REMAINDER));
        sb.append(one).append(" ").append(two).append("\n");

        System.out.println(sb);
    }

}
