package com.test.coding.baekjoon.math;

import java.io.*;
import java.util.StringTokenizer;

/**
 *
 * $_2908의 설명
 * 패키지: com.test.coding.baekjoon.math
 * 알고리즘 분류: 수학, 구현
 * 문제: 상근이의 동생 상수는 수학을 정말 못한다. 상수는 숫자를 읽는데 문제가 있다. 이렇게 수학을 못하는 상수를 위해서 상근이는 수의 크기를 비교하는 문제를 내주었다. 상근이는 세 자리 수 두 개를 칠판에 써주었다.
 *      그 다음에 크기가 큰 수를 말해보라고 했다.
 *      상수는 수를 다른 사람과 다르게 거꾸로 읽는다. 예를 들어, 734와 893을 칠판에 적었다면, 상수는 이 수를 437과 398로 읽는다. 따라서, 상수는 두 수중 큰 수인 437을 큰 수라고 말할 것이다.
 *      두 수가 주어졌을 때, 상수의 대답을 출력하는 프로그램을 작성하시오.
 * 입력: 첫째 줄에 상근이가 칠판에 적은 두 수 A와 B가 주어진다. 두 수는 같지 않은 세 자리 수이며, 0이 포함되어 있지 않다.
 * 출력: 첫째 줄에 상수의 대답을 출력한다.
 * 주의사항:
 * 일시: 2024. 03. 13.
 * 정답율: 68%
 * 수행시간: 128ms
**/
public class $_2908 {

    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))){

            StringTokenizer st = new StringTokenizer(br.readLine());
            String a = st.nextToken(), b = st.nextToken();

            //첫 번째 문자열의 char[] '7', '3', '4'
            char[] chars = a.toCharArray();
            char[] reserveC = new char[a.length()], reserveCC = new char[b.length()];

            for(int i = 0, j = chars.length - 1; i < chars.length; i++, j--){
                reserveC[i] = chars[j];
            }

            //두 번째 문자열의 char[] '8', '9', '3'
            chars = b.toCharArray();

            for(int i = 0, j = chars.length - 1; i < chars.length; i++, j--){
                reserveCC[i] = chars[j];
            }

            int f = Integer.parseInt(new String(reserveC)), ff = Integer.parseInt(new String(reserveCC));

            //두 수를 비교하는 logic
            //BigInteger 를 사용한다면 더욱 효율적일끼?
            if(f < ff) bw.write(String.valueOf(ff));
            else bw.write(String.valueOf(f));

        } catch (IOException e){
            e.printStackTrace();
        }
    }

}
