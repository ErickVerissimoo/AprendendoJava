package microProjetos;
import java.util.Scanner;
public class Aleatorio {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		double a, soma = 0;
		char resposta;
		do {
		System.out.print("\n\tEntre com um valor: ");
		a = entrada.nextDouble();
		soma += a;
		System.out.print(soma + "\n\t");
		System.out.println("\n\tVocê deseja continuar ? s / n");
		resposta = entrada.next().charAt(0);
	}while(resposta=='s');

}}
