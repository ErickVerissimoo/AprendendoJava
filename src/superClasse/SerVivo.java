package superClasse;

public class SerVivo {
	protected String tipo;
	protected int idade;
	protected boolean sexo;
	protected Boolean extinto;
	protected void gerar(){
		System.out.println("Um novo ser vivo foi gerado");
	}
	protected SerVivo(String tipo, int idade, 
		Boolean sexo, Boolean extinto){
		String a;
		this.tipo=tipo;
		this.idade=idade;
		this.sexo = sexo;
		this.extinto = extinto;
		if(sexo == true) {
			a = "masculino";
			System.out.println(a);
		} else {
			a = "feminino";
			System.out.println(a);
		}
		if(extinto==true) {
			System.out.println("está extinto");
		}
		else {
			System.out.println("não está extinto");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
}
