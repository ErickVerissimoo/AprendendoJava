package source.introdução_ao_java;
import java.util.Scanner;
public class DécimoPrograma_while {
	public static void main (String[] args) {
		Scanner entrada = new Scanner(System.in);
		final int numero = 20;
		int Valor = 0;
		System.out.print("\n\tJogo de adivinhar o numero \n\tDigite um número inteiro qualquer: ");
		Valor = entrada.nextInt();
		 if (Valor == numero) {
				System.out.print("\n\tParabéns, você acertou o número");}
		 else {
			 /*
			  * A estrutura de repetição while consiste em executar
			  * determinado bloco de códigos, enquando a condição do
			  * while não for satisfatória. Ou seja, enquanto o valor
			  * inserido pelo usuário não for igual a 20, o bloco de
			  * códigos abaixo será executado indeterminadamente.
			  */
		while (Valor != numero) {
			 System.out.print("\n\tNúmero errado, tente novamente: ");
			Valor = entrada.nextInt();
			if (Valor == numero) {
			System.out.println("\n\tParabéns, você acertou o número");
			}				}}entrada.close();}}