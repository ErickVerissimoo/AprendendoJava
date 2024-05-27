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
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int opcao;
		ArrayList <Produto> produtos = new ArrayList<>();
		System.out.print("\n\tMenu do estoque \n\tO que você deseja fazer: \n\n\t1 - Adicionar produto \n\t2 - Alterar produtos \n\t3 - Consultar produtos específicos \n\t4 - Ver estoque \n\t5 - Sair \n\n\tEntre com a escolha: ");
		opcao = entrada.nextInt();
	
		do {
		Produto produto = new Produto();
		double Preco = produto.getPreco();
		double Quantidade = produto.getQuantidade();
		String descricao = produto.getDescricao();
		if (opcao == 1) {
			System.out.println("\n\tVocê escolheu adicionar produto! \n\tEntre com o nome do produto: ");
			produto.setNome(entrada.next());
			System.out.println("\n\tEntre com a descrição do produto: ");
			produto.setDescricao(entrada.next());
			System.out.println("\n\tEntre com o preço:");
			produto.setPreco(entrada.nextDouble());
			System.out.println("Entre com a quantidade");
			produto.setQuantidade(entrada.nextInt());
			produtos.add(produto);
		}
		}while( opcao != 5);
	}

}
