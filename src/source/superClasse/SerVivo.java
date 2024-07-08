package source.superClasse;

public class SerVivo {
	public String tipo;
	public int idade;
	public boolean sexo;
	public boolean extinto;
	protected void gerar(){
		System.out.println("Um novo ser vivo foi gerado");
	}
	public SerVivo(String tipo, int idade, 
		boolean sexo, boolean extinto){
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
                System.out.print(tipo + idade);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
}
