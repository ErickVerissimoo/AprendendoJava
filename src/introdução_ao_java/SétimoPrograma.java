package introdução_ao_java;

/*
 * Comentários em construção
 */
import java.util.Scanner;

public class SétimoPrograma {

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
