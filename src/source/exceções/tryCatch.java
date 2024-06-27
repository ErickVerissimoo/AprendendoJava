package source.exceções;
import java.util.*;
public class tryCatch {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		int idade = 0;
		try {
		System.out.print("\n\tEntre com sua idade: ");
		idade = entrada.nextInt();
		System.out.printf("\n\tsua idade é %d", idade);} 
		catch(Exception e) {
			System.out.println("entrada invalida");
		}
		finally {
			System.out.println("programa terminado");
		}
	
		
	}

}
