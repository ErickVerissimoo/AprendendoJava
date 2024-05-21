package introdução_ao_java;
/*
 * De maneira agora um pouco mais aprofundada, tive o entendimento de que
 * os imports de pacotes no Java é nada menos do que import de funções que estão na
 * biblioteca da própria JVM. Por exemplo, nesse código abaixo, a função de
 * potencia poderia sim ser realizada sem a "Math.pow", porém seria mais 
 * complicado, porém é sim possivel, usando o for e outras ferramentas. 
 */
import java.util.Scanner;
public class VigésimoSextoPrograma {

	public static void main(String[] args) {
		double A, B, resultado;
		Scanner entrada = new Scanner(System.in);
		System.out.print("Entre com a base");
		A = entrada.nextDouble();
		System.out.println("Entre com o expoente");
		B = entrada.nextDouble();
		resultado = Math.pow(A, B);
		System.out.println(resultado);
		entrada.close();
	}

}
