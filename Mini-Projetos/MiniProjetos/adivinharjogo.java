package MiniProjetos;
import java.util.*;
public class adivinharjogo {

	public static void main(String[] args) {
		Random aleatorio = new Random();
		Scanner entrada = new Scanner (System.in);
		int a = aleatorio.nextInt(100);
		int b;
		try {
		System.out.println("Bem vindo ao jogo de adivinhar um numero"
				+ "\n\tEntre com um numero inteiro até 100:");
		b = entrada.nextInt();
		while(b!=a) {
			System.out.println("Palavra errada! Tente novamente \n\tDigite: ");
			b = entrada.nextInt();
		}
	}
		catch(Throwable ex) {
			System.out.println("Entrada invalida");
		}
}}
