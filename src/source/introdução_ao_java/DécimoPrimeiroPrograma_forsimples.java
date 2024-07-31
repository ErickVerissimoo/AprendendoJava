package source.introdução_ao_java;


public class DécimoPrimeiroPrograma_forsimples {

	public static void main(String[] args) {
		/*
		 * Abaixo está a estrutura for, na qual também faz parte dos ciclos de repetição.
		 * suas principais funcionalidades são de repetir códigos determinadas vezes,
		 * - diferentemente do while que repete indeterminadamente, e percorrer listas.
		 * Na estrutura for, primeiro você deve atribuir uma váriavel, a condição para o for rodar,
		 * e a mudança que o for executará. Nesse caso, a mudança é atribuir 1 a váriavel i, até ela ser
		 * maior ou igual a 10. E sempre que é incrementado 1 a váriavel, o bloco de códigos abaixo é executado
		 * uma vez. Isso é apenas uma introdução básica ao for. O código abaixo conta até dez.
		 */
		for (int i = 0; i<=10; i++) {
			System.out.println(i + "");
		}
	}
}
