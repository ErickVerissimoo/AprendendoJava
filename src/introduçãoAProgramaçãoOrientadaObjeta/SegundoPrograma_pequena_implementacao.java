package introduçãoAProgramaçãoOrientadaObjeta;

public class SegundoPrograma_pequena_implementacao {

	public static void main(String[] args) {
		Empresa empresa1 = new Empresa();
		empresa1.setNome("Erick investments");
		empresa1.setCNPJ("83293923-22");
		empresa1.setEndereco("Rua das tanajuras");
		empresa1.setNum_funcionarios(234);
		System.out.println("\n\tNome da empresa: " + empresa1.getNome());
	}
}
	class Empresa{
		private String Nome;
		private String CNPJ;
		private String Endereco;
		private int num_funcionarios;
		
		public void setNome(String Nome){
			this.Nome = Nome;
		}
		public void setCNPJ(String CNPJ) {
			this.CNPJ = CNPJ;
		}
		public void setEndereco(String Endereco) {
			this.Endereco = Endereco;
		}
		public void setNum_funcionarios(int num_funcionarios){
			this.num_funcionarios = num_funcionarios;
		}
		public String getNome(){
			return Nome;
		}
		public String getCNPJ() {
			return CNPJ;
		}
		public String getEndereco() {
			return Endereco;
		}
		public int getnum_funcionarios() {
			return num_funcionarios;
		}
	}

