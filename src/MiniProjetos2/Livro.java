package MiniProjetos2;

public abstract class Livro {
	private String autor;
	private String nome;
	private int ano; 
	private String ISBM;
	private double valor;
	
	
	protected String getAutor() {
		return autor;
	}
	protected void setAutor(String autor) {
		this.autor = autor;
	}
	protected String getNome() {
		return nome;
	}
	protected void setNome(String nome) {
		this.nome = nome;
	}
	protected int getAno() {
		return ano;
	}
	protected void setAno(int ano) {
		this.ano = ano;
	}
	protected String getISBM() {
		return ISBM;
	}
	protected void setISBM(String iSBM) {
		ISBM = iSBM;
	}
	protected double getValor() {
		return valor;
	}
	protected void setValor(double valor) {
		this.valor = valor;
	}
	protected double AplicarDesconto(double porcentagem) {
	
		if(porcentagem*0.01 >30) {
			System.err.print("entrada invalida, o desconto não"
					+ "pode ser superior a 30 porcento do valor"
					+ "do livro fisico");
		return 0;
		}
		else {
			this.setValor(this.getValor() - (porcentagem * 0.01)) ;
			return getValor();
	}
		}
	
}
