package com.test.coding.baekjoon.Implementation;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class $_10189 {
    final static String A = "#  # #### #### #  #";
    final static String B = "#### #  # #  # # #";

    public static void main(String[] args) {
        print(4);
    }

    static void print(int line){
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= line + 3; i++){
            if(1 == i || i == 7) sb.append(A);
            else if(i % 2 == 0) sb.append("\n");
            else sb.append(B);
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        try {
            bw.write(sb.toString());
            bw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    
}
