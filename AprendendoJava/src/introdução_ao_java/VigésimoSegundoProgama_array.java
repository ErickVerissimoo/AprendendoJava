package introdução_ao_java;

public class VigésimoSegundoProgama_array {
	
	public static void main(String[] args) {
		/*
		 * O comando abaixo cria um array, que possibilita que
		 * uma váriavel receba mais de um valor. Neste caso, até 6 valores 
		 * inteiros. Isso é útil para lidar com múltiplas váriaveis ao mesmo tempo
		 */
		int [] numeros = new int [6];
		/*
		 * Os comandos abaixo definem os valores de cada posição das váriaveis. Um array tem
		 * forma de matrizes e ocupam determinado espaço, e pode ser definido manualmente o valor
		 * de cada espaço. 
		 */
		numeros [0] = 29;
		numeros [1] = 2;
		numeros [2] = 12;
		numeros [3] = 33;
		numeros [4] = 44;
		numeros [5] = 55;
		/*
		 * É assim que imprimimos uma posição da array determinada, colocando o nome da váriavel
		 * e sua posição. No caso, a posição 3, no caso o resultado do comando abaixo é 33.
		 */
		System.out.print( numeros[3]);

	}

}
