package classes;

public class Empresa {
	public String Nome;
	public String CNPJ;
	public static int Funcionarios= 60;

	public static void main(String[] args) {

	}
	public void demitir(int Funcionarios) {
		        if (Empresa.Funcionarios > 0) { // Verifica se há funcionários para demitir
            Empresa.Funcionarios--; // Decrementa o número de funcionários
            System.out.println("O número de funcionários agora é: " + Empresa.Funcionarios);
        } else {
            System.out.println("Não há funcionários para demitir.");
        }
    }
	public void contratar(int Funcionarios) {
        if (Empresa.Funcionarios > 0) { // Verifica se há funcionários para demitir
    Empresa.Funcionarios++; // Decrementa o número de funcionários
    System.out.println("O número de funcionários agora é: " + Empresa.Funcionarios);
} else {
    System.out.println("Não há funcionários para demitir.");
}
}
	public void setNome(String Nome){
		this.Nome = Nome;
	}
	public void setFuncionarios(int Funcionarios){
		Empresa.Funcionarios = Funcionarios;
	}
	public void setCNPJ(String CNPJ){
		this.CNPJ = CNPJ;
}}
