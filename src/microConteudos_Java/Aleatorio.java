package microConteudos_Java;
import java.util.*;
public class Aleatorio {

	public static void main(String[] args) {
		Random aleatorio = new Random();
		int numero = aleatorio.nextInt(100);
		System.out.println(numero);
	}

}
