package aula;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int i;
		
		for (i = 0; i <= 30; i++) {
			if (i % 3 == 0) {
				System.out.printf("\n%d", i);
			}
		}
		
		sc.close();
	}

}
