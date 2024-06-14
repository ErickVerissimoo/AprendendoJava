package MiniProjetos;
import java.util.*;
import classes.RegrasCalculadora;
public class calculadora implements RegrasCalculadora {
	public static int opcao;
	static Scanner entrada = new Scanner(System.in);
	static ArrayList <Double> numeros = new ArrayList <>();
	static double Vetor [][] = new double[1000] [1000];
	double a, b, c;
	    public void somar() {
	        double soma = 0;
	        System.out.print("Você escolheu somar! Entre com o primeiro número: ");
	        double a = entrada.nextDouble();
	        System.out.print("Entre com o segundo número: ");
	        double b = entrada.nextDouble();
	        soma = a + b;
	        System.out.printf("\nA soma é %.2f%n", soma);
	        int opcao;
	        do {
	            System.out.print("\nVocê deseja continuar?" +
	                    "\n1 - sim" +
	                    "\n2 - não: ");
	            opcao = entrada.nextInt();
	            if (opcao == 1) {
	                System.out.print("Entre com mais um número para ser adicionado: ");
	                double c = entrada.nextDouble();
	                soma += c;
	                System.out.printf("A soma disso é: %.2f%n", soma);
	            }
	        } while (opcao == 1);
	    }
	public void subtrair() {
		double resto = 0;
        System.out.print("Você escolheu somar! Entre com o primeiro número: ");
        double a = entrada.nextDouble();
        System.out.print("Entre com o segundo número: ");
        double b = entrada.nextDouble();
        resto = a - b;
        System.out.printf("\nA soma é %.2f%n", resto);
        int opcao;
        do {
            System.out.print("\nVocê deseja continuar?" +
                    "\n1 - sim" +
                    "\n2 - não: ");
            opcao = entrada.nextInt();
            if (opcao == 1) {
                System.out.print("Entre com mais um número para ser adicionado: ");
                double c = entrada.nextDouble();
                resto -= c;
                System.out.printf("A soma disso é: %.2f%n", resto);
            }
        } while (opcao == 1);
		
	}

	public void multiplicar() {
		double multi= 0;
        System.out.print("Você escolheu somar! Entre com o primeiro número: ");
        double a = entrada.nextDouble();
        System.out.print("Entre com o segundo número: ");
        double b = entrada.nextDouble();
        multi = a * b;
        System.out.printf("\nA soma é %.2f%n", multi);
        int opcao;
        do {
            System.out.print("\nVocê deseja continuar?" +
                    "\n1 - sim" +
                    "\n2 - não: ");
            opcao = entrada.nextInt();
            if (opcao == 1) {
                System.out.print("Entre com mais um número para ser adicionado: ");
                double c = entrada.nextDouble();
                multi *= c;
                System.out.printf("A soma disso é: %.2f%n", multi);
            }
        } while (opcao == 1);
		
	}

	public void dividir() {
		double divisao = 0;
        System.out.print("Você escolheu somar! Entre com o primeiro número: ");
        double a = entrada.nextDouble();
        System.out.print("Entre com o segundo número: ");
        double b = entrada.nextDouble();
        divisao = a / b;
        System.out.printf("\nA soma é %.2f%n", divisao);
        int opcao;
        do {
            System.out.print("\nVocê deseja continuar?" +
                    "\n1 - sim" +
                    "\n2 - não: ");
            opcao = entrada.nextInt();
            if (opcao == 1) {
                System.out.print("Entre com mais um número para ser adicionado: ");
                double c = entrada.nextDouble();
                divisao /= c;
                System.out.printf("A soma disso é: %.2f%n", divisao);
            }
        } while (opcao == 1);
		
	}

	public void potencia() {
		double pow = 0;
        System.out.print("Você escolheu somar! Entre com o primeiro número: ");
        double a = entrada.nextDouble();
        System.out.print("Entre com o segundo número: ");
        double b = entrada.nextDouble();
        pow = Math.pow(a, b);
        System.out.printf("\nA soma é %.2f%n", pow);
        int opcao;
        do {
            System.out.print("\nVocê deseja continuar?" +
                    "\n1 - sim" +
                    "\n2 - não: ");
            opcao = entrada.nextInt();
            if (opcao == 1) {
                System.out.print("Entre com mais um número para ser adicionado: ");
                double c = entrada.nextDouble();
                pow = Math.pow(pow, c);
                System.out.printf("A soma disso é: %.2f%n", pow);
            }
        } while (opcao == 1);
		
	}

	public void raizQuadrada() {
		double Quadrado = 0;
        System.out.print("Você escolheu somar! Entre com o primeiro número: ");
        Quadrado = entrada.nextDouble();
        System.out.printf("\nA soma é %.2f%n", Math.sqrt(Quadrado));
        System.out.println("\n\tVoce deseja continuar? \n\t1 - sim \n\t2 - Não");
        int opcao;
        do {
            System.out.print("\nVocê deseja continuar?" +
                    "\n1 - sim" +
                    "\n2 - não: ");
            opcao = entrada.nextInt();
            if (opcao == 1) {
                System.out.print("Entre com mais um número para ser adicionado: ");
                Quadrado  = entrada.nextDouble();
                System.out.printf("A soma disso é: %.2f%n", Math.sqrt(Quadrado));
            }
        } while (opcao == 1);
		
	}
	public static void main(String[] args) {
		calculadora calc = new calculadora();
		System.out.println("\n\tBem vindo a calculadora! "
				+ "\n\tO que você deseja fazer? ");
	}
}
