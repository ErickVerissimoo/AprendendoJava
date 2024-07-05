package ignore.Testes;

import java.util.Scanner;

public class metodosas {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		System.out.print("Entre com a: ");
		int a = entrada.nextInt();
		System.out.println("Entre com B: ");
		int b = entrada.nextInt();
		int somas = soma(a , b);
		System.out.println(somas);
	}
	public static int soma(int a, int b) {
		int soma = a +b;
		
		return soma;
	}
}
