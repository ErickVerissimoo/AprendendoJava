package source.introdução_ao_java;
import java.util.Scanner;

public class VigésimoQuartoPrograma_metodo_scan {
	public static void CalculoArea(float base, float altura) {
		 float resultado = base*altura;
		System.out.println("O resultado é" + resultado);
	}
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		float base;
		float altura;
		System.out.println("\n\tEntre com a base:");
		base = entrada.nextFloat();
		System.out.print("\n\tEntre com a altura");
		altura = entrada.nextFloat();
		CalculoArea(base, altura);
		entrada.close();
		/*
		 * O programa acima é uma mescla do Scan e de métodos com parametros
		 */
	}

}
