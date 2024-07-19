package MiniProjetos;

import java.util.*;

public class tabuleiro {
	public static ArrayList <Jogada> tabuleiro = new ArrayList<Jogada>();
	static public Jogada construcao;
	public static Scanner entrada; 
	
	
	public static void Interface() {
		for  (int i = 0; i <9; i++) {
			construcao = new Jogada();
			construcao.jogada = " |";
			tabuleiro.add(construcao);
			System.out.print(construcao.jogada);
			if(i ==2) {
				System.out.println();
			}
			else if (i == 5) {
				System.out.println();
			}
			
		
		}}
	
	public static void jogo( ) {
		 boolean random;
		 Random aleatorio;
		 aleatorio = new Random();
		 random = aleatorio.nextBoolean();
		 Interface();
		 if (random== true) {
			 System.out.print("Você começa! ");
			 jogador();
			 adicionarJogada();
		 }
		 else {
			 
		 }
	}
	public static int jogador() {
		construcao = new Jogada();
		construcao.jogada = "X";
		System.out.print("Entre com a coluna horizontal da jogada de 1 a 3: ");
		int horizontal = entrada.nextInt() -1;
		System.out.print("Entre com a coluna vertical da jogada de 1 a 3: ");
		int vertical = entrada.nextInt()-1;
		int jogadinha = vertical + horizontal; 
		return construcao.coordenada = jogadinha;
	}
	
	public static void adicionarJogada() {
		int coordenada = jogador();
		tabuleiro.set(coordenada, construcao);
	}
	
	
	
	
	
	
	public static void main(String... args) {
		Random aleatorio;
		aleatorio = new Random();
		
		System.out.print("\n\tBem vindo ao jogo da velha "
				+ "com orientação objeta");
		System.out.println();
		jogo();
		

}
	
}