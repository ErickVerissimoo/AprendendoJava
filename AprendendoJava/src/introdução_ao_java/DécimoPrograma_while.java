package introdução_ao_java;
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
		while (Valor != numero) {
			 System.out.print("\n\tNúmero errado, tente novamente: ");
			Valor = entrada.nextInt();
			if (Valor == numero) {
			System.out.println("\n\tParabéns, você acertou o número");
			}				}}entrada.close();}}