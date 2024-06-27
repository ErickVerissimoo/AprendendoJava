package superClasse;

public class Pessoa {
	
	public static String nome;
	public String Sobrenome;
	public String CPF;
	public int idade;
	
	public void Comer(){
		// String mensagem = String.format("%s comeu", nome);
		// outro jeito de fazer o código abaixo
		System.out.printf("%s comeu", nome);
	}
	public int Envelhecer() {
		return idade +1;
	}
	public void Dormir() {
		System.out.println("uma pessoa dormiu");
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return Sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		Sobrenome = sobrenome;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public void ComerFruta() {
		System.out.printf(" %s Comeu uma fruta", nome);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
