package MiniProjetos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Biblioteca {
	private static ArrayList<Livro> armazenamento = new ArrayList<>();
	private static List<Usuario> usuarios = new ArrayList<>();
	private static Scanner entrada = new Scanner(System.in);

	private static Livro AdicionarLivro() {
		Livro livro;
		livro = new Livro();
		entrada.nextLine();
		System.out.print("\n\tVocê escolheu adicionar livro \n\tEntre com o autor: ");
		livro.setAutor(entrada.nextLine());
		while (livro.getAutor().equals("") || livro.getAutor() == "") {
			System.err.print("Entre com ao menos um caractere");
		}
		System.out.print("\n\tEntre com o ano: ");
		livro.setAno(entrada.nextInt());

		System.out.print("\n\tEntre com o id:");
		livro.setId(entrada.nextInt());
		entrada.nextLine();
		System.out.print("\n\tEntre com o nome do livro: ");
		livro.setNomeLivro(entrada.nextLine());
		System.out.print("\n\tEntre com o genero: \n\t1 - Suspense \n\t2 - Ação \n\t3 - Romance"
				+ "\n\t4 - Biografico \n\t5 - Infatil \n\t6 - Fabula \n\t7 - Erotico " + "\n\t: ");
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

		System.out.println();
		for (int i = 0; i < armazenamento.size(); i++) {
			System.out.println(armazenamento.get(i).toString());
			if (i % 4 == 0) {
				System.out.println();
			}

		}
	}

	public static void RemoverLivro() {
		int remoção;
		int i = 0;
		ConsultarLivro();
		System.out.print("\n\tQual livro você deseja remover? " + "\nEntre com o ID do livro desejado:");
		remoção = entrada.nextInt();
		while (remoção != armazenamento.get(i).getId()) {
			if (remoção == armazenamento.get(i).getId()) {

				System.out.print("\n\tLivro removido com sucesso");
				armazenamento.remove(i);
				ConsultarLivro();
			} else {
				System.err.print("Entrada invalida!");
				break;
			}
			i++;
		}

	}

	private static void Emprestar() throws Throwable {
		int opcao;
		do {
			System.out.print("\n\tUm livro será emprestado!");
			ConsultarLivro();
			entrada.nextLine();
			System.out.print("\n\tEntre com o nome do usuario: ");
			String nome = entrada.nextLine();
			System.out.print("\n\tEntre com a idade do usuario: ");
			int idade = entrada.nextInt();
			System.out.print("\n\tEntre com um numero de identificacao para o usuario: ");
			int identificacao = entrada.nextInt();
			int id;
			System.out.print("\n\tEntre com o numero de identificação do livro desejado: ");
			id = entrada.nextInt();
			for (int i = 0; i < armazenamento.size(); i++) {
				if (id == armazenamento.get(i).getId()) {
					Livro Novolivro = armazenamento.get(id);
					Usuario user = new Usuario(Novolivro, nome, idade, identificacao);
					usuarios.add(user);
					System.out.print(user.toString(Novolivro));
					break;
				}

				else {
					throw new Throwable("\n\tEntrada invalida!");

				}
			}
			System.out.print("\n\tLivro emprestado! ");
			System.out.print("\t\nVocê deseja adicionar mais livros? \n\t1 - Sim \n\t2 - Não");
			opcao = entrada.nextInt();

		} while (opcao == 1);
	}

	public static void main(String... args) throws Throwable {

		int opcao = 0;
		do {

			System.out.println();
			System.out.print("\n\tBem vindo ao gerenciamento da biblioteca " + "\n\tO que você deseja fazer? "
					+ "\n\t1 - Adicionar um livro" + "\n\t2 - Consultar livros disponíveis"
					+ "\n\t3 - Emprestar um livro" + "\n\t4 - Remover um livro existente" + "\n\t:");
			opcao = entrada.nextInt();
			switch (opcao) {
			case 1:
				Livro livro = AdicionarLivro();
				armazenamento.add(livro);
				continue;
			case 2:
				if (armazenamento.isEmpty()) {
					System.err.print("\n\tO armazenamento de livros " + "está vazio, adicione "
							+ "livros para poder consulta-los");
					continue;
				}

				ConsultarLivro();
				continue;

			case 3:
				if (armazenamento.isEmpty()) {
					System.err.print("\n\tO armazenamento de livros " + "está vazio, adicione "
							+ "livros para poder empresta-los");
					continue;
				}

				Emprestar();
				continue;
			case 4:
				if (armazenamento.isEmpty()) {
					System.err.print("\n\tNão há livros para serem removidos");
					continue;
				}

				RemoverLivro();
				continue;

			default:
				System.err.print("\n\tEntrada invalida");
				continue;

			}

		} while (opcao == 1 || opcao == 2 || opcao == 3 || opcao == 4);
	}
}
