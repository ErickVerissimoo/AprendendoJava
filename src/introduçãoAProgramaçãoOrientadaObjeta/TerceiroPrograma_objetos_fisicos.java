/*
 * Código com problemas lógicos a ser resolvido
 */

package introduçãoAProgramaçãoOrientadaObjeta;
import Ignore.Empresa;
import java.util.Scanner;
public class TerceiroPrograma_objetos_fisicos{
	
	public static void main(String[] args) {
		int entrada1 = 0;
		Scanner entrada = new Scanner (System.in);
			Empresa empresa = new Empresa();
			empresa.num_funcionarios = empresa.demitir();
			while(true) {
			System.out.println("\n\tO que você deseja fazer? \n\t1:Demitir \n\t2:Contratar \n\tEntre com o numero");
			entrada1 = entrada.nextInt();
			if (entrada1 ==1) {
			 empresa.demitir();
			 System.out.println(empresa.num_funcionarios);
			}
			else if (entrada1==2) {
				empresa.contratar();
			}
				if (entrada1!=1 && entrada1!=2){
				System.out.println("insira algo válido fdp");
				break;
			}
				
	}entrada.close();}}
