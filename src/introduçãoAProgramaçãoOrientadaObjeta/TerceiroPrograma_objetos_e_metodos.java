package introduçãoAProgramaçãoOrientadaObjeta;
import java.util.Scanner;
import Ignore.Empresa;

public class TerceiroPrograma_objetos_e_metodos {
	
	public static void main(String[] args) {
		int escolha=0;
		Scanner entrada = new Scanner (System.in);
		Empresa empresa1 = new Empresa();
		System.out.print("\n\tBem vindo ao programa genérico qualquer \n\tEntre com o nome:");
		empresa1.setNome(entrada.nextLine());
		System.out.println("o nome digitado foi" + empresa1.Nome + "\n\tEscolha entre demitir ou contratar: \n\t1: Demitir \n\tContratar");
		while(true) {
			escolha = entrada.nextInt();
			if (escolha ==1) {
			empresa1.demitir(Empresa.Funcionarios);
			}
			if (escolha == 2) {
				empresa1.contratar(Empresa.Funcionarios);
			}
			if (escolha!=1 && escolha!=2) {
				System.out.println("digite algo válido");
				break;
			}entrada.close();
		}
	}

}
