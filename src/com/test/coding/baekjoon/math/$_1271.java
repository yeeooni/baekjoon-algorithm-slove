package com.test.coding.baekjoon.math;

import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

/**
 *
 * $_1271 의 설명
 * 패키지: com.test.coding.baekjoon.math
 * 알고리즘 분류: 수학, 사칙연산, 임의 정밀도/큰 수 연산
 * 문제: 갑부 최백준 조교는 동전을 최소로 바꾸는데 성공했으나 김재홍 조교가 그 돈을 발견해서 최백준 조교에게 그 돈을 나누자고 따진다.
 *      그 사실이 전 우주로 알려지자 우주에 있던 많은 생명체들이 자신들에게 돈을 분배해 달라고 당장 달려오기 시작했다.
 *      프로토스 중앙 우주 정부의 정책인, ‘모든 지적 생명체는 동등하다’라는 규칙에 입각해서 돈을 똑같이 분배하고자 한다.
 *      한 생명체에게 얼마씩 돈을 줄 수 있는가?
 *      또, 생명체들에게 동일하게 분배한 후 남는 돈은 얼마인가?
 * 입력: 첫째 줄에는 최백준 조교가 가진 돈 n과 돈을 받으러 온 생명체의 수 m이 주어진다. (1 ≤ m ≤ n ≤ 101000, m과 n은 10진수 정수)
 * 출력: 첫째 줄에 생명체 하나에게 돌아가는 돈의 양을 출력한다. 그리고 두 번째 줄에는 1원씩 분배할 수 없는 남는 돈을 출력한다.
 * 주의사항:
 * 일시: 2024. 11. 4.
 * 정답율: 34%
 * 수행시간: 104ms
**/
public class $_1271 {

    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))){

            StringTokenizer st = new StringTokenizer(br.readLine());
            //최백준 조교의 돈 n, 외계 생명체의 수 m
            //1 <= m <= n < '10^1000', m 과 n 은 10진수 정수이다.
            //int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
            //System.out.println(n / m);
            //System.out.println(n % m);

            BigInteger n = new BigInteger(st.nextToken()), m = new BigInteger(st.nextToken());

            //첫 줄은 한 외계인이 받을 수 있는 금액 (몫)
            //두번째 줄은 나머지
            bw.write(n.divide(m).toString());
            bw.newLine();
            bw.write(n.mod(m).toString());

            bw.flush();
        }catch(IOException e){
            e.printStackTrace();
        }
    }

}
