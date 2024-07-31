package source.introduçãoAProgramaçãoOrientadaObjeta;
import source.classes.Casa;

public class QuartoPrograma_construtores{

	public static void main(String[] args) {
		/*
		 * Abaixo instanciamos o objeto casa 2 e chamamos o método construtor
		 * contido no pacote "classes" que foi importado inicialmente em cima do arquivo.
		 * No arquivo "Casa.java" definimos a classe Casa, seus atributos de acesso público,
		 * para permitir que qualquer outra classe a acesse. Por fim, no mesmo arquivo existe
		 * os métodos construtores que usam dois parametros do tipo double. Depois que é definido
		 * o parametro de um construtor, é necessário usar o construtor E seus parametros juntamente.
		 * O construtor é necessário para criar e inicializar os métodos, atributos e onjetos de uma classe.
		 */
	Casa casa2 = new Casa(22, 23);
	/*
	 * Abaixo nós imprimimos o valor do atributo inicializado através do
	 * construtor.
	 */
	System.out.println(casa2.altura);


	}}
