package source.introdução_ao_java;
import java.util.Scanner;
public class VigésimoQuintoPrograma_return_metodo {

	/*
	 * O método abaixo ao final usa o return. O return é usado
	 * para indicar o final do método e devolver um valor ao código que
	 * o chamou. Neste caso, o código que chamar este método, receberá
	 * o resultado como retorno.
	 */
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
		 * O valor do return precisa ser alocado em outra variavel, ou seja
		 * o valor da váriavel será definido como o valor devolvido pelo
		 * método.
		 */
		resultado1 = CalcularArea(base, altura);
		System.out.println(resultado1);
		entrada.close();
	}

}
