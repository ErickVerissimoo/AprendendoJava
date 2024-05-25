package introduçãoAProgramaçãoOrientadaObjeta;
import classes.Numero;
public class DécimoPrimeiroPrograma_variaveis_estaticas {

	public static void main(String[] args) {
		/*
		 * vejam o arquivo "classes -> Numero" para obter mais detalhes 
		 * das classes e da variavel estática contida no construtor destes códigos.
		 */
		Numero num = new Numero();
		Numero num2 = new Numero();
		/*
		 * Variveis estaticas são compartilhadas entre todas as
		 * derivações da classe na qual pertence. Variaveis estáticas
		 * podem ser acessadas livremente pelos objetos instanciados da classe, e quando
		 * são estaticas e públicas, podem ser acessadas até mesmo por classes 
		 * diferentes facilmente e alocadas em outra váriavel, como vemos abaixo.
		 * Isso ocorre porque enquanto que as variaveis não estaticas são alocadas
		 * separadamente na memória, e para utiliza-las deve-se fazer de maneira mais
		 * individual, as estáticas ocupam um único espaço da memória, e cada código
		 * que usa a váriavel estática, está usando o mesmo espaço que os outros códigos.
		 * Ou seja, uma váriavel estática é compartilhada para muitos códigos, uma relação
		 * de um para N.
		 */
		int B = Numero.A;
		int C = Numero.A;
		System.out.println(B);
		System.out.print(C + 3);
		

	}

}
