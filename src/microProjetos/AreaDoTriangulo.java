package microProjetos;

import java.util.Locale;
import java.util.Scanner;

public class AreaDoTriangulo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada;
		entrada = new Scanner(System.in);
		Triangulo x;
		x = new Triangulo();
		System.out.println("Entre com o lado 1: ");
		x.lado1 = entrada.nextDouble();
		System.out.println("Entre com o lado 2: ");
		x.lado2 = entrada.nextDouble();
		System.out.println("Entre com o lado 3: ");
		x.lado3 = entrada.nextDouble();
		System.out.println(x);
		entrada.close();
		
		Triangulo [] xz = new Triangulo [2];
	}

}
