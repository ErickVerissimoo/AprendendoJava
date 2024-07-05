package ignore.Testes;

public final class HelloWorld{
	public static String helloworld() {
		String helloworld = "hello world";
		
		return helloworld;
	}
	public static void main(String[] args) {
		
		 String helloworld = helloworld();
		 char [] helloworlds = helloworld.toCharArray();
		 for(int i = 0; i<helloworlds.length; i++) {
			 if(i%2 == 0) {
		 System.out.print(helloworld.toUpperCase().charAt(i));
	} else{
		 System.out.print(helloworld.toLowerCase().charAt(i));
	}
}}}