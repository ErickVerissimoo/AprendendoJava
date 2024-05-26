package introduçãoAProgramaçãoOrientadaObjeta;
import java.util.ArrayList;
import java.util.Scanner;
public class DécimoTerceiroPrograma_aprofundamentoArrayList {

	public static void main(String[] args) {
		/*
		 * Após importar a classe arraylist, precisamos instanciá-la como está
		 * abaixo. Arraylist é um tipo de array mais dinâmico. Como assim? Bem, 
		 * um array comum, ou estático, tem sua manipulação limitada. Por exemplo,
		 * ao definir o tamanho de um array, você não poderá alterar esse tamanho,
		 * e para acessar cada posição do array estático, usa-se colchetes "[]". Em
		 * contrapartida, um arrayList é mais volátil, ou seja, seu tamanho pode ser
		 * mudado, e além disso, só pode ser acessado por métodos específicos de um 
		 * arrayList. Esses métodos de arraylist dão mais dinamicidade e usabilidade
		 * a um arraylist, permitindo usá-lo de diversas formas, formas essas que
		 * um array comum não suportaria.
		 */
		ArrayList <String> Nomes = new ArrayList<String>();
		Scanner entrada = new Scanner (System.in);
		System.out.println("Entre com um nome");
		Nomes.add(entrada.next());
		System.out.println(Nomes + "\n\tA");
		entrada.close();

	}

}
