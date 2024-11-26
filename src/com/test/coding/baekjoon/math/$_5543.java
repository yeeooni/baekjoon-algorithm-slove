package com.test.coding.baekjoon.math;

import java.util.Scanner;

/**
 *
 * $_5543 의 설명
 * 패키지: com.test.coding.baekjoon.math
 * 알고리즘 분류: 수학, 사칙연산
 * 문제: 상근날드에서 가장 잘 팔리는 메뉴는 세트 메뉴이다. 주문할 때, 자신이 원하는 햄버거와 음료를 하나씩 골라, 세트로 구매하면, 가격의 합계에서 50원을 뺀 가격이 세트 메뉴의 가격이 된다.
 *      햄버거는 총 3종류 상덕버거, 중덕버거, 하덕버거가 있고, 음료는 콜라와 사이다 두 종류가 있다.
 *      햄버거와 음료의 가격이 주어졌을 때, 가장 싼 세트 메뉴의 가격을 출력하는 프로그램을 작성하시오.
 * 입력: 입력은 총 다섯 줄이다. 첫째 줄에는 상덕버거, 둘째 줄에는 중덕버거, 셋째 줄에는 하덕버거의 가격이 주어진다. 넷째 줄에는 콜라의 가격, 다섯째 줄에는 사이다의 가격이 주어진다. 모든 가격은 100원 이상, 2000원 이하이다.
 * 출력: 첫째 줄에 가장 싼 세트 메뉴의 가격을 출력한다.
 * 주의사항:
 * 일시: 2024. 11. 26.
 * 정답율: 68%
 * 수행시간: 172ms
**/
public class $_5543 {

    final static int SET_PRICE = 50;
    static int min = 2000;

    //가격이 가장 낮은 것을 찾는다.
    //버거, 음료를 각각 저장하여 처리한다.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] burgers = new int[3];
        int[] drinks = new int[2];

        int burger = 0, drink = 0;

        for(int i = 0; i < burgers.length; i++){
            burgers[i] = scanner.nextInt();
            min = Math.min(min, burgers[i]);
        }

        burger = min;

        for(int i = 0; i < drinks.length; i++){
            drinks[i] = scanner.nextInt();
            min = Math.min(min, drinks[i]);
        }

        scanner.close();

        drink = min;

        System.out.println((burger + drink) - SET_PRICE);
    }

}
