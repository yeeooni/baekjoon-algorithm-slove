package com.test.coding.baekjoon.math;

import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

/**
 *
 * $_15964 의 설명
 * 패키지: com.test.coding.baekjoon.math
 * 알고리즘 분류: 수학, 구현, 사칙연산
 * 문제: 부산일과학고등학교의 효진이는 수학의 귀재이다. 어떤 문제라도 보면 1분 내에 풀어버린다는 학교의 전설이 내려올 정도였는데, 이런 킹ㅡ갓 효진에게도 고민이 생겼다. 대부분의 문제에서 반복되는 연산이 있었기 때문이다! 이 연산은 너무 길어서 종이에 풀던 효진이는 너무 고통스러워서, 자신이 새로 연산자를 만들기로 했다.
 *      연산자의 기호는 ＠으로, A＠B = (A+B)×(A-B)으로 정의내리기로 했다.
 *      하지만, 효진이는 막상 큰 숫자가 들어오자 계산하기 너무 귀찮아졌다.
 *      효진이를 도와 정수 A, B가 주어지면 A＠B를 계산하는 프로그램을 만들어주자!
 * 입력: 첫째 줄에 A, B가 주어진다. (1 ≤ A, B ≤ 100,000)
 * 출력: 첫째 줄에 A＠B의 결과를 출력한다.
 * 주의사항:
 * 일시: 2024. 11. 4.
 * 정답율: 55%
 * 수행시간: 108ms
**/
public class $_15964 {

    //long range 2^63 - 2^63 - 1
    //-9223372036854775808 ~ 9223372036854775807

    static int a = 0, b = 0;

    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))){

            StringTokenizer st = new StringTokenizer(br.readLine());
            while(st.hasMoreTokens()){
                a = Integer.parseInt(st.nextToken());
                b = Integer.parseInt(st.nextToken());
            }

            bw.write(exec(a, b).toString());
            bw.flush();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    //(A+B)×(A-B)
    static BigInteger exec(int a, int b){
        //FIXME long 자료형의 범위를 초과하므로 BigInteger 를 사용하여 처리한다.
        BigInteger castA = new BigInteger(String.valueOf(a));
        BigInteger castB = new BigInteger(String.valueOf(b));
        return castA.add(castB).multiply(castA.subtract(castB));

        //long result = (a + b) * (a - b); //FIXME 부분점수 30점
        //return BigInteger.valueOf(result);
    }

}
