package com.test.coding.baekjoon.Implementation;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 *
 * $_2557의 설명
 * 패키지:  com.test.coding.baekjoon.Implementation
 * 알고리즘 분류: 구현
 * 문제: Hello World!를 출력하시오.
 * 입력: 없음
 * 출력: Hello World!를 출력하시오.
 * 주의사항:
 * 일시: 2024. 03. 09.
 * 정답율: 39%
 * 수행시간: 96ms
**/
public class $_2557 {

    public static void main(String[] args) {
        try(BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            bw.write("Hello World!");
            bw.flush();
        }catch(IOException e){
            e.printStackTrace();
        }
    }

}
