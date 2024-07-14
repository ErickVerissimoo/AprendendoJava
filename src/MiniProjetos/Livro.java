package MiniProjetos;

public class Livro {
	private String nome;
	private String autor;
	private String ISBN;
	private String [] genero = new String [] {"Drama", "Suspense", "Romance", "Técnico", "Didático"
			,"Erótico","Bibliográfico"};
	private Integer ID;
	public String getNome() {
		return nome;
	}
	public void AdicionarLivro(String nome) {
		this.nome = nome;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public String[] getGenero() {
		return genero;
	}
	public void setGenero(String[] genero) {
		this.genero = genero;
	}
	public Integer getID() {
		return ID;
	}
	public void setID(Integer iD) {
		ID = iD;
	}
	public Livro(String nome, String autor, String iSBN, String[] genero, Integer iD) {
		this.nome = nome;
		this.autor = autor;
		this.ISBN = iSBN;
		this.genero = genero;
		this.ID = iD;
	}
	
}
