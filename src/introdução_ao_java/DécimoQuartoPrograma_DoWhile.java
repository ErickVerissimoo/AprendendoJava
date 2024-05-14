package introdução_ao_java;

import java.util.Scanner;

public class DécimoQuartoPrograma_DoWhile {
	public static void main (String [] args) {
		Scanner entrada = new Scanner (System.in);
		int A = 0;
		final int B = 20;
		System.out.print("\n\tBem vindo ao programa de adivinhar número \n\n\tEntre com o número para adivinhar: ");
		A = entrada.nextInt();
		if (A != B) {
		do {
			System.out.print("\n\n\tNúmero errado, tente novamente: ");
			A = entrada.nextInt();
		}while(A!= B);
		if (A == B) {
			System.out.println("\n\tParabéns, você acertou o número");
		}
	}
		entrada.close();} }
