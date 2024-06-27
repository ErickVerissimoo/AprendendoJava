package source.introduçãoAProgramaçãoOrientadaObjeta;
import source.classes.Aluno;
import java.util.Scanner;
public class QuintoPrograma_classe_aluno_e_objeto {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		Aluno aluno = new Aluno ();
		System.out.print("\n\t\bEntre com o nome do aluno: ");
		aluno.setNome(entrada.next());
		System.out.print("\n\t\bEntre com o sobrenome do aluno: ");
		aluno.setSobrenome(entrada.next());
		System.out.print("\n\b\tEntre com a idade do aluno: ");
		aluno.setIdade(entrada.nextInt());
		System.out.print("\n\b\tEntre com o curso do aluno: ");
		aluno.setCurso(entrada.next());
		System.out.print("\n\b\tEntre com o ano de conclusao do aluno");
		aluno.setAno_de_conclusao(entrada.nextInt());
		System.out.println("\n\t\tDados gerais do aluno \n\tNome:" + aluno.nome + "\n\tSobrenome:" + aluno.sobrenome + "\n\tIdade: " + aluno.idade + "\n\tCurso: " + aluno.curso + "\n\tAno de conclusão: " + aluno.ano_de_conclusao);
		entrada.close();
	}

}
