package com.test.coding.baekjoon.math;

import java.io.*;
import java.util.StringTokenizer;

/**
 *
 * $_2480 의 설명
 * 패키지: com.test.coding.baekjoon.math
 * 알고리즘 분류: 수학, 구현, 사칙연산, 많은 조건 분기
 * 문제: 1에서부터 6까지의 눈을 가진 3개의 주사위를 던져서 다음과 같은 규칙에 따라 상금을 받는 게임이 있다.
 *      같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다.
 *      같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다.
 *      모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.
 *      예를 들어, 3개의 눈 3, 3, 6이 주어지면 상금은 1,000+3×100으로 계산되어 1,300원을 받게 된다. 또 3개의 눈이 2, 2, 2로 주어지면 10,000+2×1,000 으로 계산되어 12,000원을 받게 된다. 3개의 눈이 6, 2, 5로 주어지면 그중 가장 큰 값이 6이므로 6×100으로 계산되어 600원을 상금으로 받게 된다.
 *      3개 주사위의 나온 눈이 주어질 때, 상금을 계산하는 프로그램을 작성 하시오.
 * 입력: 첫째 줄에 3개의 눈이 빈칸을 사이에 두고 각각 주어진다.
 * 출력: 첫째 줄에 게임의 상금을 출력 한다.
 * 주의사항: 조건문을 적절히 잘 사용할 줄 알아야 함.
 * 일시: 2024. 03. 20.
 * 정답율: 47%
 * 수행시간: 124ms
**/
public class $_2480 {

    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))){

            StringTokenizer st = new StringTokenizer(br.readLine());
            int money;
            int i = 0, ii = 0, iii = 0;

            while (st.hasMoreTokens()){
                i = Integer.parseInt(st.nextToken());
                ii = Integer.parseInt(st.nextToken());
                iii = Integer.parseInt(st.nextToken());
            }

            //계산식
            //같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다.
            //같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다.
            //모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.

            //삼항연산자를 사용함.
            money = (i == ii && i == iii) ? 10000 + i * 1000 : (i == ii || i == iii) ? 1000 + i * 100 : (ii == iii) ? 1000 + ii * 100 : Math.max(Math.max(i, ii), iii) * 100;

            bw.write(String.valueOf(money));
            bw.flush();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

}
