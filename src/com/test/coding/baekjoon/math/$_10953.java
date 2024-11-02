package com.test.coding.baekjoon.math;

import java.io.*;

/**
 *
 * $_10953 의 설명
 * 패키지: com.test.coding.baekjoon.math
 * 알고리즘 분류: 수학, 문자열, 사칙연산, 파싱
 * 문제: 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 * 입력: 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
 *      각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. A와 B는 콤마(,)로 구분되어 있다. (0 < A, B < 10)
 * 출력: 각 테스트 케이스마다 A+B를 출력한다.
 * 주의사항:
 * 일시: 2024. 11. 2.
 * 정답율: 68.815%
 * 수행시간: 104ms
**/
public class $_10953 {

    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))){

            int t = Integer.parseInt(br.readLine());
            print(t, br, bw);

        }catch (IOException e){
            e.printStackTrace();
        }
    }

    static void print(int t, BufferedReader br, BufferedWriter bw) throws IOException {
        String[] strings;

        for(int i = 1; i <=t; i++){
            strings = br.readLine().split(",");
            int result = Integer.parseInt(strings[0]) + Integer.parseInt(strings[1]);

            bw.write(result + "");
            bw.newLine();
        }

        bw.flush();
    }

}
