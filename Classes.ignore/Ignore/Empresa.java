package Ignore;


public class Empresa {
	public String Nome = "";
	public String CNPJ;
	public int num_funcionarios;
	public static void main(String[] args) {
	        
	    }
  
    public int demitir() {
        int num_funcionarios = 60;
        num_funcionarios--;
        return num_funcionarios; 
    }
			public void contratar(){ 
				int num_funcionarios = 60;
				num_funcionarios++;
				System.out.println("O numero de funcionarios aumentou para: " + num_funcionarios);
				

			} 
}
