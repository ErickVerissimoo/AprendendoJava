package MiniProjetos;

import java.util.*;

public final class tabuleiro {
	public static Jogada[][] tabuleiro = new Jogada[3][3];

	public static void Interface(int x, int y) {
		Jogada jogada = new Jogada();
		tabuleiro[x][y] = jogada;
		for (int horizontal = 0; horizontal < tabuleiro.length; horizontal++) {
			for (int vertical = 0; vertical < tabuleiro.length; vertical++) {
				 if (tabuleiro[horizontal][vertical] == null) {

					System.out.print(jogada.getVazio());
				}  if (horizontal == 2 && vertical == 0 || horizontal == 2 && vertical == 1) {

					System.out.println();
				}
				
					if (tabuleiro[horizontal][vertical] == jogada) {
						System.out.print(jogada.getJogada());
					}  if (x == 0 && y == 2 && tabuleiro[x][y] == jogada
							|| x == 1 && y == 2 && tabuleiro[x][y] == jogada) {
						System.out.print(jogada.getJogada());
					}
				}
			}

		}

	

	// @Overload
	public static void Interface() {
		for (int vertical = 0; vertical < tabuleiro.length; vertical++) {
			for (int horizontal = 0; horizontal < tabuleiro.length; horizontal++) {

				Jogada jogada = new Jogada();
				if (tabuleiro[horizontal][vertical] == null) {

					System.out.print(" |");
				}
				if (horizontal == 2 && vertical == 0
						|| horizontal == 2 && vertical == 1 && tabuleiro[horizontal][vertical] == null) {
					System.out.println();
				}

			}

		}

	}

	public static void main(String... args) {
		Scanner entrada = new Scanner(System.in);
		

		System.out.print("\n\tBem vindo ao jogo da velha usando " + "conceitos de orientaçao a objetos");
		System.out.println();
		Interface();
		System.out.print("\n\tEntre com a linha horizontal de 1 a 3:  ");
		int horizontal = entrada.nextInt() - 1;
		System.out.print("\n\tEntre com  a linha vertical de 1 a 3: ");
		int vertical = entrada.nextInt() - 1;
		Interface(horizontal, vertical);

		
		entrada.close();
	}
}