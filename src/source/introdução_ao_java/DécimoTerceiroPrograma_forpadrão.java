package source.introdução_ao_java;

public class DécimoTerceiroPrograma_forpadrão {

	public static void main(String[] args) {
		/*
		 * O loop for consiste em uma estrutura de repetição
		 * na qual já se tem uma noção de quantas vezes determinado
		 * bloco de código será repetido. Sua estrutura consiste primeiramente
		 * de uma váriavel inicializada com algum valor, uma condição a seguinte
		 * que essa váriavel precisa atingir, e a mudança que essa váriavel
		 * vai sofrer para que atinja essa condição estabelecida anteriormente.
		 * No caso abaixo, a condição a ser atingida é que i seja maior ou igual a
		 * 10 partindo do 0, e para que i atinja essa condição, 1 será incrementado
		 * a i, e sempre que 1 ser incrementado, o bloco de códigos abaixo será
		 * executado.
		 */
		for (int i = 0; i <=10; i++) {
			System.out.println("O número agora é: " + i);
		}
	}
}
