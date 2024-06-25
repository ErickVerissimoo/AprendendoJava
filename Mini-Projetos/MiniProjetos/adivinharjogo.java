package MiniProjetos;
import java.util.*;
public class adivinharjogo {

	public static void main(String[] args) {
		Random aleatorio = new Random();
		Scanner entrada = new Scanner (System.in);
		int a = aleatorio.nextInt(100);
		int b;
		int tentativas = 10;
		try {
		System.out.println("Bem vindo ao jogo de adivinhar um numero"
				+ "\n\tEntre com um numero inteiro até 100:");
		b = entrada.nextInt();
		while(b!=a || tentativas>0) {
			System.out.printf("Palavra errada! Lhe restam %d tentativas \n\tDigite: ", tentativas);
			b = entrada.nextInt();
			tentativas--;
			if(tentativas<=0) {
				System.out.printf("\tO numero era %d", a);
				System.out.print("\n\tGame over!");
				break;
			}
			if (b==a) {
				System.out.print("\n\tVocê acertou o numero!");
			}
		}
	}
		catch(Throwable ex) {
			System.out.println("Entrada invalida");
		}
}}
