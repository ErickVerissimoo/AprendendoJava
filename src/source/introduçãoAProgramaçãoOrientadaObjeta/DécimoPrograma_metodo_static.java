package source.introduçãoAProgramaçãoOrientadaObjeta;
import source.classes.Calculadora;
public class DécimoPrograma_metodo_static {

	public static void main(String[] args) {
		
		/*
		 * métodos statics pertencem a uma determinada classe, porém 
		 * não tem necessidade de serem instanciados. Ou seja, não tem
		 * necessidade de passar pelo processo de <classe> <nome do objeto> =
		 * new <classe>(); , a estrutura comum de instanciação de objetos.
		 * A única limitação é que os métodos estáticos não podem estar
		 * atrelados a nenhuma classe que não seja aquela em que o método
		 * está inserido. Ou seja, se o método estático pertence a classe A, 
		 * ele não pode ser chamado como referência da classe B. Por exemplo, os
		 * seguintes códigos são inválidos: double resultado = Calculadora.CalculadoraFuncionario.Erick(200, 90);
		 * double resultado = Calculadora.CalculadoraFuncionario.Funcionario(200, 90); 
		 * 
		 */
	double resultado = Calculadora.CalculadoraFuncionario(200, 90);
	System.out.println(resultado); 
	}

}
