package source.introduçãoAProgramaçãoOrientadaObjeta;

public class Animal {
	
	public static Animal novo() {
		
		return new Animal();
	}
	public static void main(String[] args) {
		Animal a = novo();
		System.out.print(a.toString());
	}

}
