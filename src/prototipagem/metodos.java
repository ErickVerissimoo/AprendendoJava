/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prototipagem;

import java.util.*;

/**
 *
 * @author Erick
 */
public abstract class metodos {

	public static void jogo() {

		String[] palavras = { "Macaco", "Elefante", "Cachorro", "Girafa", "Vaca" };
		Random random = new Random();
		int aleatorio = random.nextInt(5);
		int tentativas = 15;
		char letra;
		int i = 0;
		String palavra = palavras[aleatorio];
		Scanner entrada = new Scanner(System.in);
		ArrayList<Character> pale = new ArrayList<>();

		while (i < palavra.length()) {
			pale.add('_');
			i++;
		}

		while (tentativas > 0) {
			System.out.print("Entre com uma letra: ");
			letra = entrada.next().charAt(0);
			tentativas--;

			if (palavra.contains(String.valueOf(letra))) {
				for (int i2 = 0; i2 < palavra.length(); i2++) {
					if (Character.toUpperCase(letra) == Character.toUpperCase(palavra.charAt(i2))) {
						pale.set(i2, Character.toUpperCase(letra));
					}
				}
			}
			for (char c : pale) {
				System.out.print(c + " ");
			}
			System.out.println("\nTentativas restantes: " + tentativas);
			if (palavra.length() == palavra.length() - pale.size()) {
				System.out.print("Você venceu!");
				break;
			}

		}
		entrada.close();
	}

	public static void main(String[] args) {
		jogo();
	}
}
