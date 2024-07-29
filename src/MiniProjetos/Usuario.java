package MiniProjetos;

public class Usuario {
	private Livro livro;
	private String nome;
	private int idade;
	private int identificacao;
	
	

	public Usuario(Livro livro, String nome, int idade, int identificacao) {
		
		this.livro = livro;
		this.nome = nome;
		this.idade = idade;
		this.identificacao = identificacao;
	}


	public void setLivro(Livro livro) {
		this.livro = livro;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public int getIdentificacao() {
		return identificacao;
	}


	public void setIdentificacao(int identificacao) {
		this.identificacao = identificacao;
	}
	
	public String toString(Livro livro) {
		return "Dados do usuario: "
				+ "\n\tNome: " + getNome()
				+ "\n\tIdentificação: " + getIdentificacao()
				+ "\n\tLivro reservado: " + livro.getNomeLivro();
	}
}
