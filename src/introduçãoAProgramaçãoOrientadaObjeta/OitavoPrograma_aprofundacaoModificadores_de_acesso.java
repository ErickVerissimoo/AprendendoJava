package introduçãoAProgramaçãoOrientadaObjeta;
import classes.Pessoa;
import java.util.Scanner;
public class OitavoPrograma_aprofundacaoModificadores_de_acesso {
	
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		Pessoa pessoa = new Pessoa();
		System.out.println("Entre com o nome");
		pessoa.setNome(entrada.next());
		System.out.println(pessoa.getNome());
		entrada.close();
	}

}
