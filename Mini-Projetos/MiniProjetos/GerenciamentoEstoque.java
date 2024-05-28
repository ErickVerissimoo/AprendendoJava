/*
 * Fui contratado em uma loja que vende produtos da área de informática, e fui 
 * encarregado de criar um pequeno sistema de gerenciamento do estoque da loja.
 * Um sistema simples, porém fácil de entender. O que o sistema precisa ser capaz
 * de fazer: adicionar produtos, contendo o nome do produto, descrição, quantidade
 * e preço unitário. O sistema deve ser capaz de atualizar os produtos do estoque, 
 * podendo remover ou adicionar novos produtos. O sistema deve ser capaz de consultar
 * um produto especifíco, podendo ver seu nome, descrição, quantidade e estoque dispo
 * nível. E como último requisito, o programa deve ser capaz de permitir ver todos
 * os produtos listados em estoque, ordenados por nome e preço.
 */

package MiniProjetos;
import classes.Produto;
import java.util.*;
public class GerenciamentoEstoque {
	/*
	 * Eu inicialmente tornei tudo isso static, pois creio que ter o acesso
	 * facilitado a esses objetos e atributos vai facilitar a construção do programa.
	 * Por exemplo, é útil o Scanner ser estático, para eu poder construir métodos e 
	 * facilitar o desenvolvimento do código.
	 */
	private static Scanner entrada = new Scanner(System.in);
	private static Produto produto = new Produto();
	private static int opcao2;
	private static int opcao;
	private static ArrayList <Produto> produtos = new ArrayList<>();
	public static void main(String[] args) {
		int i;
		System.out.print("\n\tMenu do estoque \n\tO que você deseja fazer: \n\n\t1 - Adicionar produto \n\t2 - Alterar produtos \n\t3 - Consultar produtos específicos \n\t4 - Ver estoque \n\t5 - Sair \n\n\tEntre com a escolha: ");
		opcao = entrada.nextInt();

		if (opcao == 1) {
			do {
				AdicionarProduto();
				opcao2 = entrada.nextInt();
				while (opcao2 == 1) {
					AdicionarProduto();
				}  
			 }while(opcao !=2);}
			else if (opcao == 2) {
			for (i=0; i>=produtos.size(); i++) {
				System.out.println(produtos.get(i));
			}}entrada.close();} 
	
				public static void AdicionarProduto() {
				System.out.print("\n\tVocê escolheu adicionar produto! \n\tEntre com o nome do produto: ");
				produto.setNome(entrada.next());
				System.out.print("\n\tEntre com a descrição do produto: ");
				produto.setDescricao(entrada.next());
				System.out.print("\n\tEntre com o preço:");
				produto.setPreco(entrada.nextDouble());
				System.out.print("\n\tEntre com a quantidade");
				produto.setQuantidade(entrada.nextInt());
				produtos.add(produto);
				System.out.println("\n\tProduto adicionado com sucesso! \n\tVocê deseja cadastrar outro produto? \n\t1- sim \n\t2 - não");
				opcao2 = entrada.nextInt();}
			
	public static void AlterarProduto() {
		System.out.println("Você escolheu alterar produto!");
	}
	public static void ConsultarProduto() {
		System.out.print("Você escolheu consultar produtos!");
	}
}

	
