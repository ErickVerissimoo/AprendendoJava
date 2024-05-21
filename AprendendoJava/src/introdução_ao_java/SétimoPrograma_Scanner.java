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
		 * Comentários em construção
		 */
		Scanner entrada = new Scanner(System.in);
		int A=0;
		int B=0;
		int resultado=0;
		/*
		 * Comentários em construção
		 */
		System.out.println("Digite um numero:");
		A=entrada.nextInt();
		System.out.println("Digite outro numero:");
		B=entrada.nextInt();
		resultado=A+B;
		System.out.println("A soma dos números digitados é:" + resultado);
		/*
		 * Comentários em construção
		 */
		entrada.close();
	}

}
