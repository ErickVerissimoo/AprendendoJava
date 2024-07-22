package MiniProjetos;

import java.util.*;

public final class tabuleiro {

	public static Jogada[][] tabuleiro = new Jogada[3][3];

	public static void Interface(boolean repeticao) {

		Jogada jogada = new Jogada();
		Jogada maquina = new Jogada();
		Scanner entrada = new Scanner(System.in);

		while (repeticao == false) {
			
			Random aleatorio = new Random();

			int Horizontal;
			int Vertical;
			System.out.print("\n\tEntre com a linha vertical de 1 a 3:  ");
			Horizontal = entrada.nextInt() - 1;
			System.out.print("\n\tEntre com  a linha horizontal de 1 a 3: ");
			Vertical = entrada.nextInt() - 1;
			if (tabuleiro[Horizontal][Vertical] == null) {
				tabuleiro[Horizontal][Vertical] = jogada;
			} else {
				System.out.print("\n\tposição ja ocupada ");
				continue;
			}
			int maquina_vertical, maquina_horizontal;
			maquina_vertical = aleatorio.nextInt(0, 3);
			maquina_horizontal = aleatorio.nextInt(0, 3);

			while (tabuleiro[maquina_horizontal][maquina_vertical] == jogada || tabuleiro[maquina_horizontal][maquina_vertical] == maquina ) {
				aleatorio = new Random();
				maquina_vertical = aleatorio.nextInt(0, 3);
				maquina_horizontal = aleatorio.nextInt(0, 3);

			}

			tabuleiro[maquina_horizontal][maquina_vertical] = maquina;
			for (int vertical = 0; vertical < tabuleiro.length; vertical++) {
				for (int horizontal = 0; horizontal < tabuleiro.length; horizontal++) {

					if(vertical == tabuleiro.length ) {
						vertical -=tabuleiro.length;
					}
					if(horizontal == tabuleiro.length) {
						horizontal -= tabuleiro.length;
					}
					
					if (horizontal == 2 && vertical == 0 && tabuleiro[horizontal][vertical] == null
							|| horizontal == 2 && vertical == 1 && tabuleiro[horizontal][vertical] == null) {
						System.out.print(jogada.getVazio());
						System.out.println();

					}

					else if (tabuleiro[horizontal][vertical] != maquina && tabuleiro[horizontal][vertical] != jogada) {

						System.out.print(jogada.getVazio());
					}
					if (horizontal == 2 && vertical == 0 && tabuleiro[horizontal][vertical] == maquina
							|| horizontal == 2 && vertical == 1 && tabuleiro[horizontal][vertical] == maquina
							
							

					) {
						System.out.printf(" %s", maquina.getMaquina());
						System.out.println();
					} else if (tabuleiro[horizontal][vertical] == maquina
							|| tabuleiro[horizontal][vertical] == tabuleiro[maquina_horizontal][maquina_vertical]
							|| tabuleiro[horizontal][vertical] != null && tabuleiro[horizontal][vertical] != jogada) {
						System.out.printf(" %s", maquina.getMaquina());
					}

					if (horizontal == 2 && vertical == 0 && tabuleiro[horizontal][vertical] == jogada
							|| horizontal == 2 && vertical == 1 && tabuleiro[horizontal][vertical] == jogada) {
						System.out.printf(" %s", jogada.getJogada());
						System.out.println();
					} else if (tabuleiro[horizontal][vertical] == jogada) {
						System.out.printf(" %s", jogada.getJogada());
					}

				}
			}
		}
	}

	// @Overload
	public static void Interface() {
		for (int vertical = 0; vertical < tabuleiro.length; vertical++) {
			for (int horizontal = 0; horizontal < tabuleiro.length; horizontal++) {

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
		boolean acabou = false;

		System.out.print("\n\tBem vindo ao jogo da velha usando " + "conceitos de orientaçao a objetos");
		System.out.println();
		Interface();

		Interface(acabou);

	}
}