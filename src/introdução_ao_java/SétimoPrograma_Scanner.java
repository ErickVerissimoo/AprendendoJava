package introdução_ao_java;

/*
 * Em java, utilizamos o import para facilitar o desenvolvimento do programa.
 * O import é uma ferramenta que facilita o desenvolvimento do código e a sua
 * compreensão, mas não é obrigatório seu uso em determinados casos.
 * Algo que também é importante dizer, é que o import fornece o acesso a outros pacotes (ou packages)
 * e dentro da JVM, existe um pacote chamado "java.util" que contém uma série de programas pré-programados
 * em forma de classes e arquivos Java, e o import é uma ferramenta que fornece o acesso 
 * a estes pacotes, assim como outros.
 * No caso abaixo, importamos a classe Scanner do pacote "java.util",
 */
import java.util.Scanner;

public class SétimoPrograma_Scanner {

	public static void main(String[] args) {
		/*
		 * Para usar o Scanner, é necessário instanciá-lo no programa, como
		 * é feito no programa abaixo. Lembrando que no Java existe uma série
		 * de bibliotecas que contém diversas classes pré-programadas, e a instanciação
		 * consiste em criar uma derivação da classe, que herda seus atributos
		 * e definições, porém de maneira mais concreta e estabelecida com valores
		 * reais, e não genéricos como está contido no corpo da classe.
		 */
		Scanner entrada = new Scanner(System.in);
		int A=0;
		int B=0;
		int resultado=0;
		/*
		 * O comando "(nome do objeto da classe Scanner). é o comando que inicializa
		 * o Scanner, ou seja, ao usá-lo, você está acionando o Scanner, e o que vem
		 * após esse código, ou seja, o "next....." é usado para armazenar e 
		 * definir o tipo de váriavel que foi inserida, numa váriavel criada inicialmente.
		 */
		System.out.println("Digite um numero:");
		A=entrada.nextInt();
		System.out.println("Digite outro numero:");
		B=entrada.nextInt();
		resultado=A+B;
		System.out.println("A soma dos números digitados é:" + resultado);
		/*
		 * Embora não seja obrigatório fechar o Scanner, é uma boa prática 
		 * de programação fechá-lo como está no código abaixo, pois caso
		 * não seja fechado, pode acarretar alguns problemas como a poluição
		 * visual do código, uso desnecessário de recursos de memória da 
		 * máquina, na qual pode levar a lentidão ou travamentos. 
		 */
		entrada.close();
	}

}
