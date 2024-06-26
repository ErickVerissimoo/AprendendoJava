package MiniProjetos;
import java.util.*;
public class geradorEmail {
	public static void Gerar() {
		int i = 0;
		String caracteres = "AhbcJNDAJSBoa asdkbJNJASND-IWQ9I3480938%r(&@*&@(*@)(NDNLXCDOHF]~ÇQP2=02475HD*-";
		Random senha = new Random();
		Scanner entrada = new Scanner (System.in);
		System.out.println("Bem vindo ao gerador de email e senha para um funcionario contratado"
				+ "digite o nome do funcionario:");
		String nome = entrada.next();
		System.out.println("Digite o sobrenome:");
		String sobrenome = entrada.next();
		System.out.println("Digite o ano de nascimento:");
		int ano = entrada.nextInt();
		System.out.printf("\n\temail: %s%s%d@empresa.com", nome, sobrenome, ano);
		while(i<10) {
			Random carac = new Random();
			int c = carac.nextInt();
			c = caracteres.length();
			caracteres.length();
			i++;
		}
		System.out.print("A sua senha é:" + caracteres);
	}
	public static void main(String[] args) {
		Gerar();
	}

}
