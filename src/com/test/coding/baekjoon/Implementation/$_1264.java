package com.test.coding.baekjoon.Implementation;

import java.util.Scanner;

/**
 *
 * $_1264 의 설명
 * 패키지: com.test.coding.baekjoon.Implementation
 * 알고리즘 분류: 구현, 문자열
 * 문제: 영문 문장을 입력받아 모음의 개수를 세는 프로그램을 작성하시오. 모음은 'a', 'e', 'i', 'o', 'u'이며 대문자 또는 소문자이다.
 * 입력: 입력은 여러 개의 테스트 케이스로 이루어져 있으며, 각 줄마다 영어 대소문자, ',', '.', '!', '?', 공백으로 이루어진 문장이 주어진다. 각 줄은 최대 255글자로 이루어져 있다.
 *      입력의 끝에는 한 줄에 '#' 한 글자만이 주어진다.
 * 출력: 각 줄마다 모음의 개수를 세서 출력한다.
 * 주의사항: 모음이 없다면 0이 출력되어야 한다.
 * 일시: 2024. 11. 22.
 * 정답율: 53%
 * 수행시간: 172ms
**/
public class $_1264 {
    // a e i o u
    // 대문자 or 소문자
    // ',', '.', '!', '?', 공백

    // # --> EoF
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(scanner.hasNext()){
            String str = scanner.nextLine().replaceAll("\\s","").toLowerCase();

            if("#".equals(str))break;
            count(str);
        }
        scanner.close();
    }

    static void count(String str){
        char[] chars = str.toCharArray();
        int count = 0;

        for(char c : chars){
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                count++;
            }

        }
        System.out.println(count);
    }

}
