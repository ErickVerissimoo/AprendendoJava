package MiniProjetos;

public abstract class Gerenciamento {
	protected String nome;
	protected String CNPJ;
	protected int fundacao;
	protected String endereco;
	protected static int funcionarios;

	public int getFuncionarios() {
		return funcionarios;
	}
	public static void contratar (int funcionario) {
		funcionarios += funcionario;
	}
	public void demitir (int funcionario) {
		Gerenciamento.funcionarios -= funcionario;
		}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCNPJ() {
		return CNPJ;
	}
	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}
	public Gerenciamento(String nome, String CNPJ, int fundacao, String endereco, int funcionarios) {
		super();
		this.nome = nome;
		this.CNPJ = CNPJ;
		this.fundacao = fundacao;
		this.endereco = endereco;
		Gerenciamento.funcionarios = funcionarios;
	}
	public int getFundacao() {
		return fundacao;
	}
	public void setFundacao(int fundacao) {
		this.fundacao = fundacao;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	@Override
	public String toString () {
		return "\n\tDados da empresa: "
				+ getFundacao() + "\n\t"
				+ getEndereco () + "\n\t"
				+ getCNPJ() + "\n\t"
				+ getNome() + "\n\t"
				+ getFuncionarios() + "\n\t";
	}
}
