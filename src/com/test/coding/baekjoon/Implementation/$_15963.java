package com.test.coding.baekjoon.Implementation;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * $_15963 의 설명
 * 패키지: com.test.coding.baekjoon.Implementation
 * 알고리즘 분류: 구현
 * 문제: 카시오 계산기는 만능 계산기이다. 시험을 한 번이라도 쳐본 일곽인이라면, 이 카시오의 소중함에 대해서 뼈저리게 느껴보았을 것이다. 하지만, 이런 카시오에도 함정이 있다. 바로, 카시오 계산기는 배터리를 통해 돌아간다는 것이다.
 *      송찬이는 시험을 치다가 갑자기 계산기의 배터리가 나가버렸다. 그래서 선생님께 배터리를 달라고 요구했는데, 요구하고 보니 카시오 계산기의 배터리가 어떤 종류인지 말을 안 해버렸다! 과연 선생님은 송찬이가 필요한 배터리 종류를 들고 왔을까?
 * 입력: 송찬이가 필요한 배터리 N과 선생님이 가져온 배터리 M이 입력된다.
 *      N과 M은 둘다 최대 10자리 정수까지 들어올 수 있다.
 * 출력: 송찬이가 원한 배터리면 1을, 그 외엔 0을 출력한다.
 * 주의사항: 최대 10자리 정수가 들어올 수 있다는 점을 잘 생각해야한다.
 * 일시: 2024. 11. 11.
 * 정답율: 64%
 * 수행시간: 168ms
**/
public class $_15963 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger n = new BigInteger(scanner.next());
        BigInteger m = new BigInteger(scanner.next());

        if(n.longValue() == m.longValue()){
            System.out.print("1");
        }else {
            System.out.print("0");
        }

        scanner.close();
    }

}
