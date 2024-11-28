package com.test.coding.baekjoon.math;

import java.util.Scanner;

/**
 *
 * $_10039 의 설명
 * 패키지: com.test.coding.baekjoon.math
 * 알고리즘 분류: 수학, 사칙연산
 * 문제: 상현이가 가르치는 아이폰 앱 개발 수업의 수강생은 원섭, 세희, 상근, 숭, 강수이다.
 *      어제 이 수업의 기말고사가 있었고, 상현이는 지금 학생들의 기말고사 시험지를 채점하고 있다. 기말고사 점수가 40점 이상인 학생들은 그 점수 그대로 자신의 성적이 된다. 하지만, 40점 미만인 학생들은 보충학습을 듣는 조건을 수락하면 40점을 받게 된다. 보충학습은 거부할 수 없기 때문에, 40점 미만인 학생들은 항상 40점을 받게 된다.
 *      학생 5명의 점수가 주어졌을 때, 평균 점수를 구하는 프로그램을 작성하시오.
 * 입력: 입력은 총 5줄로 이루어져 있고, 원섭이의 점수, 세희의 점수, 상근이의 점수, 숭이의 점수, 강수의 점수가 순서대로 주어진다.
 *      점수는 모두 0점 이상, 100점 이하인 5의 배수이다. 따라서, 평균 점수는 항상 정수이다.
 * 출력: 첫째 줄에 학생 5명의 평균 점수를 출력한다.
 * 주의사항:
 * 일시: 2024. 11. 29.
 * 정답율: 62%
 * 수행시간: 172ms
**/
public class $_10039 {

    static int s;

    static {
        s = 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            int n = scanner.nextInt();

            if(n < 40) s += 40;
            else s += n;

            if(!scanner.hasNextInt()) break;
        }
        scanner.close();
        System.out.println(s / 5);
    }

}
