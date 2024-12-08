package com.test.coding.baekjoon.Implementation;

import java.util.Scanner;

/**
 *
 * $_10808 의 설명
 * 패키지: com.test.coding.baekjoon.Implementation
 * 알고리즘 분류: 구현, 문자열
 * 문제: 알파벳 소문자로만 이루어진 단어 S가 주어진다. 각 알파벳이 단어에 몇 개가 포함되어 있는지 구하는 프로그램을 작성하시오.
 * 입력: 첫째 줄에 단어 S가 주어진다. 단어의 길이는 100을 넘지 않으며, 알파벳 소문자로만 이루어져 있다.
 * 출력: 단어에 포함되어 있는 a의 개수, b의 개수, …, z의 개수를 공백으로 구분해서 출력한다.
 * 주의사항:
 * 일시: 2024. 12. 8.
 * 정답율: 68%
 * 수행시간: 172ms
**/
public class $_10808 {

    private final static String alphabet = "abcdefghijklmnopqrstuvwxyz";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        scanner.close();

        char[] alphabets = alphabet.toCharArray();
        char[] words = s.toCharArray();

        int count;
        //XXX 알파벳을 기준으로
        for(char alphabet : alphabets){
            count = 0;
            //XXX 주어진 단어와 비교하여 카운트를 출력한다.
            for(char word : words) {
                if(alphabet == word) count++;
            }
            System.out.print(count + " ");
        }

    }

}
