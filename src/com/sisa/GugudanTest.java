package com.sisa;

public class GugudanTest {

	public static void main(String[] args) {

		Gugudan gugudan = new Gugudan();
		char answer;

		System.out.println("<<구구단>>");

		do {
			int dan = gugudan.inputDan();
			gugudan.outputDan(dan);
			answer = gugudan.continueDan();
		} while (answer == 'y' || answer == 'Y');

		System.out.println("-- END --");
	}

}
