/*
 * Jogo da velha criado sem orientação a objetos
 */

package MiniProjetos;

import java.util.*;

public abstract class JogoDaVelha {
	static String[][] tabuleiro = new String[3][3];
	static boolean jogoAcabou = false;
	static Scanner entrada = new Scanner(System.in);
	public static String vazio = " |";

	public static void jogo(String maquina, String jogador) {
		int x;
		int y;
		for (x = 0; x < tabuleiro.length; x++) {
			for (y = 0; y < tabuleiro.length; y++) {
				if (tabuleiro[x][y] == null)  {
					System.out.print(vazio);
				}
				if (x == 0 && y == 2 && tabuleiro[x][y] == null){
					System.out.println();
				} else if (x == 1 && y == 2 && tabuleiro[x][y] == null)
						 {

					System.out.println();
				}

				if (x == 0 && y == 2 && tabuleiro[x][y] == jogador) {
					System.out.printf(" %s", jogador);
					System.out.println();

				} else if (x == 1 && y == 2 && tabuleiro[x][y] == jogador) {
					System.out.printf(" %s", jogador);
					System.out.println();
				}

				else if (tabuleiro[x][y] == jogador) {
					System.out.printf(" %s", jogador);
				}

				if (x == 0 && y == 2 && tabuleiro[x][y] == maquina) {
					System.out.printf(" %s", maquina);
					System.out.println();
				} else if (x == 1 && y == 2 && tabuleiro[x][y] == maquina) {
					System.out.printf(" %s", maquina);
					System.out.println();
				} else if (tabuleiro[x][y] == maquina) {
					System.out.printf(" %s", maquina);
				}

				
			}
		}
	}


	
	public static void Imprimir() {
		for (int i = 0; i < tabuleiro.length; i++) {
			System.out.println("  |  |  | ");
		}
	}

	public static void Jogo() {
		
		
			Imprimir();
			
			boolean terminou = false;
			do {
				
				try {
				int horizontal;
				int vertical;
				int maquinaVertical, maquinaHorizontal;
				Random aleatorio;
				aleatorio = new Random();
				String jogador1 = "X";
				String maquina2 = "O";
				System.out.print("\n\tDigite a linha vertical de um a 3: ");
				vertical = entrada.nextInt() - 1;
				System.out.print("\n\tEntre com a coluna horizontal de 1 a 3:");
				horizontal = entrada.nextInt() - 1;
				while(tabuleiro[horizontal][vertical] == maquina2 || tabuleiro[horizontal][vertical] == jogador1) {
					jogo(jogador1, maquina2);
					System.out.print("\n\tEste espaço já está ocupado, tente novamente "
							+ "\n\n\tDigite a linha vertical:");
					vertical = entrada.nextInt() - 1;
					System.out.print("\n\tDigite a linha horizontal");
					horizontal = entrada.nextInt() - 1;
					}
				tabuleiro[horizontal][vertical] = jogador1;
				maquinaVertical = aleatorio.nextInt(0, 3);
				maquinaHorizontal = aleatorio.nextInt(0, 3);
				while (tabuleiro[maquinaVertical][maquinaHorizontal] == jogador1 || 
						tabuleiro[maquinaVertical][maquinaHorizontal] == maquina2) {	
					aleatorio = new Random();
					maquinaVertical = aleatorio.nextInt(0, 3);
					maquinaHorizontal = aleatorio.nextInt(0, 3);
				}
				tabuleiro[maquinaVertical][maquinaHorizontal] = maquina2;
				
				if (tabuleiro[0][0] == jogador1 && tabuleiro[1][0] == jogador1 && tabuleiro[2][0] == jogador1) {
					jogo(jogador1, maquina2);
					System.out.print("\n\tVocê venceu!");
					break;
				} else if (tabuleiro[0][0] == jogador1 && tabuleiro[0][1] == jogador1 && tabuleiro[0][2] == jogador1) {
					jogo(jogador1, maquina2);
					System.out.print("\n\tVocê venceu!");
					break;
				} else if (tabuleiro[0][0] == jogador1 && tabuleiro[1][1] == jogador1 && tabuleiro[2][2] == jogador1) {
					jogo(jogador1, maquina2);
					System.out.print("\n\tVocê venceu!");
					break;
				} else if (tabuleiro[1][0] == jogador1 && tabuleiro[1][1] == jogador1 && tabuleiro[1][2] == jogador1) {
					jogo(jogador1, maquina2);
					System.out.print("\n\tVocê venceu!");
					break;
				} else if (tabuleiro[2][0] == jogador1 && tabuleiro[2][1] == jogador1 && tabuleiro[2][2] == jogador1) {
					jogo(jogador1, maquina2);
					System.out.print("\n\tVocê venceu!");
					break;
				}
				else if (tabuleiro[0][2] == jogador1 && tabuleiro[1][2] == jogador1 && tabuleiro[2][2] == jogador1 ) {
					jogo(jogador1, maquina2);
					System.out.print("\n\tVocê venceu!");
					break;
				}
			else if (tabuleiro[2][0] == jogador1 && tabuleiro[1][1] == jogador1 && tabuleiro[0][2] == jogador1) {
				jogo(jogador1, maquina2);
				System.out.print("\n\tVocê venceu!");
				break;}
			
				for (int i = 0; i < tabuleiro.length; i++) {
					for (int j = 0; j < tabuleiro.length; j++) {

						if (tabuleiro[i][j] == null || tabuleiro[i][j].isEmpty() || tabuleiro[i][j].isBlank()) {
							System.out.print(vazio);
						}
						if (i == 0 && j == 2 && tabuleiro[i][j] == null ) {

							System.out.println();
						} else if (i == 1 && j == 2 && tabuleiro[i][j] == null) {

							System.out.println();
						}

						if (i == 0 && j == 2 && tabuleiro[i][j] == jogador1) {
							System.out.printf(" %s", jogador1);
							System.out.println();

						} else if (i == 1 && j == 2 && tabuleiro[i][j] == jogador1) {
							System.out.printf(" %s", jogador1);
							System.out.println();
						}

						else if (tabuleiro[i][j] == jogador1) {
							System.out.printf(" %s", jogador1);
						}

						if (i == 0 && j == 2 && tabuleiro[i][j] == maquina2) {
							System.out.printf(" %s", maquina2);
							System.out.println();
						} else if (i == 1 && j == 2 && tabuleiro[i][j] == maquina2) {
							System.out.printf(" %s", maquina2);
							System.out.println();
						} else if (tabuleiro[i][j] == maquina2) {
							System.out.printf(" %s", maquina2);
						}

						if (i == tabuleiro.length) {
							i -= tabuleiro.length;
						}
						if (j == tabuleiro.length) {
							j -= tabuleiro.length;
						}
					}
				}
			 
			}catch (IndexOutOfBoundsException entradaInvalida) {
				System.out.print("\n\tentrada invalida");}} while (terminou == false);
		}}