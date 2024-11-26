package com.test.coding.baekjoon.dynamic_programming;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * $_11660 의 설명
 * 패키지: com.test.coding.baekjoon.dynamic_programming
 * 알고리즘 분류: 다이나믹프로그래밍(DP), 누적합
 * 문제: N×N개의 수가 N×N 크기의 표에 채워져 있다. (x1, y1)부터 (x2, y2)까지 합을 구하는 프로그램을 작성하시오. (x, y)는 x행 y열을 의미한다.
 *      예를 들어, N = 4이고, 표가 아래와 같이 채워져 있는 경우를 살펴보자.
 *     +---------------+
 *     | 1	 2	 3	 4 |
 *     | 2	 3	 4	 5 |
 *     | 3	 4	 5	 6 |
 *     | 4	 5	 6	 7 |
 *     +---------------+
 *      여기서 (2, 2)부터 (3, 4)까지 합을 구하면 3+4+5+4+5+6 = 27이고, (4, 4)부터 (4, 4)까지 합을 구하면 7이다.
 *      표에 채워져 있는 수와 합을 구하는 연산이 주어졌을 때, 이를 처리하는 프로그램을 작성하시오.
 * 입력: 첫째 줄에 표의 크기 N과 합을 구해야 하는 횟수 M이 주어진다. (1 ≤ N ≤ 1024, 1 ≤ M ≤ 100,000) 둘째 줄부터 N개의 줄에는 표에 채워져 있는 수가 1행부터 차례대로 주어진다. 다음 M개의 줄에는 네 개의 정수 x1, y1, x2, y2 가 주어지며, (x1, y1)부터 (x2, y2)의 합을 구해 출력해야 한다. 표에 채워져 있는 수는 1,000보다 작거나 같은 자연수이다. (x1 ≤ x2, y1 ≤ y2)
 * 출력: 총 M줄에 걸쳐 (x1, y1)부터 (x2, y2)까지 합을 구해 출력한다.
 * 주의사항:
 * 일시: 2024. 11. 27.
 * 정답율: 43%
 * 수행시간: 2172ms
**/
public class $_11660 {

    //표의크기 n, 합을 구해야하는 횟수 m
    // x1, y1, x2, y2

    //원본배열 받기
    //합배열 구하기
    // -> 합배열 공식 s[i][j] = s[i][j-1] + s[i-1][j] - s[i-1][j-1] + o[i][j]

    //구간합 구하기
    // -> 구간합 공식 s[x2][y2] - s[x1-1][y2] - s[x2][y1-1] + o[x1-1][y1-1];
    static int n, m;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(scanner.nextLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        int[][] o = new int[n+1][n+1]; //7 맨 앞 0으로 초기화
        int[][] s = new int[n+1][n+1]; //7 맨 앞 0으로 초기화

        for(int i = 1; i <= n; i++){
            st = new StringTokenizer(scanner.nextLine());
            for(int j = 1; j <= n; j++){
                o[i][j] = Integer.parseInt(st.nextToken());   //원본배열 값 넣기
            }
        }

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                s[i][j] = s[i][j-1] + s[i-1][j] - s[i-1][j-1] + o[i][j];   //합배열 구하기
            }
        }

        int x1, y1, x2, y2, result;

        for(int i = 0; i < m; i++){
            st = new StringTokenizer(scanner.nextLine());
            x1 = Integer.parseInt(st.nextToken());
            y1 = Integer.parseInt(st.nextToken());
            x2 = Integer.parseInt(st.nextToken());
            y2 = Integer.parseInt(st.nextToken());

            result = s[x2][y2] - s[x1 - 1][y2] - s[x2][y1 - 1] + s[x1 - 1][y1 - 1]; //구간합 구하기
            System.out.println(result);
        }
        scanner.close();
    }

}
