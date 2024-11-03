package com.test.coding.baekjoon.Implementation;

import java.io.*;

/**
 *
 * $_2744 의 설명
 * 패키지: com.test.coding.baekjoon.Implementation
 * 알고리즘 분류: 구현
 * 문제: 영어 소문자와 대문자로 이루어진 단어를 입력받은 뒤, 대문자는 소문자로, 소문자는 대문자로 바꾸어 출력하는 프로그램을 작성하시오.
 * 입력: 첫째 줄에 영어 소문자와 대문자로만 이루어진 단어가 주어진다. 단어의 길이는 최대 100이다.
 * 출력: 첫째 줄에 입력으로 주어진 단어에서 대문자는 소문자로, 소문자는 대문자로 바꾼 단어를 출력한다
 * 주의사항:
 * 일시: 2024. 11. 3.
 * 정답율: 75%
 * 수행시간: 104ms
**/
public class $_2744 {

    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))){

            String str = br.readLine();
            char[] chars = str.toCharArray();

            for(int i = 0; i < chars.length; i++){
                if(chars[i] > 90) chars[i] = Character.toUpperCase(chars[i]);
                else chars[i] = Character.toLowerCase(chars[i]);
            }

            bw.write(String.valueOf(chars));
            bw.flush();
        }catch(IOException e){
            e.printStackTrace();
        }
    }

}
