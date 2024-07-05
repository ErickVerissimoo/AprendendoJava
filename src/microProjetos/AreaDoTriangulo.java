package microProjetos;
import microProjetos.Triangulo;
import java.util.*;
public class AreaDoTriangulo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Triangulo base, altura;
		base = new Triangulo();
		altura = new Triangulo();
		System.out.println("Entre com a base ");
		base.base = entrada.nextDouble();
		System.out.println("Entre com a altura: ");
		altura.altura = entrada.nextDouble();
		double resultado = (base.base * altura.altura)/2;
		System.out.println(resultado);
		entrada.close();
	}

}
