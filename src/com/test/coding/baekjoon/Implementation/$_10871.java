package com.test.coding.baekjoon.Implementation;

import java.io.*;
import java.util.StringTokenizer;

/**
 *
 * $_10871 의 설명
 * 패키지: com.test.coding.baekjoon.Implementation
 * 알고리즘 분류: 구현
 * 문제: 정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.
 * 입력: 첫째 줄에 N과 X가 주어진다. (1 ≤ N, X ≤ 10,000)
 *      둘째 줄에 수열 A를 이루는 정수 N개가 주어진다. 주어지는 정수는 모두 1보다 크거나 같고, 10,000보다 작거나 같은 정수이다.
 * 출력: X보다 작은 수를 입력받은 순서대로 공백으로 구분해 출력한다. X보다 작은 수는 적어도 하나 존재한다.
 * 주의사항: N은 사용하지 않아도 됨
 * 일시: 2024. 11. 2.
 * 정답율: 54%
 * 수행시간: 152ms
**/
public class $_10871 {

    static short x = 0;

    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))){

            //n 이라는 값은 필요가 없음
            StringTokenizer st = new StringTokenizer(br.readLine());

            while(st.hasMoreTokens()){
                x = Short.parseShort(st.nextToken());
            }

            String[] strings = br.readLine().split(" "); //공백으로 나누어 계산
            for(String string : strings){
                if(x > Integer.parseInt(string)) bw.write(string + " ");
            }

            bw.flush();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

}
