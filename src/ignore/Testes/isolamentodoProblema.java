package ignore.Testes;
import java.util.ArrayList;
import java.util.Scanner;

import source.classes.Produto;
public class isolamentodoProblema {
	public static Scanner entrada = new Scanner(System.in);
	public static int opcao = 0;
	static int opcao2;
	static int opcao3 = 0;
	static int opcao4;
	static ArrayList <Produto> produtos = new ArrayList<>();
	public static void main(String[] args) {
		Exibir_menu_inicial();
		if(opcao==3 || opcao3==1) {
			ConsultarProduto();
			while(opcao3!= 1 && opcao3 !=2) {
				System.out.print("\n\tEntrada inválida! Tente novamente: ");
				opcao3 = entrada.nextInt();}
			if(opcao3==2) {
				Exibir_menu_inicial();
			}	}
}
public static void Exibir_menu_inicial() {
System.out.print("\n\tMenu inicial \n\tO que você deseja fazer: \n\n\t1 - Adicionar produto "
		+ "\n\t2 - Alterar produtos \n\t3 - Consultar produtos específicos"
		+ " \n\t4 - Ver estoque "
		+ "\n\t5 - Sair \n\n\tEntre com a escolha: ");
opcao = entrada.nextInt();
}
public static void ConsultarProduto() {
	int consulta;
	int i=0;
	System.out.print("\n\tVocê escolheu consultar produtos!");
	while (i<produtos.size()) {
		System.out.println("                                                   ");
		System.out.printf("\n\tID:%d \n\tNome: %s",i+1, produtos.get(i).getNome());
		System.out.println("                                                    ");
		i++;
	}
	System.out.print("\n\tDigite o produto a ter seus dados consultados: ");
	consulta = entrada.nextInt();
	while (consulta-1 < 0 || consulta-1 >= produtos.size()) {
	    System.out.print("\n\tEntrada inválida! Tente novamente: ");
	    consulta = entrada.nextInt();
	}
	System.out.printf("\n\n\tNome: %s "
			+ "\n\n\tDescrição: %s "
			+ "\n\n\tPreço: %f "
			+ "\n\n\tQuantidade: %d ", produtos.get(consulta-1).getNome(),
			produtos.get(consulta-1).getDescricao(),
			produtos.get(consulta-1).getPreco(),
			produtos.get(consulta-1).getQuantidade());
	System.out.println("\n\n\tConsulta realizada com sucesso! "
			+ "\n\tVocê deseja consultar outro produto? "
			+ "\n\t1 - Sim \n\t2 - Não"
			+ "\n\n\tEntre com a escolha: " );
	opcao3 = entrada.nextInt();
}
public static void AdicionarProduto() {
	Produto produto = new Produto();
	System.out.print("\n\tVocê escolheu adicionar produto! "
			+ "\n\tEntre com o nome do produto: ");
	produto.setNome(entrada.next());
	System.out.print("\n\tEntre com a descrição do produto: ");
	produto.setDescricao(entrada.next());
	System.out.print("\n\tEntre com o preço: ");
	produto.setPreco(entrada.nextDouble());
	System.out.print("\n\tEntre com a quantidade: ");
	produto.setQuantidade(entrada.nextInt());
	produtos.add(produto);
	System.out.print("\n\tProduto adicionado com sucesso! "
			+ "\n\tVocê deseja cadastrar outro produto? "
			+ "\n\t1 - sim "
			+ "\n\t2 - não \n\n\tEntre com a opção: ");
	opcao2 = entrada.nextInt();
	}
}



