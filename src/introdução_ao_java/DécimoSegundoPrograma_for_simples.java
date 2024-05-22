package introdução_ao_java;

public class DécimoSegundoPrograma_for_simples {

	public static void main(String[] args) {
		/*
		 * O comando abaixo inicializa um vetor, falaremos mais sobre isso
		 * mais a frente.
		 */
		String[] carros = {"Mercedes", "Palio", "BMW"};
		/*
		 * Essa é uma versão mais simplificada e fácil do for, 
		 * porém não é tão versátil quanto a versão padrão.
		 * Essa versão é muito útil para lidar com valores dentro de vetores.
		 */
		for (String carro : carros) {
		System.out.println(carro);
	}
	}
}
