package ignore.Testes;

public final class HelloWorld {
	public static String helloworld() {
		String helloworld = "hello world";
		return helloworld;
	}

	public static void main(String[] args) {

		String helloworld = helloworld();
		for (int i = 0; i < helloworld.length(); i++) {
			if (i % 2 == 0) {
				helloworld.trim();
				System.out.print(helloworld.trim().toUpperCase().charAt(i));
			} else {
				System.out.print(helloworld.trim().toLowerCase().charAt(i));
			}
		}
	}

}