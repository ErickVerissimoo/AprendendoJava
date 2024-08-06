package source.microConteudos;

public class ClasseAnonima  {
	/*
	 * Abaixo temos uma interface funcional, isto é,
	 * interfaces que contém um, e somente um método abstrato,
	 * ou seja, não implementada nada após os parenteses. Isto 
	 * permite a utilização de lambdas.
	 */
	  public interface cachorro{
		    void latir();
		    /*
		     * Métodos default são metodos de interface que permitem a 
		     * criação de implementações para o método, na qual permite
		     * que objetos que implementaram a interface usem destes métodos.
		     */
			default void correr() {
			System.out.print("\n\tcorrendo");
			}
			/*
			 * Diferentemente dos métodos default que são passados para
			 * o objeto, métodos estáticos não são, e para serem usados
			 * necessita-se chamar a interface cachorro seguido do nome
			 * do método. 
			 */
			public static void andar() {
				System.out.print("\n\tandando");
			}
		}
	  
		/*
		 * O inicializador estático é uma forma de executar um código
		 * ANTES do método main. Ou seja, o código abaixo é executado 
		 * primeiro que o método main. 
		 */
	static {
	for(char a = 'a'; a<'z';a++) {
		
		System.out.println(Character.toUpperCase(a));
	}
	}
	

	public static void main(String[] args) throws Exception {
		cachorro Cao = (() -> System.out.print("\n\tai"));
		Cao.latir();
		Cao.correr();
		cachorro.andar();
		//Uma das formas de acessar a interface
		ClasseAnonima.cachorro.andar();
		throw new Exception ("Teste");
}
	static{
		System.out.print("\n\tAntes do main");
	}
}