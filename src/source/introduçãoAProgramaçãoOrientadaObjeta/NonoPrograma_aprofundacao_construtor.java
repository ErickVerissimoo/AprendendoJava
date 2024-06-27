package source.introduçãoAProgramaçãoOrientadaObjeta;
import source.classes.Cadeira_voadora;
public class NonoPrograma_aprofundacao_construtor {

	public static void main(String[] args) {
		/*
		 * Os construtores numa definição mais concisa e acertiva, 
		 * são um bloco de códigos atribuidos a um determinado objeto, 
		 * que no momento em que um novo objeto é instanciado, o construtor
		 * é chamado e executa determinado bloco de códigos. O construtor por 
		 * padrão precisa ser chamado ao instanciar um objeto para o seu funcio
		 * namento, porém ele pode ou não ser chamado vazio. Como assim? Bem, ao
		 * instanciar um objeto, ao lado da declaração "new", coloca-se o nome da 
		 * classe na qual o objeto pertence, e após isso, deve-se por parenteses.
		 * Este parenteses é o construtor, e por padrão, ele vem vazio. Caso você
		 * queira que o construtor venha com valores e execute códigos pré-definidos
		 * você precisa criar o construtor no arquivo da classe, e definir os códigos 
		 * lá. No caso abaixo, o código a ser exebido é um booleano, que exibe se
		 * a cadeira está voando ou não. Como eu defini true, a instanciação desse objeto
		 * e construtor, exibirá no console uma série de declarações.
		 * 
		 * Um construtor também pode receber parâmetros, nesse caso, será obrigatório
		 * colocar algum valor diretamente nos parenteses abaixo.
		 */
		Cadeira_voadora cadeira = new Cadeira_voadora();
	}

}
