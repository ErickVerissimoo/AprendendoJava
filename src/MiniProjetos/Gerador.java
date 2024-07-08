package MiniProjetos;
import java.util.Scanner;

import source.superClasse.SerVivo;
public class Gerador extends SerVivo {
	protected Gerador(String tipo, int idade, Boolean sexo, Boolean extinto) {
		super(tipo, idade, sexo, extinto);
	}
	public static void main(String[] args) {
		Scanner entrada;
		entrada = new Scanner (System.in);
		System.out.println("Entre com o nome do animal");
		String tipo = entrada.next();
		System.out.println("Entre com a idade do animal");
		int idade = entrada.nextInt();
		System.out.println("\n\t1 - Macho \n\t2 - Femea");
		int sexo = entrada.nextInt();
		boolean Sexo;
		if(sexo == 1) {
			Sexo = true;
		} 
		else {
			Sexo = false;
		}
		System.out.println("\n\t1 - Está extinto \n\t2 - Não está extinto");
		int extincao = entrada.nextInt();
		boolean extinto;
		if(extincao == 1) {
			extinto = true;
		}else {
			extinto = false;
		}
		SerVivo macaco;
		macaco = new SerVivo(tipo, idade, Sexo, extinto);
		entrada.close();
	}
}
