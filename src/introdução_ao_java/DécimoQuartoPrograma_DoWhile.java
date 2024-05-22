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
			/*
			 * O do while é uma variação do while, que consiste em realizar
			 * determinado bloco de códigos ao menos uma vez. A diferença
			 * fundamental do Do while para o while, é que no while, 
			 * pode ser que o programa nem o execute, pois o while 
			 * avalia a condição ANTES de executar o código, ou seja
			 * se o while avaliar que a condição é atingida antes de 
			 * executar o código, o while nem é executado. Mas, no Do while
			 * a verificação da condição é avaliada depois da execução,
			 * logo, mesmo se a condição seja verdadeira e não haveria
			 * necessidade de executar o código, o código é executado.
			 * O Do while executa o código ao menos uma vez mesmo
			 * que a condição seja satisfatória para não entrar
			 * no loop, o while não.
			 */
		do {
			System.out.print("\n\n\tNúmero errado, tente novamente: ");
			A = entrada.nextInt();
			/*
			 * Condição para que o loop seja executado.
			 */
		}while(A!= B);
		if (A == B) {
			System.out.println("\n\tParabéns, você acertou o número");
		}
	}
		entrada.close();} }
