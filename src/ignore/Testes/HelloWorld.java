package ignore.Testes;

public class HelloWorld {
	protected static String helloworld = "Hello World!";
	HelloWorld(String helloworld) {
	}
	public static void main(String[] args) {
		HelloWorld hello = new HelloWorld(helloworld);
		System.out.println(HelloWorld.helloworld);
	}
}
