package source.classes;

public class Funcionario {
	public String nome;
	public double HorasTrabalhadas;
	public double GanhoPorHora;
	
	public Funcionario(String nome, double HorasTrabalhadas, double GanhoPorHora){
		this.nome = nome;
		this.GanhoPorHora = GanhoPorHora;
		this.HorasTrabalhadas = HorasTrabalhadas;
	}
	public Funcionario(double HorasTrabalhadas, double GanhoPorHora, String nome){
		this.HorasTrabalhadas = HorasTrabalhadas;
		this.GanhoPorHora = GanhoPorHora;
		this.nome = nome;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
