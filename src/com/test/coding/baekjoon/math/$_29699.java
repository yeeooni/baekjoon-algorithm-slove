package com.test.coding.baekjoon.math;

import java.util.Scanner;

/**
 *
 * $_29699 의 설명
 * 패키지: com.test.coding.baekjoon.math
 * 알고리즘 분류: 수학, 구현, 문자열, 사칙연산
 * 문제: 화은이는 제3회 SMUPC를 맞이하여 환영의 의미로 "WelcomeToSMUPC"가 반복적으로 적혀 있는 라벨지를 프린트했다. 라벨지에는 공백 없이 글자들이 이어져 있고 "WelcomeToSMUPC"의 마지막 글자인 C 이후에는 W부터 다시 "WelcomeToSMUPC"가 반복된다. $N$번째 글자가 있는 곳까지 라벨지를 자르려 할 때, $N$번째에는 어떤 글자가 있을지 구해보자.
 * 입력: 첫째 줄에 $N$($ 1 \leq N \leq 1\,000\,000$)이 주어진다.
 * 출력: 첫째 줄에 $N$번째에 해당하는 글자를 출력한다.
 * 주의사항:
 * 일시: 2024. 11. 20.
 * 정답율: 52%
 * 수행시간: 180ms
**/
public class $_29699 {

    private static final String str = "WelcomeToSMUPC";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        char[] chars = str.toCharArray();

        //1번부터 14번까지 각 문자에 숫자를 대입한다.
        //14번째 다음으로는 14+n 이다.
        //그러므로 14에서 나눈 나머지 값이 각 문자의 번지수이다.
        n = n % 14;

        //나누어떨어졌다는 것은 마지막번째 문자에 도달했다는 것.
        if(n == 0) System.out.println(chars[13]);
        else System.out.println(chars[n - 1]);

        scanner.close();
    }

}
