package introdução_ao_java;
import java.util.Scanner;
public class VigésimoSextoPrograma_return_metodo {

	public static float CalcularArea( float base, float altura ) {
		float resultado = base * altura;
		return resultado;
	}
	public static void main(String[] args) {
		float base, altura, resultado1;
		Scanner entrada = new Scanner(System.in);
		System.out.print("\n\tEntre com a base: ");
		base = entrada.nextFloat();
		System.out.print("\n\tEntre com a altura: ");
		altura = entrada.nextFloat();
		/*
		 * O resultado do return precisa ser alocado em outra variavel
		 */
		resultado1 = CalcularArea(base, altura);
		System.out.println(resultado1);
		entrada.close();
	}

}
