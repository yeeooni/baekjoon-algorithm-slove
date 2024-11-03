package com.test.coding.baekjoon.Implementation;

import java.io.*;

/**
 *
 * $_11654 의 설명
 * 패키지: com.test.coding.baekjoon.Implementation
 * 알고리즘 분류: 구현
 * 문제: 알파벳 소문자, 대문자, 숫자 0-9중 하나가 주어졌을 때, 주어진 글자의 아스키 코드값을 출력하는 프로그램을 작성하시오.
 * 입력: 알파벳 소문자, 대문자, 숫자 0-9 중 하나가 첫째 줄에 주어진다.
 * 출력: 입력으로 주어진 글자의 아스키 코드 값을 출력한다.
 * 주의사항:
 * 일시: 2024. 11. 2.
 * 정답율: 81%
 * 수행시간: 112ms
**/
public class $_11654 {

    public static void main(String[] args){
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))){

            char ch= br.readLine().charAt(0);
            bw.write(String.valueOf((int) ch));

            bw.flush();
        }catch(IOException ioe){
            ioe.printStackTrace();
        }
    }

}