package MiniProjetos;

import java.util.*;

public class Biblioteca {
	private static ArrayList<Livro> armazenamento = new ArrayList<>();

	private static Scanner entrada = new Scanner(System.in);

	private static Livro AdicionarLivro() {
		Livro livro;
		livro = new Livro();
		System.out.print("\n\tVocê escolheu adicionar livro \n\tEntre com o autor: ");
		livro.setAutor(entrada.nextLine());
		System.out.print("\n\tEntre com o ano: ");
		livro.setAno(entrada.nextInt());

		System.out.print("\n\tEntre com o id:");
		livro.setId(entrada.nextInt());

		System.out.print("\n\tEntre com o genero: \n\t1 - Suspense \n\t2 - Ação \n\t3 - Romance"
				+ "\n\t4 - Biografico \n\t5 - Infatil \n\t6 - Fabula \n\t7 - Erotico "
				+ "\n\t: ");
		int gender = entrada.nextInt();
		switch (gender) {
		case 1:
			livro.setGenero(genero.SUSPENSE);

			break;
		case 2:
			livro.setGenero(genero.AÇÃO);

			break;
		case 3:
			livro.setGenero(genero.ROMANCE);

			break;
		case 4:
			livro.setGenero(genero.BIOGRAFICO);

			break;
		case 5:
			livro.setGenero(genero.INFANTIL);

			break;
		case 6:
			livro.setGenero(genero.FABULA);

			break;
		case 7:
			livro.setGenero(genero.EROTICO);

			break;
		default:
			
			System.out.println("\n\tEntrada invalida: ");
			break;
		}
		System.out.println("\n\tLivro adicionado com sucesso! ");

		return livro;
	}

	private static void ConsultarLivro() {
		
		System.out.print("\n\tVoce escolheu consultar livros!");
		System.out.println();
		for (int i = 0; i < armazenamento.size(); i++) {
			System.out.println(armazenamento.get(i).toString());
			if(i%4 ==0) {
				System.out.println();
			}
					
		}
	}
	
	private static void Emprestar() {
		System.out.print("\n\tUm livro será emprestado!");
		ConsultarLivro();
		System.out.print("Entre com o nome do usuario: ");
		String nome = entrada.nextLine();
		System.out.print("Entre com a idade do usuario: ");
		int idade = entrada.nextInt();
		System.out.print("Entre com um numero de identificacao para o usuario: ");
		int identificacao = entrada.nextInt();
		int id;
		System.out.print("Entre com o numero de identificação do livro desejado: ");
		id = entrada.nextInt();
		if (id == armazenamento.get(id).getId()) {
			Livro Novolivro = armazenamento.get(id);
		}
		for (int i = 0; i<armazenamento.size(); i++) {
			
		}
	}
	
	private static void MenuBiblioteca() {
		int opcao;
		System.out.println("\n\tBem vindo ao gerenciamento da biblioteca "
				+ "\n\tO que você deseja fazer? "
				+ "\n\t1 - Adicionar um livro"
				+ "\n\t2 - Consultar livros disponíveis"
				+ "\n\t3 - Emprestar um livro");
		opcao = entrada.nextInt();
		switch (opcao) {
		case 1:
			AdicionarLivro();
		case 2:
			ConsultarLivro();
		case 3:
		
		default:
			break;
		
		}
	}

	public static void main(String... args) {
		
		int opcao;
		
		Livro livro = AdicionarLivro();
		armazenamento.add(livro);
		ConsultarLivro();

	}
}
