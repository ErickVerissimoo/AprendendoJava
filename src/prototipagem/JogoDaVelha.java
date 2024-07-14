package prototipagem;

import java.util.*;
public abstract class JogoDaVelha {
	static char [][] tabuleiro = new char [3][3];
	static boolean jogoAcabou = false;
	static Scanner entrada = new Scanner (System.in);

	public static void Imprimir() {
		
		for(int i = 0; i<tabuleiro.length;i++) {
		System.out.println("  |  |  | ");
	}}
		public static void Jogo() {

				Imprimir();
				int maquinaVertical, maquinaHorizontal;
				int horizontal;
				int vertical;
				int contador= 0;
				char jogador;
				Random aleatorio;
				boolean terminou = false;
				aleatorio = new Random();
				boolean começa;
				começa = aleatorio.nextBoolean();
		
				while(!terminou || começa == true) { 
					jogador = 'X';
					char maquina = 'O';
					System.out.print("\n\tDigite a linha vertical de um a 3: ");
					horizontal = entrada.nextInt() -1;
					System.out.print("\n\tEntre com a coluna horizontal de 1 a 3:");
					vertical = entrada.nextInt() -1;
					tabuleiro [vertical][horizontal] = jogador;
					maquinaVertical = aleatorio.nextInt(0, 3);
					maquinaHorizontal = aleatorio.nextInt(0, 3);
					while(tabuleiro [maquinaVertical][maquinaHorizontal] == tabuleiro [vertical][horizontal]);{
						maquinaVertical = aleatorio.nextInt(0, 3);
						maquinaHorizontal = aleatorio.nextInt(0, 3);
					}
						 tabuleiro [maquinaVertical][maquinaHorizontal] = maquina;
						
					for(int i = 0; i<tabuleiro.length; i++) {
						for(int j = 0; j<tabuleiro.length; j++) {
							   if (i == 0 && j == 2 && tabuleiro [i][j] == '\u0000') {
									  System.out.print(" |");
									  System.out.println();
								  }
							   else  if(tabuleiro[i][j] == '\u0000') {
								System.out.print(" |");}
							
								  if(i == 0 && j ==2 && tabuleiro[i][j] == jogador) {
									 System.out.printf(" %c",jogador );
									 System.out.println();
									
								 }
								  else if (tabuleiro[i][j] == jogador) {
											System.out.printf(" %c",jogador );
										}
								  if(i == 1 && j == 2) {
									  System.out.println();
								  }
								 if(i == 1 && j == 2 && tabuleiro[i][j] == jogador ) {
									 System.out.printf(" %c",jogador );
									 System.out.println();
							} 
							
						
							  if(tabuleiro [i][j] == maquina) {
								System.out.printf(" %c", maquina);
							}
						
							  }
						
						
						  }}	  
					 
				}}