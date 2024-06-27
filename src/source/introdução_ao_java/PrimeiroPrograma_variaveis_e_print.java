/*
 * Pacotes, ou packages, são uma forma de estruturação de programas Java
 * na qual facilita a organização da construção do programa, pois assim
 * você consegue lidar com diferentes objetos e programas ao mesmo tempo
 * em um projeto que seja mais extenso.
 */
package source.introdução_ao_java;

/*
 * Abaixo está o objeto principal do prorama, ou seja, o "conjunto maior" do programa.
 * De maneira mais sintética, é como se houvesse um carro, o objeto principal. E isso
 * se divide em classes menores, como por exemplo o objeto pneu, vidro e afins,
 */

public class PrimeiroPrograma_variaveis_e_print {
/*
 * a classe main é basicamente onde se inicia o programa java, ou seja, é
 * a partir dali que o código começará a rodar. 
 */
	public static void main(String[] args) {
		/*
		 * Abaixo são as variáveis. Elas são espaços da memória designados a
		 * armazenar dados. Estes dados podem ou não serem inseridos pelo usuário.
		 * E estas variáveis se dividem em primitivas ou não. As primitivas são:
		 * int, long, short, byte (estas 4 armazenam números inteiros), float,
		 * double, estes dois armazenando numeros reais, e o tipo char
		 */
			int A = 20;
			System.out.println(A);
			/*
			 * O comando acima exibe uma mensagem ou o valor de uma variável, ou os dois.
			 */
	}

}
