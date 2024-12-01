package com.test.coding.baekjoon.math;

import java.util.Scanner;

/**
 *
 * $_28113 의 설명
 * 패키지: com.test.coding.baekjoon.math
 * 알고리즘 분류: 수학, 구현, 사칙연산
 * 문제: 숭실대학교 정보과학관은 숭실대입구역으로부터 멀리 떨어져 있는 대신, 바로 앞에 숭실대별관앞이라는 명칭의 버스 정류소가 자리 잡고 있다.
 *      학부 연구생 찬솔이는 야근을 마치고 대중교통을 이용해 집에 가려고 한다. 다행히 아슬아슬하게 막차가 끊기지 않은 상황인데, 구체적으로 $A$분 뒤에 숭실대별관앞 정류소에 집으로 가는 마지막 버스가 도착하고, $B$분 뒤에 숭실대입구역에 집으로 가는 마지막 열차가 도착한다.
 *      찬솔이는 지금 버스 정류소에 서 있다. 그런데, 찬솔이는 지하철 역까지 걸어가서 지하철을 타는 것이 여기서 버스를 타는 것 보다 빠를 수도 있다는 사실을 알아차려 버렸다. 숭실대입구역의 지하철 승강장까지 걸어가는데는 $N$분이 걸린다. 버스와 지하철 중 더 먼저 탈 수 있는 것이 무엇인지 알려줘서 야근한 찬솔이의 피로를 회복시켜 주자.
 *      단, 버스와 지하철이 도착한 뒤 탑승하는 데 걸리는 시간은 신경 쓰지 않고, 버스와 지하철 모두 도착한 직후에 승객을 태운 뒤 기다리지 않고 바로 떠난다. 또한 지하철 역에 도착하는 시간과 지하철 열차가 도착하는 시간이 정확히 같다면 지하철을 탈 수 있다.
 * 입력: 첫째 줄에 $N,A,B$가 공백으로 구분되어 주어진다.
 * 출력: 버스에 더 먼저 탑승할 수 있으면 Bus, 지하철에 더 먼저 탑승할 수 있으면 Subway, 버스와 지하철에 탑승하게 되는 시간이 동일하면 Anything 을 출력한다.
 * 주의사항: 다 필요없고 A와 B만 비교해서 처리하면 끝남. (혼란을 주는 문제임)
 * 일시: 2024. 11. 19.
 * 정답율:
 * 수행시간:
**/
public class $_28113 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //n 은 사용하지 않음, a 와 b 만 비교하면 됨

        //a: 버스가 정류장에 도착하는 시간
        //b: 버스 정류장에서 지하철역으로 걸어가는 시간

        //**여기서 중요한 것은 버스나 지하철의 탑승시 걸리는 시간은 신경쓰지 않는다는 것.** (타기 전 시간이 중요하다는 것을 알 수 있음!)
        int n = scanner.nextInt(), a = scanner.nextInt(), b = scanner.nextInt();
        if(a < b) System.out.println("Bus");
        else if(b < a) System.out.println("Subway");
        else System.out.println("Anything");

        scanner.close();
    }

}