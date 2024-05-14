package introdução_ao_java;
import java.util.Scanner;
import java.lang.Math;
public class DécimoOitavoPrograma_calculadoracompleta {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int menu;
		float num1 = 0;
		float num2 = 0;
		float resultado = 0;
		double B= 0;
		double A = 0;
		double resultado2 = Math.pow(A, B);
		System.out.print("\n\tBem vindo a calculadora \n\tMenu \n\n\t1: Soma \n\t2: Subtração \n\t3: Multiplicação \n\t4: Divisão \n\t5: Potenciação \n\t6: Sair \n\n\tEntre com o número: ");
		menu = entrada.nextInt();
		switch (menu) {
		case 1:
			System.out.print("\n\tEntre com o primeiro número: ");
			num1 = entrada.nextFloat();
			System.out.print("\n\tVocê digitou: " + num1 + "\n\n\tEntre com o segundo número: ");
			num2 = entrada.nextFloat();
			resultado = num1 + num2;
			System.out.print("\n\tA soma é: " + resultado);
			break;
		case 2:
			System.out.print("\n\tEntre com o primeiro número: ");
			num1 = entrada.nextFloat();
			System.out.print("\n\tVocê digitou: " + num1 + "\n\n\tEntre com o segundo número: ");
			num2 = entrada.nextFloat();
			resultado = num1 - num2;
			System.out.print("\n\tA subtração é: " + resultado);
			break;
		case 3:
			System.out.print("\n\tEntre com o primeiro número: ");
			num1 = entrada.nextFloat();
			System.out.print("\n\tVocê digitou: " + num1 + "\n\n\tEntre com o segundo número: ");
			num2 = entrada.nextFloat();
			resultado = num1 * num2;
			System.out.print("\n\tA multiplicação é: " + resultado);
			break;
		case 4:
			System.out.print("\n\tEntre com o primeiro número: ");
			num1 = entrada.nextFloat();
			System.out.print("\n\tVocê digitou: " + num1 + "\n\n\tEntre com o segundo número: ");
			num2 = entrada.nextFloat();
			resultado = num1 / num2;
			System.out.print("\n\tA divisão é: " + resultado);
			break;
		case 5: 
			System.out.print("\n\tEntre com o primeiro número: ");
			A = entrada.nextDouble();
			System.out.print("\n\tVocê digitou: " + A + "\n\n\tEntre com o segundo número: ");
			B = entrada.nextDouble();
			resultado2 = Math.pow(A, B);
			System.out.print("\n\tA potenciação é: " + resultado2);
			break;
			case 6:
				System.out.print("\n\tPrograma fechado");
				break;
				default:
				System.out.print("\n\tEntre com algo válido");
		}
	}

}
