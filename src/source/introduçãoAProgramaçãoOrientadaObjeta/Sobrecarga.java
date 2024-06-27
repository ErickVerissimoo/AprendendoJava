/*
 * Este é o décimo quinto programa
 */

package source.introduçãoAProgramaçãoOrientadaObjeta;

public class Sobrecarga {
	/*
	 * O conceito de sobrecarga de métodos vem da capacidade do Java
	 * em distinguir um método do outro com base no contexto. Como assim?
	 * Vejamos os exemplos abaixo. Dois métodos quase que idênticos, sendo
	 * a única diferença o fato de um método somar um número a mais. Apesar
	 * de terem o mesmo nome, o mesmo tipo, o Java tem a capacidade de distinguir
	 * através da assinatura dos parâmetros, ou seja, pelo fato de haver um parâmetro 
	 * a mais de diferença entre um método e o outro, o Java entende que são
	 * métodos diferentes.
	 */
	int somar(int n1, int n2) {
		return n1 + n2;
	}
	int somar(int n1, int n2, int n3) {
		return n1+n2+n3;
	}
	public static void main(String[] args) {
		Sobrecarga sobrecarregado = new Sobrecarga();
		int resultado = sobrecarregado.somar(1,2,3);
		System.out.println(resultado);

	}

}
