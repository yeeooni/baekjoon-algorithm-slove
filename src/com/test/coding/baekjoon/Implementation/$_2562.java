package com.test.coding.baekjoon.array;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * $_2562 의 설명
 * 패키지: com.test.coding.baekjoon.array
 * 알고리즘 분류:
 * 문제: 9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 번째 수인지를 구하는 프로그램을 작성하시오.
 *      예를 들어, 서로 다른 9개의 자연수 3, 29, 38, 12, 57, 74, 40, 85, 61 이 주어지면, 이들 중 최댓값은 85이고, 이 값은 8번째 수이다.
 * 입력: 첫째 줄부터 아홉 번째 줄까지 한 줄에 하나의 자연수가 주어진다. 주어지는 자연수는 100 보다 작다.
 * 출력: 첫째 줄에 최댓값을 출력하고, 둘째 줄에 최댓값이 몇 번째 수인지를 출력한다.
 * 주의사항:
 * 일시: 2024. 03. 22.
 * 정답율: 45%
 * 수행시간: 136ms
**/
public class $_2562 {

    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))){

            String str;
            Map<Integer, Integer> map = new HashMap<>();

            int i = 0;
            while((str = br.readLine()) != null){
                i++;
                map.put(i, Integer.parseInt(str));
            }

            map.entrySet().stream().max(Map.Entry.comparingByValue()).ifPresent(m -> {
                try {
                    bw.write(m.getValue() + "\n" + m.getKey());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });

            bw.flush();
        }catch (IOException e){
            e.printStackTrace();
            //System.err.print(ioe.getMessage());
        }
    }

}
