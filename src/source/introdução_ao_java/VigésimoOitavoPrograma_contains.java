package source.introdução_ao_java;
import java.util.Scanner;
public class VigésimoOitavoPrograma_contains {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String palavra;
		System.out.println("\n\tBem vindo ao programa que verifica se a palavra contém determinadas letras \n\tEntre com uma palavra");
		palavra = entrada.next();
		while (true) {
			/*
			 * O método contains verifica se o valor associado a uma String
			 * contém determinado ou determinados caracteres. Por exemplo, no
			 * caso abaixo verifica se a String contém as letras "a" e "e".
			 */
		if(palavra.contains("a")) {
			System.out.println("\n\t\bPalavra invalida \n\tTente novamente:");
			palavra = entrada.next();
		} else if (palavra.contains("e")) {
			System.out.println("\n\btPalavra invalida \n\tTente novamente");
			palavra = entrada.next();
		} else {
			System.out.println("\b\bPalavra válida");
			break;
		}
		
	}entrada.close();

}}
