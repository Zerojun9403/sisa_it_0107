package com.sisa;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Gugudan {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int inputDan() {
        int dan = 0;
        try {
            System.out.print("원하는 단? ");
            dan = Integer.parseInt(br.readLine());
        } catch (Exception e) {
            System.out.println("숫자만 입력하세요");
        }
        return dan;
    }

    void outputDan(int dan) {
        for (int i = 1; i <= 9; i++) {
            System.out.println(dan + " * " + i + " = " + (dan * i));
        }
    }

    char continueDan() {
        char answer = 'n';
        try {
            System.out.print("계속(y/n)? ");
            answer = br.readLine().toLowerCase().charAt(0);
        } catch (Exception e) {
            System.out.println("입력 오류");
        }
        return answer;
    }
}
