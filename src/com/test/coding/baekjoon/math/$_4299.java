package com.test.coding.baekjoon.math;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * $_4299 의 설명
 * 패키지: com.test.coding.baekjoon.math
 * 알고리즘 분류: 수학, 사칙연산
 * 문제: 너무 길어서 생략(https://www.acmicpc.net/problem/4299)
 * 입력: 첫째 줄에 두 팀 점수의 합과 차가 빈 칸으로 구분되어 주어진다. 축구 점수는 항상 음이 아닌 정수이고, 합과 차는 1000보다 작거나 같은 음이 아닌 정수이다.
 * 출력: 첫째 줄에 두 팀의 경기 결과를 출력한다. 득점을 많이 한 쪽을 먼저 출력한다. 만약, 그러한 합과 차를 갖는 경기 결과가 없다면, -1을 출력한다.
 * 주의사항: 문제가 너무 길어서, 전체를 다 읽는데 시간이 오래 걸린다. (이것은 전략... 다 읽지 않아도 충분히 풀 수 있다.)
 * 일시: 2024. 12. 4.
 * 정답율: 30%
 * 수행시간: 168ms
**/
public class $_4299 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(scanner.nextLine());
        scanner.close();

        //x + y = 3
        //x - y = 1
        //2x = 4
        //x = 2, y = 1

        //x + y = 3
        //x - y = 1
        //2y = 2
        //y = 1, x = 2

        int x, y;
        x = Integer.parseInt(st.nextToken());
        y = Integer.parseInt(st.nextToken());

        //XXX y 가 크다면 차에서 음수가 나올 수 있다.
        if(x < y) System.out.println(-1);
        else {
            int a = (x + y) / 2, b = (x - y) / 2;

            //XXX 결국, 연립방정식에서 도출한 식의 두 값을 더하거나, 빼면 기존의 입력된 값이 출력된다.
            if(a + b == x && a - b == y) System.out.println(a + " " + b);
            else System.out.println(-1);
        }
    }

}
