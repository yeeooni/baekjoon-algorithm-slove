package com.test.coding.baekjoon.math;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

/**
 *
 * $_5522 의 설명
 * 패키지: com.test.coding.baekjoon.math
 * 알고리즘 분류: 수학, 사칙연산
 * 문제: JOI군은 카드 게임을 하고 있다. 이 카드 게임은 5회의 게임으로 진행되며, 그 총점으로 승부를 하는 게임이다.
 *      JOI군의 각 게임의 득점을 나타내는 정수가 주어졌을 때, JOI군의 총점을 구하는 프로그램을 작성하라.
 * 입력: 표준 입력에서 다음과 같은 데이터를 읽어온다.
 *      i 번째 줄(1 ≤ i ≤ 5)에는 정수 Ai가 적혀있다. 이것은 i번째 게임에서의 JOI군의 점수를 나타낸다.
 * 출력: 표준 출력에 JOI군의 총점을 한 줄로 출력하라.
 * 주의사항:
 * 일시: 2024. 11. 5.
 * 정답율: 82%
 * 수행시간: 176ms
**/
public class $_5522 {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int sum = 0;

        while(true){
            int n = scanner.nextInt();
            sum += n;
            if(!scanner.hasNextInt()) break;
        }

        bw.write(String.valueOf(sum));
        bw.flush();
        scanner.close();
    }

}
