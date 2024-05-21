package introdução_ao_java;
import java.util.Scanner;
public class DécimoSétimoPrograma_metodocalculo {

	public static void main(String[] args) {
		calculo_base();
		calculo_perimetro();
	}
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
}
