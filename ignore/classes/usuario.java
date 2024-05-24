package classes;
import classes.Estado_civil;
public class usuario {
	public Estado_civil estadocivil;
	public double altura;
	public double peso;
	public String nome;
	boolean Sexo;
	boolean fumante;
	
	public usuario(double altura, double peso, String nome, boolean Sexo, boolean fumante, Estado_civil estadocivil){
		this.altura=altura;
		this.peso=peso;
		this.nome=nome;
		this.Sexo=Sexo;
		this.fumante=fumante;
		this.estadocivil=estadocivil;
	}
	public double getAltura() {
		return altura;
	}
	public double getPeso() {
		return peso;
	}
	public String getNome() {
		return nome;
	}
	public boolean getFumante() {
		return fumante;
	}
	public boolean Sexo() {
		return Sexo;
	}
	public Estado_civil getEstado() {
		return estadocivil;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
