package com.test.coding.baekjoon.Implementation;

import java.io.*;

/**
 *
 * $_4101 의 설명
 * 패키지: com.test.coding.baekjoon.Implementation
 * 알고리즘 분류: 구현
 * 문제: 두 양의 정수가 주어졌을 때, 첫 번째 수가 두 번째 수보다 큰지 구하는 프로그램을 작성하시오.
 * 입력: 입력은 여러 개의 테스트 케이스로 이루어져 있다. 각 테스트 케이스는 한 줄로 이루어져 있으며, 두 정수가 주어진다. 두 수는 백만보다 작거나 같은 양의 정수이다. 입력의 마지막 줄에는 0이 두 개 주어진다.
 * 출력: 각 테스트 케이스마다, 첫 번째 수가 두 번째 수보다 크면 Yes를, 아니면 No를 한 줄에 하나씩 출력한다.
 * 주의사항:
 * 일시: 2024. 11. 3.
 * 정답율: 50%
 * 수행시간: 104ms
**/
public class $_4101 {

    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))){

            String[] strings;

            while (true) {
                strings = br.readLine().split(" ");
                if(!"0".equals(strings[0])){
                    int i = Integer.parseInt(strings[0]), j = Integer.parseInt(strings[1]);
                    if( i  > j ) bw.write("Yes");
                    else bw.write("No");
                    bw.newLine();
                }
                else break;
            }

            bw.flush();
        }catch(IOException e){
            e.printStackTrace();
        }
    }

}
