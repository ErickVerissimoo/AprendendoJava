package introduçãoAProgramaçãoOrientadaObjeta;
import java.util.Scanner;
import classes.Empresa;
public class TerceiroPrograma_metodos_e_objetos {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		Empresa empresa1 = new Empresa();
		int escolha;
		while (true) {
		System.out.print("\n\tO que você quer fazer? \n\t1 - Demitir \n\t2 - Contratar");
		escolha = entrada.nextInt();
		if (escolha ==1) {
			empresa1.demitir();
		}
		if(escolha == 2) {
			empresa1.contratar();
		}
		if(escolha!= 1 && escolha!=2) {
			System.out.println("\n\tInválido");
			break;
		}
		

		}entrada.close();}}


