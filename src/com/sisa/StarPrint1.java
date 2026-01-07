
package com.sisa;

public class StarPrint1 {
	public static void main(String[] args) {

		for (int i = 1; i <= 4; i++) { // 줄 수
			for (int j = 1; j <= i; j++) { // 별 개수
				System.out.print("*");
			}
			System.out.println();
		}
	}
}