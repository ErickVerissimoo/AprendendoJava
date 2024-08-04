package source.microConteudos;

public class ClasseAnonima  {
	static {
	for(char a = 'a'; a<'z';a++) {
		
		System.out.println(Character.toUpperCase(a));
	}
	}
	
  interface cachorro{
	    void latir();
		default void correr() {
		System.out.print("\n\tcorrendo");
		}
		public static void andar() {
			System.out.print("\n\tandando");
		}
	}
	public static void main(String[] args) {
		cachorro Cao = (() -> System.out.print("\n\tai"));
		Cao.latir();
		Cao.correr();
		cachorro.andar();

}
	static{
		System.out.print("\n\tAntes do main");
	}
}