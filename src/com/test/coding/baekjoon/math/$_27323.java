package com.test.coding.baekjoon.math;

import java.util.Scanner;

/**
 *
 * $_27323 의 설명
 * 패키지: com.test.coding.baekjoon.math
 * 알고리즘 분류: 수학, 기하학, 사칙연산
 * 문제: 정수 A, B 가 주어진다. 세로 길이가 A cm, 가로 길이가 B cm 인 아래와 같은 직사각형의 넓이를 cm2 단위로 구하시오.
 * 입력: 표준 입력에 다음과 같은 형태로 입력이 주어진다.
 *      -----------------------------------
 *      A
 *      B
 *      -----------------------------------
 * 출력: 세로 길이가 A cm, 가로 길이가 B cm인 직사각형의 넓이를 cm2 단위로 구하고, 단위 (cm2)를 생략하여 출력한다.
 * 주의사항:
 * 일시: 2024. 11. 4.
 * 정답율: 87%
 * 수행시간: 168ms
**/
public class $_27323 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNextInt()) {
            //높이(height) * 넓이(width)
            int h = scanner.nextInt(), w = scanner.nextInt();
            System.out.print(h * w);
        }
        scanner.close();
    }

}
