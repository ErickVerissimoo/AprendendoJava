package MiniProjetos;

public class Livro {
    private String autor;
    private int id;
    private String nomeLivro;
	private int ano;
    private genero Genero;
    
    public String getNomeLivro() {
		return nomeLivro;
	}


	public void setNomeLivro(String nomeLivro) {
		this.nomeLivro = nomeLivro;
	}

    @Override
    public String toString() {
		return "\n\tIdentificação numérica do livro:" + getId() +
				"\n\tAutor do livro: " + getAutor() +
				"\n\tAno de publicação: " +getAno() +
				"\n\tGênero: " + getGenero();
	}
    

    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public genero getGenero() {
        return Genero;
    }
    public void setGenero(genero genero) {
        Genero = genero;
    }

	
   
    
}
