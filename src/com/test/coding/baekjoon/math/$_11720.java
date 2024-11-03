package com.test.coding.baekjoon.math;

import java.io.*;

/**
 *
 * $_11720 의 설명
 * 패키지: com.test.coding.baekjoon.strings
 * 알고리즘 분류: 수학, 구현, 문자열
 * 문제: N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
 * 입력: 첫째 줄에 숫자의 개수 N (1 ≤ N ≤ 100)이 주어진다. 둘째 줄에 숫자 N개가 공백없이 주어진다.
 * 출력: 입력으로 주어진 숫자 N개의 합을 출력한다.
 * 주의사항:
 * 일시: 2024. 10. 15.
 * 정답율: 56%
 * 수행시간: 104ms
**/
public class $_11720 {

    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))){
            int n = Integer.parseInt(br.readLine()), sum = 0;
            char[] chars = br.readLine().toCharArray();

            for(char c : chars){
                sum += Character.getNumericValue(c);
            }

            bw.write(String.valueOf(sum));
            bw.flush();
        }catch(IOException e){
            e.printStackTrace();
        }
    }

}
