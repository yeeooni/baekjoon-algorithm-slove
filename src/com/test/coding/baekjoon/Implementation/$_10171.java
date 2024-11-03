package com.test.coding.baekjoon.Implementation;

import java.io.*;

/**
 *
 * $_10171 의 설명
 * 패키지: com.test.coding.baekjoon.input_output_and_arithmetic_operations
 * 알고리즘 분류: 구현
 * 문제: 아래 예제와 같이 고양이를 출력하시오.
 * 입력: 없음
 * 출력: 고양이를 출력한다.
 * 주의사항: 이스케이프 문자처리를 못하면 망함. 공백 문자를 잘 생각하고 입력한다.
 * 일시: 2024. 10. 15.
 * 정답율: 35%
 * 수행시간: 120ms
**/
public class $_10171 {

    public static void main(String[] args) {
        try(BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))){
            StringBuilder sb = new StringBuilder();

            sb.append("\\    /\\\n");
            sb.append(" )  ( ')\n");
            sb.append("(  /  )\n");
            sb.append(" \\(__)|");

            bw.write(sb.toString());
            bw.flush();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

}
