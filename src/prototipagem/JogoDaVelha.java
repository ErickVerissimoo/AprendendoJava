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
			try {
				Imprimir();
				int maquinaVertical, maquinaHorizontal;
				int horizontal;
				int vertical;
				char jogador;
				Random aleatorio;
				boolean terminou = false;
				aleatorio = new Random();
				boolean começa;
				começa = aleatorio.nextBoolean();
		
				do { 
					jogador = 'X';
					char maquina = 'O';
					System.out.print("\n\tDigite a linha horizontal de um a 3: ");
					horizontal = entrada.nextInt() -1;
					System.out.print("\n\tEntre com a coluna vertical de 1 a 3:");
					vertical = entrada.nextInt() -1;
					tabuleiro [horizontal][vertical] = jogador;
					maquinaVertical = aleatorio.nextInt(0, 3);
					maquinaHorizontal = aleatorio.nextInt(0, 3);
					while(tabuleiro [maquinaVertical][maquinaHorizontal] == tabuleiro [vertical][horizontal]){
						maquinaVertical = aleatorio.nextInt(0, 3);
						maquinaHorizontal = aleatorio.nextInt(0, 3);
			
					}
						 tabuleiro [maquinaVertical][maquinaHorizontal] = maquina;
					
					for(int i = 0; i<tabuleiro.length; i++) {
						for(int j = 0; j<tabuleiro.length; j++) {
							
							  if(tabuleiro[i][j] == '\u0000') {
									System.out.print(" |");}
							  if (i == 0 && j == 2 && tabuleiro [i][j] == '\u0000') {
									 
									  System.out.println();
								  }
							  else   if (i == 1 && j == 2 && tabuleiro [i][j] == '\u0000') {
									
									  System.out.println();
								  }
							
							   if(i == 0 && j ==2 && tabuleiro[i][j] == jogador) {
									 System.out.printf(" %c",jogador );
									 System.out.println();
									
								 }
							   else  if(i == 1 && j == 2 && tabuleiro[i][j] == jogador ) {
									 System.out.printf(" %c",jogador );
									 System.out.println();
							} 
							
							   else if (tabuleiro[i][j] == jogador) {
									System.out.printf(" %c",jogador );
								}
							   
							   
								 
							   if(i == 0 && j == 2 && tabuleiro[i][j] == maquina ) {
									 System.out.printf(" %c",maquina );
									 System.out.println();
							}
							   else if(i == 1 && j == 2 && tabuleiro[i][j] == maquina ) {
									 System.out.printf(" %c",maquina );
									 System.out.println();
							}
						
							   else if(tabuleiro [i][j] == maquina) {
								System.out.printf(" %c", maquina);
							}
							  if (i == tabuleiro.length) {
								i -= tabuleiro.length;
							}
							if (j == tabuleiro.length){
								j -= tabuleiro.length;
							}
							  }
						  }}while(terminou ==false);	  
					 
				}catch(IndexOutOfBoundsException entradaInvalida){
					System.out.print("\n\tentrada invalida");
				}
			
		}}