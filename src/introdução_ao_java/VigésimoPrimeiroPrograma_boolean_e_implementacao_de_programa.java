package introdução_ao_java;
import java.util.Scanner;
public class VigésimoPrimeiroPrograma_boolean_e_implementacao_de_programa {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		boolean repeticao = true;
		char A = 'A';
		char B = 'B';
		char C = 'C';
		char generica;
		System.out.println("\n\tOlá, quanto é 1+1? \n\tRespostas abaixo: \n\tA: 4 \n\tB: 2 \n\tC: 3 \n\tDigite a resposta");
		generica = entrada.next().charAt(0);
		while (repeticao = true) {
		if (generica==A) {
			System.out.print("\n\tParabéns você acertou");
			break;}
		else if (generica==B || generica==C) {
			System.out.print("\n\tResposta errada \n\tTente novamente: ");
			generica = entrada.next().charAt(0);
			}
		}
	entrada.close();
}}