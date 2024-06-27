package source.introduçãoAProgramaçãoOrientadaObjeta;
import java.util.Scanner;
import source.classes.Usuário;
import source.classes.Livro;
public class SextoPrograma_implementacao_gerenciamentoBiblioteca {
		public static void main(String[] args) {
			String opcao;
			Scanner entrada = new Scanner(System.in);
			Livro livro1 = new Livro();
			Usuário user = new Usuário();
			System.out.print("\n\tPrograma de cadastro de usuario e livros simples \n\tO que você deseja cadastrar? \n\tLivro \n\tUsuário \n\tDigite aqui: ");
			opcao = entrada.next();
			if (opcao.contains("Livro")) {
				System.out.print("Entre com o ID do livro");
				livro1.setID(entrada.nextInt());
				System.out.print("Entre com o autor");
				livro1.setautor(entrada.next());
				System.out.print("Entre com o nome do livro");
				livro1.setNome(entrada.next());
				System.out.print("\n\tDados do livro cadastrado: \n\n\tNome: " +livro1.getAutor() + "\n\tNome do livro: " + livro1.getNome() + "\n\tID: " + livro1.getID());
			} else if (opcao.contains("livro")) {
				System.out.print("Entre com o ID do livro");
				livro1.setID(entrada.nextInt());
				System.out.print("Entre com o autor");
				livro1.setautor(entrada.next());
				System.out.print("Entre com o nome do livro");
				livro1.setNome(entrada.next());
				System.out.print("\n\tDados do livro cadastrado: \n\n\tNome: " +livro1.getAutor() + "\n\tNome do livro: " + livro1.getNome() + "\n\tID: " + livro1.getID());
		}
			if (opcao.contains("Usuário")) {
				System.out.print("Entre com o ID do usuário");
				user.setID(entrada.nextInt());
				System.out.print("Entre com o nome do usuário");
				user.setNome(entrada.next());
				System.out.print("Entre com o sobrenome do usuário");
				user.setsobrenome(entrada.next());
				System.out.print("\n\tDados do usuário cadastrado: \n\n\tNome: " + user.getNome() + "\n\tSobrenome: " + user.getSobrenome() + "\n\tID" + user.getID());
			} else if (opcao.contains("usuario")) {
				System.out.print("Entre com o ID do usuário");
				user.setID(entrada.nextInt());
				System.out.print("Entre com o nome do usuário");
				user.setNome(entrada.next());
				System.out.print("Entre com o sobrenome do usuário");
				user.setsobrenome(entrada.next());
				System.out.print("\n\tDados do usuário cadastrado: \n\n\tNome: " + user.getNome() + "\n\tSobrenome: " + user.getSobrenome() + "\n\tID" + user.getID());
				} else {
					System.out.print("\n\tInválido");
				}
		System.out.println("\n\tPrograma encerrado");
		entrada.close();
			
		}
		}

	