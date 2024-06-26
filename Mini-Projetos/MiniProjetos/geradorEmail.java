package MiniProjetos;
import java.util.*;
public class geradorEmail {
	public static void Gerar() {
		Random carac = new Random();
		int c = carac.nextInt(17);
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
				++i;
				System.out.printf("\n\tA sua senha é: %s%s%s%s%s%s%s%s%s%s"
						+ "%s%s%s%s%s%s%s",caracteres.charAt(c+i),
						caracteres.charAt(c+i),caracteres.charAt(c+i),
						caracteres.charAt(c),caracteres.charAt(c+i),
						caracteres.charAt(c),caracteres.charAt(c),
						caracteres.charAt(c), caracteres.charAt(c),
						caracteres.charAt(c), caracteres.charAt(c),
						caracteres.charAt(c), caracteres.charAt(c),
						caracteres.charAt(c), caracteres.charAt(c),
						caracteres.charAt(c), caracteres.charAt(c)
								
						);
			}
		}
	public static void main(String[] args) {
		Gerar();
	}

}
