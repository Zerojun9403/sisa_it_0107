package com.sisa;

public class GugudanPrintTest {
	
	public static void main(String[] args) {
		
		for (int i = 1; i <= 9; i++) { // 곱하는 수
			
			for (int j = 2; j <= 9; j++) { // 단수
				System.out.printf("%d*%d=%-4d", j, i, j * i);
			}
			System.out.println();
		}

	}
}
