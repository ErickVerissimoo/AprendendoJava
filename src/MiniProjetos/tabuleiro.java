package MiniProjetos;

import java.util.*;

public final class tabuleiro {
	public static ArrayList <Jogada> tabuleiro = new ArrayList <>();
	public static Scanner entrada;
	
		public static void Jogo(int jogada) {
			
			
			for (int i = 0; i<9; i++) {
				Jogada construcao = new Jogada();
				
					tabuleiro.add(construcao);
					System.out.print(construcao.vazio);
				if (i ==2 || i == 5) {
					System.out.println();
				}
			
				 if (i == jogada) {
				
				
					tabuleiro.set(jogada, construcao);
					System.out.print(construcao.getJogada());
				}
				
				
				
			}
			
		}
			
		
	
	public static void main(String... args) {
		System.out.println(tabuleiro.size());
		Random aleatorio;
		aleatorio = new Random();
		System.out.print("\n\tBem vindo ao jogo da velha "
				+ "com orientação objeta");
		System.out.println();
		entrada = new Scanner (System.in);
	
		System.out.print("Entre com a horizontal de 1 a 3: ");
		int horizontal = entrada.nextInt();
		System.out.println(tabuleiro.size());
		System.out.print("Entre com a vertical de 1 a 3: ");
		int vertical = entrada.nextInt();
		System.out.println(tabuleiro.size());
		int resultado = vertical + horizontal;
		Jogo(resultado);
}
	
}