package entities;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// Exercicio_paresConsecutivos
		int x;
		int soma = 0;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um numero inteiro: ");
		x = sc.nextInt();
		while(x != 0) {
			if(x % 2 == 0) {
				soma = x + x + 2 + x + 4 + x + 6 + x + 8;
			} else {
				soma = x + 1 + x + 3 + x + 5 + x + 7 + x + 9;
			}
			System.out.println("SOMA = " + soma);
			System.out.print("Digite um numero inteiro: ");
			x = sc.nextInt();
			
			
		}
		
		sc.close();
	}

}
