package MiniProjetos;
import java.util.*;
import classes.RegrasCalculadora;
public class calculadora implements RegrasCalculadora {
	public static int opcao;
	static Scanner entrada = new Scanner(System.in);
	static ArrayList <Double> numeros = new ArrayList <>();
	static double Vetor [][] = new double[1000] [1000];
	double a, b;
	public void somar() {
		System.out.print("Você escolheu somar! Entre com o primeiro numero  ");
		a = entrada.nextDouble();
		System.out.println("Entre com o segundo numero: ");
		b = entrada.nextDouble();
		Vetor [999][999] = a+b;
		System.out.printf("\n\tA soma é %f ", a+b);
		System.out.print( "\n\tVocê deseja continuar?" 
				+ "\n\t1 - sim"
				+ "\n\t2 - não" );
		opcao = entrada.nextInt();
		while(opcao==1) {
		for (int i = 0; i<Vetor.length;i++) {
			double c;
			System.out.println("Entre com mais um número para ser adicionado: ");
			c = entrada.nextInt();
			Vetor [i][i] = c;
			System.out.printf("A soma disso é: %f ",a+b+c);
		}
		}
		
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
