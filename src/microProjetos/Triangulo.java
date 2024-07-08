package microProjetos;

public class Triangulo {
	double lado1;
	double lado2;
	double lado3;

public double area() {
	return (lado1 + lado2 + lado3) /2;
}
public String toString() {
	return "O calculo deu: " + String.format("%.2f", area());
	
	
}

}