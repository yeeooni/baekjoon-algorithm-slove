package com.test.coding.baekjoon.math;

import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

/**
 *
 * $_2420 의 설명
 * 패키지: com.test.coding.baekjoon.math
 * 알고리즘 분류: 수학, 구현, 사칙연산
 * 문제: 사파리월드는 인터넷으로만 존재하는 미스테리한 나라이다.
 *      사파리월드에는 2개의 서브도메인이 seunghwan.royal.gov.sw와 kyuhyun.royal.gov.sw 이 있는데, 이것이 couple.royal.gov.sw으로 합쳐질 것이다.
 *      그러나 도메인 관리 센터 SWNIC(센터장: 김동규)에는 엄격한 룰이 있다. 두 서브도메인을 합칠 때, 유명도의 차이가 너무 차이나지 않을 경우에만 두 서브도메인을 결혼시키는 것이다.
 *      서브도메인의 유명도는 정수이다. 두 서브도메인의 유명도가 주어졌을 때, 그 차이를 구하는 프로그램을 작성하시오.
 * 입력: 첫째 줄에 두 도메인의 유명도 N과 M이 주어진다. (-2,000,000,000 ≤ N, M ≤ 2,000,000,000)
 * 출력: 첫째 줄에 두 유명도의 차이 (|N-M|)을 출력한다.
 * 주의사항: n과 m의 크기에 유의한다.
 * 일시: 2024. 11. 2.
 * 정답율: 46%
 * 수행시간: 104ms
**/
public class $_2420 {

    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            long n = 0, m = 0;

            StringTokenizer st = new StringTokenizer(br.readLine());
            while (st.hasMoreTokens()) {
                n = Long.parseLong(st.nextToken());
                m = Long.parseLong(st.nextToken());
            }
            BigInteger bigInteger = new BigInteger(String.valueOf(n - m));

            bw.write(bigInteger.abs().toString());

            bw.flush();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

}
