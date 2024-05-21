package classes;

public class Empresa {
	public String Nome;
	public String CNPJ;
	public int Funcionarios= 60;

	public static void main(String[] args) {

	}
	public void demitir() {
		        if (Funcionarios > 0) { // Verifica se há funcionários para demitir
            Funcionarios--; // Decrementa o número de funcionários
            System.out.println("\n\tO número de funcionários agora é: " + Funcionarios);
        } else {
            System.out.println("\n\tNão há funcionários para demitir.");
        }
    }
	public void contratar() {
        if (Funcionarios > 0) { // Verifica se há funcionários para demitir
        	Funcionarios++; // Decrementa o número de funcionários
    System.out.println("\n\tO número de funcionários agora é: " + Funcionarios);
} else {
    System.out.println("\n\tNão há funcionários para demitir.");
}
}
	public void setNome(String Nome){
		this.Nome = Nome;
	}
	public void setFuncionarios(int Funcionarios){
		this.Funcionarios = Funcionarios;
	}
	public void setCNPJ(String CNPJ){
		this.CNPJ = CNPJ;
}}
