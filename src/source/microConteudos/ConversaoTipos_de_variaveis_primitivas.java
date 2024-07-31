package source.microConteudos;

public class ConversaoTipos_de_variaveis_primitivas {

	public static void main(String[] args) {
		int A = 70;
		float H = 33.2f;
		/*
		 * Para convertemos um tipo de váriavel para outra váriavel,
		 * declaramos a váriavel que receberá aquele valor, e colocamos
		 * entre parenteses o tipo da váriavel que será passada para a váriavel
		 * receptora. Ao passar a váriavel A do tipo float para B, ela se transfor
		 * mará em um tipo double. Existem limitações, por exemplo, uma váriavel
		 * do tipo int não pode converter váriaveis do tipo float ou double, mas o
		 * contrário sim. Double ou int pode receber um inteiro. Para o char, é
		 * necessário usar um método que retorna um caractere seguindo a tabela
		 * binária da ASCII. Por exemplo, na tabela ASCII, o número 70 representa
		 * a letra F, logo seu retorno será F.
		 */
		double essd = H;
		char B = (char) A;
		System.out.println(B + "\n\t" + "Float convertido para double: " + essd);
	}

}
