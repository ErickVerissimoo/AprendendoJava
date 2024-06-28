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
import source.classes.Produto;
import java.util.*;
public class GerenciamentoEstoque {
	/*
	 * Eu inicialmente tornei tudo isso static, pois creio que ter o acesso
	 * facilitado a esses objetos e atributos vai facilitar a construção do programa.
	 * Por exemplo, é útil o Scanner ser estático, para eu poder construir métodos e 
	 * facilitar o desenvolvimento do código.
	 */
	private static Scanner entrada = new Scanner(System.in);
	private static int opcao, opcao2, opcao3, opcao4;
	private static ArrayList <Produto> produtos = new ArrayList<>();
	public static void main(String[] args) {
	Exibir_menu_inicial();
	if(opcao==3 || opcao3==1) {
	while(opcao==3 || opcao3==1) {
		ConsultarProduto();		
		while(opcao3!= 1 && opcao3 !=2) {
			System.out.print("\n\tEntrada inválida! Tente novamente: ");
			opcao3 = entrada.nextInt();}
		if(opcao3==2) {
			Exibir_menu_inicial();
		}	}}
	while(produtos.size()==0 && opcao==4 || opcao==3 || opcao==2) {
		System.out.print("\n\tO estoque está vazio! Adicione produtos para poder consultá-los"
				+ "\n\n\tDigite outra opção: ");
		opcao = entrada.nextInt();}
		 while(opcao==1 || opcao2==1) {
				AdicionarProduto();
				  while(opcao2!= 1 && opcao2 !=2) {
						System.out.print("\n\tEntrada inválida! Tente novamente: ");
						opcao2 = entrada.nextInt();
				}
				if(opcao2==2) {
					Exibir_menu_inicial();
				}}
		 if(opcao==2 || opcao4==1) {
		while(opcao==2 || opcao4==1) {
						AlterarProduto();
						if (opcao4==2) {
							Exibir_menu_inicial();}
				}
		while(opcao==4 && produtos.size()>=1) {
			Consultar_estoque();
			System.out.print("                                          ");
			Exibir_menu_inicial();	
		}}
			while(opcao !=1 && opcao!=2 && opcao!=3 && opcao!=4) {
				if(opcao==5) {
					System.out.print("\n\tPrograma encerrado");
					break;
				}
				else {
					System.out.println("\n\n\tOpcão inválida! \n\tTente novamente: ");
				opcao = entrada.nextInt();
		}}
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
				System.out.print("""
                                                 
                                                 \tProduto adicionado com sucesso! 
                                                 \tVoc\u00ea deseja cadastrar outro produto? 
                                                 \t1 - sim 
                                                 \t2 - n\u00e3o 
                                                 
                                                 \tEntre com a op\u00e7\u00e3o: """);
				opcao2 = entrada.nextInt();
				}
				public static void AlterarProduto() {	
				int escolha, quantidade, i=0;
				double preço;
				int alterarproduto;
				String alteracao, opcao;
				System.out.print("\n\n\tQual produto você deseja alterar?");
				while(i<produtos.size()) {		
			System.out.printf("\n\t%d - %s" ,i+1,produtos.get(i).getNome()); 
			System.out.printf("\n\t%d - %s" ,i+1,produtos.get(i).getDescricao());
			System.out.printf("\n\t%d - %s" ,i+1,produtos.get(i).getPreco());
			System.out.printf("\n\t%d - %s" ,i+1,produtos.get(i).getQuantidade());
			System.out.println("                                              ");
			i++;}
				System.out.print("\n\n\tEntre com a opção: ");
				alterarproduto = entrada.nextInt();
				while (alterarproduto-1 < 0 || alterarproduto-1 >= produtos.size()) {
				    System.out.print("\n\tEntrada inválida! Tente novamente: ");
				    alterarproduto = entrada.nextInt();
				}
				Produto produto = produtos.get(alterarproduto-1);
				System.out.printf(  "\n\tNome: %s "
						+ "\n\tDescrição: %s "
						+ "\n\tPreço: %f "
						+ "\n\tQuantidade: %d ", 
						produtos.get(alterarproduto-1).getNome(), 
						produtos.get(alterarproduto-1).getDescricao(), 
						produtos.get(alterarproduto-1).getPreco(), 
						produtos.get(alterarproduto-1).getQuantidade());
				System.out.print("\n\tO que você deseja fazer: "
						+ "\n\n\tAlterar alguma propriedade do produto"
						+ "\n\tRemover alguma propriedade do produto selecionado"
						+ "\n\tRemover o produto do estoque"
						+ "\n\tDigite a escolha: ");
				opcao = entrada.next();
				if(opcao.contains("nome") || opcao.contains("Nome")) {
					System.out.println("Você escolheu nome! O que você deseja fazer? "
							+ "\n\n\t1 - Remover nome "
							+ "\n\t2 - Alterar nome "
							+ "\n\tEntre com a escolha: ");
						escolha = entrada.nextInt();
						if (escolha == 1) {
							produtos.get(alterarproduto-1).setNome("");
							produtos.add(produto);
							System.out.println("\n\tNome removido");
						}
						if(escolha==2) {
						System.out.print("\n\tEntre com o novo nome: ");
						alteracao = entrada.next();
						produtos.get(alterarproduto-1).setNome(alteracao);
						produtos.add(produto);
						System.out.println("\n\tNome alterado!");
						}
						else if (opcao.contains("Descrição") || opcao.contains("descrição")) {
							System.out.println("Você escolheu descrição! O que você deseja fazer? "
									+ "\n\n\t1 - Remover descrição "
									+ "\n\t2 - Alterar descrição "
									+ "\n\tEntre com a escolha: ");
							escolha= entrada.nextInt();
							if(escolha==1) {
								produtos.get(alterarproduto-1).setDescricao("");
								produtos.add(produto);
								System.out.println("\n\tDescrição removida");
							}
							if(escolha==2) {
						System.out.print("\n\tEntre com a nova descrição: ");
						alteracao = entrada.next();
						produtos.get(alterarproduto -1).setDescricao(alteracao);
						produtos.add(produto);
						System.out.println("\n\tA descrição foi alterada!");
						}
						else if(opcao.contains("Quantidade") || opcao.contains("quantidade")) {
							System.out.println("Você escolheu quantidade! O que você deseja fazer? "
									+ "\n\n\t1 - Remover quantidade "
									+ "\n\t2 - Alterar quantidade "
									+ "\n\tEntre com a escolha: ");
							escolha = entrada.nextInt();
							if(escolha==1) {
								produtos.get(alterarproduto-1).setQuantidade(0);
								produtos.add(produto);
								System.out.println("\n\tQuantidade removida");
							}
							if (escolha==2) {
							System.out.println("\n\tEntre com a nova quantidade: ");
							quantidade = entrada.nextInt();
							produtos.get(alterarproduto -1).setQuantidade(quantidade);
							produtos.add(produto);
							System.out.print("\n\tA quantidade foi alterada! ");
						}
				}
						else if (opcao.contains("Preço") || opcao.contains("preço")) {		
							System.out.println("Você escolheu preço! O que você deseja fazer? "
									+ "\n\n\t1 - Remover preço "
									+ "\n\t2 - Alterar quantidade "
									+ "\n\tEntre com a escolha: ");
							escolha = entrada.nextInt();
							if (escolha==1) {
								produtos.get(alterarproduto-1).setPreco(0);
								produtos.add(produto);
								System.out.println("\n\tPreço removido");
							}
							if (escolha ==2) {
								System.out.print("\n\tEntre com o novo preço: ");
								preço = entrada.nextDouble();
								produtos.get(alterarproduto -1).setPreco(preço);
								produtos.add(produto);
								System.out.println("\n\tPreço alterado");
							}
						}
						}}System.out.print("\n\tVocê deseja cadastrar outro produto? "
								+ "\n\t1 - sim "
								+ "\n\t2 - não \n\n\tEntre com a opção: ");
							opcao4 = entrada.nextInt();}
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
	public static void Consultar_estoque() {
		int i =0;
		System.out.println("\n\tVocê escolheu consultar estoque! \n\tAqui está o estoque completo!");
		while(i<produtos.size()) {
			System.out.println("                                                        ");
			System.out.printf("\n\tNome: %s "
					+ "\n\tQuantidade disponível: %d", 
					produtos.get(i).getNome(), 
					produtos.get(i).getQuantidade());
			System.out.println("                                                        ");
			i++;
		}
	}
	public static void Exibir_menu_inicial() {
	System.out.print("\n\tMenu inicial \n\tO que você deseja fazer: \n\n\t1 - Adicionar produto "
			+ "\n\t2 - Alterar produtos \n\t3 - Consultar produtos específicos"
			+ " \n\t4 - Ver estoque "
			+ "\n\t5 - Sair \n\n\tEntre com a escolha: ");	
	opcao = entrada.nextInt();
	}
	}