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
		// TODO Auto-generated method stub
		
	}

	public void multiplicar() {
		// TODO Auto-generated method stub
		
	}

	public void dividir() {
		// TODO Auto-generated method stub
		
	}

	public void potencia() {
		// TODO Auto-generated method stub
		
	}

	public void raizQuadrada() {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		calculadora calc = new calculadora();
		calc.somar();

	}
}
