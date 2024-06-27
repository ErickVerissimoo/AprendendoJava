/*
 * Esse é o décimo segundo programa de programação orientada a objetos, 
 * apenas tem outro nome para não ficar muito extensa a instanciação de objetos.
 */

package source.introduçãoAProgramaçãoOrientadaObjeta;
import source.classes.Jogos;
public class Interface implements Jogos {
	/*
	 * O interface é basicamente um "contrato" na qual nele, é definido
	 * uma série de métodos obrigatórios a ser implementados naquela classe.
	 * Elas são muito úteis para padronizar programas e lidar com métodos abstratos
	 * (falaremos mais sobre abstract depois). O importante é saber que 
	 * caso a classe na qual foi implementada a interface não siga as regras
	 * de métodos estabelecidas no contrato, exibirá um erro. Também falaremos depois
	 * sobre "override" e sobrecarga. 
	 */
	@Override
	public void Iniciar() {
		System.out.println("iniciar");
		
	}
		public static void main (String [] args) {
			Interface jogo = new Interface();
			jogo.Iniciar();
	}

	

	}
