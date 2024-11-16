package com.test.coding.baekjoon.Implementation;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * $_30087 의 설명
 * 패키지: com.test.coding.baekjoon.Implementation
 * 알고리즘 분류: 구현
 * 문제: 한국정보기술진흥원에서는 다양한 세미나가 열린다.
 *      전문가를 위한 알고리즘, 데이터분석, 인공지능, 사이버보안, 네트워크 세미나뿐만 아니라 예비 창업가를 위한 창업 세미나, 그리고 청소년들을 위한 입시 세미나가 열린다.
 *      오늘은 위 $7$개 주제의 세미나가 모두 열리는 날이다. 진흥이는 이 중 $N$ ($1 \le N \le 7$) 개의 세미나를 신청했다. 아래의 표를 보고 어느 교실에서 열리는지 알아보자.
 *      +----------------------------------+
 *      |세미나                   |   교실   |
 *      |Algorithm               |   204   |
 *      |DataAnalysis            |   207   |
 *      |ArtificialIntelligence  |   302   |
 *      |CyberSecurity           |   B101  |
 *      |Network                 |   303   |
 *      |Startup                 |   501   |
 *      |TestStrategy            |   105   |
 *      +----------------------------------+
 * 입력: 첫 번째 줄에 진흥이가 신청한 세미나의 수 $N$이 주어진다.
 *      두 번째 줄부터 $N$개의 줄에 진흥이가 신청한 세미나의 목록이 주어진다. 세미나는 지문의 표에 있는 $7$개 중 하나로 주어지며, 중복되는 세미나는 없다.
 * 출력:  $N$개의 줄에 걸쳐서 각 세미나가 어느 교실에서 열리는지 한 줄에 하나씩 출력한다.
 * 주의사항:
 * 일시: 2024. 11. 16.
 * 정답율: 73%
 * 수행시간: 172ms
**/
public class $_30087 {

    private static HashMap<String, String> hashmap = new HashMap<>();

    public static HashMap<String, String> getHashmap() {
        return hashmap;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        hashmap.put("Algorithm", "204");
        hashmap.put("DataAnalysis", "207");
        hashmap.put("ArtificialIntelligence", "302");
        hashmap.put("CyberSecurity", "B101");
        hashmap.put("Network", "303");
        hashmap.put("Startup", "501");
        hashmap.put("TestStrategy", "105");

        while(n > 0){
            n--;
            String str = scanner.next();
            if(hashmap.containsKey(str))
                System.out.println(hashmap.get(str).toString());
        }

        scanner.close();
    }

}
