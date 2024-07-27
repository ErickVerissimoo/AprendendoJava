package MiniProjetos;

public class Livro {
    private String autor;
    private int id;
    private int ano;
    private genero Genero;

    public Livro(String autor, int id, int ano, genero Genero ){
        this.autor = autor;
        this.id = id;
        this.ano = ano;
        this.Genero = Genero;
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
