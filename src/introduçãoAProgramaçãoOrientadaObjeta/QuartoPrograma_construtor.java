package introduçãoAProgramaçãoOrientadaObjeta;

public class QuartoPrograma_construtor {
	public class Casa{
		private double tamanho;
		public double altura;
		public void getCasa(double tamanho, double altura){
			this.tamanho = tamanho;
			this.altura = altura;
		}
	}

	public static void main(String[] args) {
	Casa casa1 = new Casa(11, 22);
	
	}

}
