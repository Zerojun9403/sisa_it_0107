package com.sisa;

import java.io.IOException;
import java.io.InputStreamReader;

public class Gugudan {

    InputStreamReader isr = new InputStreamReader(System.in);

    int inputDan() {
        int dan = 0;
        try {
            System.out.print("원하는 단? ");
            dan = isr.read() - '0'; // 문자 → 숫자
            isr.read(); // \n
            isr.read(); // \r
        } catch (IOException e) {
            e.printStackTrace();
        }
        return dan;
    }

    void outputDan(int dan) {
        for (int i = 1; i <= 9; i++) {
            System.out.println(dan + "*" + i + "=" + (dan * i));
        }
        return;
    }

    char continueDan() {
        char result = 'n';
        try {
            System.out.print("계속(y/n)? ");
            result = (char) isr.read();
            isr.read(); // \n
            isr.read(); // \r
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
	
	
}
