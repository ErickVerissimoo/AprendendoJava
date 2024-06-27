/*
 * Este é o décimo sexto programa, o nome é diferente para convenção
 */

package source.introduçãoAProgramaçãoOrientadaObjeta;
import superClasse.*;
public class Eu extends Pessoa {
	
	/*
	 * O override consiste em sobreescrever um método herdados de uma superclasse
	 * ou implementados de uma interface. Ao usar o override em um determinado método, 
	 * você está substituindo o método original para aquela finalidade especifíca. Ou seja,
	 * o método original segue inalterado, mas aquele método sobreescrito terá um comportamento
	 * diferente do original. 
	 */
	@Override
	public void ComerFruta() {
		System.out.println("Comer fruta diferente ");
	}
	
	public static void main(String[] args) {
		Eu Erick = new Eu();
		Erick.ComerFruta();

	}
	
}
