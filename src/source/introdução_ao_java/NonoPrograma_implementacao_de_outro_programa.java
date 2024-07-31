package source.introdução_ao_java;

import java.util.Scanner;

public class NonoPrograma_implementacao_de_outro_programa {
	public static void main (String [] args) {
	Scanner entrada = new Scanner(System.in);
	float A;
	float B;
	int operacao;
	double resultado = 0;
	System.out.print("\tBem vindo ao programa calculadora \n\tDigite o primeiro número: ");
	A= entrada.nextFloat();
	System.out.print("\tDigite o segundo número");
	B = entrada.nextFloat();
	System.out.print("\tSelecione a operacao \n\n\t1 - Adição \n\t2 - Subtração \n\t3 - Multiplicação \n\t4 - Divisão \n\tInsira o número: ");
	operacao = entrada.nextInt();
	switch (operacao) {
	case 1:
		resultado = A+B;
		break;
	case 2:
		resultado = A-B;
		break;
	case 3:
		resultado = A*B;
		break;
	case 4:
		resultado = A/B;
		break;
		default:
			System.out.print("Insira algo válido");
			break;

	}
	System.out.print("\tO resultado da sua operacao é: " + resultado);
	entrada.close();
	}
	/*
	 * O programa acima é uma calculadora simples, que analisa a entrada
	 * inicial do usuário e os números inseridos, e com base na entrada
	 * inicial é definido o tipo de operação a ser realizada com os números.
	 */
}
