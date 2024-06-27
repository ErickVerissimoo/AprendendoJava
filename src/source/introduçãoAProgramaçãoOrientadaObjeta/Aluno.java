/*
 * Este é o décimo quarto programa. Não coloquei no nome para obter melhor
 * entendimento dos conceitos trabalhados aqui.
 */

package source.introduçãoAProgramaçãoOrientadaObjeta;
import superClasse.*;
/*
 * Herança é basicamente a capacidade de uma classe "herdar" as características e comportamentos 
 * de outra classe. A classe herdeira é chamada de subclasse, e a classe "mãe", ou seja, a detentora
 * dos atributos e comportamentos originais, é chamada de superclasse. Em suma, a herança cria uma hierarquia,
 * facilitando o acesso a uma determinada classe, evitando repetições, diminuindo a verbosidade do código e facilitando
 * a manutenção do código. Para chamar uma superclasse, devemos importar a superclasse e usar o comando "extends", seguido
 * do nome da superclasse. Abaixo nós vemos um aluno herdar os atributos e comportamentos da superclasse pessoa. 
 * 
 * É possível realizar esse código sem usar herança, usando somente classes, porém em situações onde se lida com
 * múltiplas classes, usar herança otimiza o processo. 
 */
public class Aluno extends Pessoa  {

	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		aluno.setIdade(11);
		System.out.println(aluno.getIdade());

	}

}
