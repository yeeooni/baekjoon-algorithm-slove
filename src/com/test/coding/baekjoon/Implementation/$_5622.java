package com.test.coding.baekjoon.Implementation;

import java.io.*;

/**
 *
 * $_5622 의 설명
 * 패키지: com.test.coding.baekjoon.Implementation
 * 알고리즘 분류: 구현
 * 문제: 상근이의 할머니는 아래 그림과 같이 오래된 다이얼 전화기를 사용한다.
 *      전화를 걸고 싶은 번호가 있다면, 숫자를 하나를 누른 다음에 금속 핀이 있는 곳 까지 시계방향으로 돌려야 한다. 숫자를 하나 누르면 다이얼이 처음 위치로 돌아가고, 다음 숫자를 누르려면 다이얼을 처음 위치에서 다시 돌려야 한다.
 *      숫자 1을 걸려면 총 2초가 필요하다. 1보다 큰 수를 거는데 걸리는 시간은 이보다 더 걸리며, 한 칸 옆에 있는 숫자를 걸기 위해선 1초씩 더 걸린다.
 *      상근이의 할머니는 전화 번호를 각 숫자에 해당하는 문자로 외운다. 즉, 어떤 단어를 걸 때, 각 알파벳에 해당하는 숫자를 걸면 된다. 예를 들어, UNUCIC는 868242와 같다.
 *      할머니가 외운 단어가 주어졌을 때, 이 전화를 걸기 위해서 필요한 최소 시간을 구하는 프로그램을 작성하시오.
 * 입력: 첫째 줄에 알파벳 대문자로 이루어진 단어가 주어진다. 단어의 길이는 2보다 크거나 같고, 15보다 작거나 같다.
 * 출력: 첫째 줄에 다이얼을 걸기 위해서 필요한 최소 시간을 출력한다.
 * 주의사항:
 * 일시: 2024. 10. 15.
 * 정답율: 58%
 * 수행시간: 104ms
**/
public class $_5622 {

    private static final String ALPABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))){

            String[] strings = new String[ALPABET.length() / 3];

            //입력된 알파벳을 char 배열로 표현 e.g., 'W', 'A'
            char[] chars = br.readLine().toCharArray();
            int time = 0;

            //알파벳의 총 길이는 26 / 3 = 8 길이의 배열이 생성됨
            for(int i = 0; i < strings.length; i++){
                strings[i] = ALPABET.substring(i * 3, (i * 3) + 3);

                //첫 번째 PQRS
                if(i == 5) strings[i] = ALPABET.substring(i * 3, (i * 3) + 4);
                //두 번째 WXYZ
                else if(i == 7)  strings[i] = ALPABET.substring((i * 3) + 1);
            }

            //"ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"
            // 0, 1, 2, 3, 4, 5, 6, 7
            // 3초, 4초, 5초, 6초, 7초, 8초, 9초, 10초

            for(int i = 0; i < chars.length; i++){
                for(int j = 0; j < strings.length; j++){
                    if(strings[j].contains(Character.toString(chars[i])))
                        time += j + 3;
                }
            }

            //출력된 시간
            bw.write(String.valueOf(time));
            bw.flush();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

}
