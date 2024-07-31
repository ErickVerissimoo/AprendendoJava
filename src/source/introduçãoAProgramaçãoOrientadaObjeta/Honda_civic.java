/*
 * Este é o décimo sétimo programa, que lida com o conceito de abstração
 */

package source.introduçãoAProgramaçãoOrientadaObjeta;
import source.classes.Carro;
/*
 * O conceito de abstração lida com conceitos extremamente gerais e genéricos. Por exemplo
 * carro. O conceito de carro é algo abstrato, pois não é possível imaginar um carro genérico, sem
 * imaginar um carro concreto. O que sabemos sobre o conceito de carro é basicamente um conjunto
 * de características em comum que a maioria esmagadora dos carros convencionais possuem. Quando se
 * imagina o conceito de carro, não é possível visualizar um carro sem visualizar um objeto carro
 * em especifíco. Algo abstrato é um conceito que reúne uma série de características generalistas.
 * Na programação, uma classe abstrata é um tipo de classe que não pode ser instanciada diretamente,
 * servindo apenas como superclasse que pode ser herdada por outras subclasses.
 * Uma classe abstrata é semelhante a uma interface, pois ela também define uma espécie de contrato,
 * com a diferença que seus atributos e métodos podem ou não ser abstratos. Em uma interface, todos os
 * seus métodos e atributos são necessariamente abstratos assim que definidos, não podendo ter
 * nenhum comportamento estabelecido diretamente em sua criação. Enquanto em uma classe abstrata,
 * isso não ocorre. Os métodos podem ou não ter seu comportamento definido diretamente na superclasse,
 * assim como seus atributos. Por exemplo, o método correr abaixo.
 * É possível ir diretamente no arquivo carro e definir seu comportamento por lá, basta apagar o
 * modificador abstract e inserir o código. Creio que agora os conceitos de interface e abstract
 * foram bem definidos.
 */
public class Honda_civic extends Carro {
	@Override
	public void correr() {
		System.out.println("O carro está correndo");
	}

	public static void main(String[] args) {
		Honda_civic civic = new Honda_civic();
		civic.correr();

	}


}
