package source.introdução_ao_java;

public class VigésimoPrograma_Char_e_String {

	public static void main(String[] args) {
		String A = "Abecedário";
		/*
		 * O tipo char pode armazenar apenas um caractere. O método
		 * "charAt" retorna um único caractere de uma String ou um número.
		 * Pense numa String por exemplo, num vetor, com as posições 0,1,2
		 * e etc... O método charAt retorna um caractere de determinada
		 * posição do vetor, nesse caso, a letra b será retornada, pois consi
		 * derando que a primeira letra da esquerda para a direita se encontra
		 * na posição 0, a próxima é a posição 1.
		 */
		char primeiraLetra = A.charAt(1);
		System.out.println(primeiraLetra);
	}

}
