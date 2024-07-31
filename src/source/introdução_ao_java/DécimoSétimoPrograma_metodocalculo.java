package source.introdução_ao_java;
import java.util.Scanner;
public class DécimoSétimoPrograma_metodocalculo {

	public static void main(String[] args) {
		calculo_base();
		calculo_perimetro();
	}
	/*
	 * Abaixo temos um método que calcula a área de um quadrado, bem simples.
	 * O que vale a pena ser comentado, é a assinalação do método, na qual temos
	 * os modificadores static, void e private. Static é usado para indicar
	 * que o método ou o atributo, pertence a classe na qual está inserido,
	 * e não a um objeto instanciado. Void indica que o método em nenhum
	 * momento vai retornar nada, apenas executar determinado código sem
	 * nenhum tipo de retorno. O private indica que o acesso ao método
	 * ou atributo é controlado e não pode ser acessado facilmente por outras
	 * classes pertencentes a outros arquivos e pacotes.
	 */
	private static void calculo_base() {
		Scanner entrada = new Scanner(System.in);
		float A = 0;
		float B = 0;
		float resultado;
		System.out.print("\n\tBem vindo ao programa que calcula área de um retângulo \n\tEntre com a base: ");
		A = entrada.nextFloat();
		System.out.print("\n\tEntre com a altura: ");
		B = entrada.nextFloat();
		resultado = A*B;
		System.out.println("\n\tO resultado foi: " + resultado);
		entrada.close();
	}
	private static void calculo_perimetro() {
		Scanner entrada = new Scanner(System.in);
		float A = 0;
		float B = 0;
		float resultado;
		System.out.print("\n\tEntre com a base: ");
		A = entrada.nextFloat();
		System.out.print("\n\tEntre com a altura");
		B = entrada.nextFloat();
		resultado = (A*2) + (B*2);
		System.out.print("\n\tO perímetro do retângulo é: " + resultado);
		entrada.close();}
	/*
	 * O programa acima realiza alguns cálculos usando métodos,
	 * viabilizando totalmente sua repetição caso necessário.
	 */
}
