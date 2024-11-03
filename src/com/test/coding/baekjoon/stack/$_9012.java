package com.test.coding.baekjoon.stack;

import java.io.*;
import java.util.Stack;

/**
 *
 * $_9012 의 설명
 * 패키지: com.test.coding.baekjoon.stack
 * 알고리즘 분류: 자료구조, 문자열, 스택
 * 문제: 괄호 문자열(Parenthesis String, PS)은 두 개의 괄호 기호인 ‘(’ 와 ‘)’ 만으로 구성되어 있는 문자열이다. 그 중에서 괄호의 모양이 바르게 구성된 문자열을 올바른 괄호 문자열(Valid PS, VPS)이라고 부른다.
 *      한 쌍의 괄호 기호로 된 “( )” 문자열은 기본 VPS 이라고 부른다. 만일 x 가 VPS 라면 이것을 하나의 괄호에 넣은 새로운 문자열 “(x)”도 VPS 가 된다. 그리고 두 VPS x 와 y를 접합(concatenation)시킨 새로운 문자열 xy도 VPS 가 된다. 예를 들어 “(())()”와 “((()))” 는 VPS 이지만 “(()(”, “(())()))” , 그리고 “(()” 는 모두 VPS 가 아닌 문자열이다.
 *      여러분은 입력으로 주어진 괄호 문자열이 VPS 인지 아닌지를 판단해서 그 결과를 YES 와 NO 로 나타내어야 한다.
 * 입력: 입력 데이터는 표준 입력을 사용한다. 입력은 T개의 테스트 데이터로 주어진다. 입력의 첫 번째 줄에는 입력 데이터의 수를 나타내는 정수 T가 주어진다. 각 테스트 데이터의 첫째 줄에는 괄호 문자열이 한 줄에 주어진다. 하나의 괄호 문자열의 길이는 2 이상 50 이하이다.
 * 출력: 출력은 표준 출력을 사용한다. 만일 입력 괄호 문자열이 올바른 괄호 문자열(VPS)이면 “YES”, 아니면 “NO”를 한 줄에 하나씩 차례대로 출력해야 한다.
 * 주의사항: 스택의 삽입&삭제 구조 개념이 선행학습 되어야 함
 * 일시: 2024. 03. 25.
 * 정답율: 45%
 * 수행시간: 136ms
**/

public class $_9012 {

    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))){

            int t = Integer.parseInt(br.readLine());
            Stack<Character> stack = new Stack<>();

            for(int i = 0; i < t; i++){
                String answer = "YES";
                String str = br.readLine();

                for(int j = 0; j < str.length(); j++){
                    // 여는 괄호가 들어오면, 스택에 넣는다.
                    if(str.charAt(j) == '(') stack.push(str.charAt(j));
                        // 닫는 괄호가 들어오고, 기존에 스택이 비어있지 않다면 (즉, 여는 괄호가 존재 한다면) Top 을 삭제한다.
                    else if(!stack.isEmpty() && str.charAt(j) == ')') stack.pop();
                        // 스택이 비었고, 닫는 괄호가 들어오지 않았음 (여는 괄호 조차 들어오지 않았다는 뜻임)
                    else answer = "NO";
                }

                if(!stack.isEmpty()) answer = "NO";

                stack.clear();  //stack 초기화
                bw.write(answer + "\n");
            }

            bw.flush();
        }catch (IOException ioe){
            ioe.getStackTrace();
        }
    }

}

