package source.introdução_ao_java;
import java.util.Scanner;
public class VigésimoPrimeiroPrograma_boolean_e_implementacao_de_programa {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		char A = 'A';
		char B = 'B';
		char C = 'C';
		char generica;
		System.out.println("\n\tOlá, quanto é 1+1? \n\tRespostas abaixo: \n\tA: 4 \n\tB: 2 \n\tC: 3 \n\tDigite a resposta");
		/*
		 * Usamos o comando abaixo para armazenar um caractere. Não existe
		 * um "next" feito especialmente para o tipo char, então por isso
		 * adaptamos o next mesclando com a função charAt, na qual permite
		 * ler um caractere especificado entre parenteses.
		 */
		generica = entrada.next().charAt(0);
		/*
		 * Abaixo usamos o while com um tipo booleano, true, significando que
		 * o while será executado até houver um retorno falso ou ser forçado
		 * a parar usando o comando break.
		 */
		while (true) {
		if (generica==B) {
			System.out.print("\n\tParabéns você acertou");
			break;}
		else if (generica==A || generica==C) {
			System.out.print("\n\tResposta errada \n\tTente novamente: ");
			generica = entrada.next().charAt(0);
			}
		}
	entrada.close();
}}