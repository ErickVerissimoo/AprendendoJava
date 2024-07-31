
package source.introduçãoAProgramaçãoOrientadaObjeta;

public class PrimeiroPrograma_classes_e_objetos {

    public static void main(String[] args) {
    	/*
    	 * Abaixo temos o objeto Casa, que está contido na classe casa. Abaixo é como
    	 * declaramos um Objeto.
    	 * Objetos são como no mundo real, podendo ser abstratos ou não.
    	 * Por exemplo, a classe celular contém uma série de dispositivos específicos.
    	 * O meu celular por exemplo, faz parte da classe celular. Neste caso, a minha casa,
    	 * faz parte da classe casa. E contém suas próprias particularidades. Todas as casas
    	 * pertencem a classe casa, mas são objetos diferentes, com especificações diferentes.
    	 * E cada objeto, contém seu próprio comportamento. Por exemplo, o objeto interruptor.
    	 * Ele pode ligar e desligar a lâmpada, assim como a lâmpada contém comportamento, podendo
    	 * estar ligada ou desligada. Esse é o comportamento esperado do interruptor e de uma lâmpada.
    	 * O ato de criar objetos também pode ser chamado de instanciar ou instanciação de objetos, pois os
    	 * mesmos estão veículados a uma categoria, ou classe neste caso.
    	 */
        Casa casa1 = new Casa();

        /*
         * O código abaixo adiciona o nome erick ao atributo privado Nome
         */
        casa1.setNome("Erick");

        /*
         * O codigo abaixo chama o método get e o exbibe
         */
        System.out.println("O dono da casa é " + casa1.getNome());
    }
}
/*
 * Abaixo temos a iniciação de uma classe. Uma classe é a descrição detalhada de um conceito,
 * e a partir dessa classe, é gerado objetos, com base na classe. Por exemplo a classe bolo,
 * contém diferentes tipos de objetos, pois existem bolos de incontáveis sabores, tamanhos e etc...
 * Essas especificações mais detalhadas como características do objeto, são definidos como atributos.
 * E o que o objeto faz, ou seja, a ação do objeto, é definido como comportamento. Por exemplo, o objeto
 * pistola da classe armas de fogo, tem como comportamento atirar.
 */
class Casa {
	/*
	 * Abaixo é criado o atributo privado nome, ou seja, seu acesso é restrito
	 */
    private String nome;

  //O metodo setter ou apenas set, permite acessar atributos privados
    public void setNome(String nome) {
        this.nome = nome;
    }

    /*
     * Usamos o método get para obter o valor de um atributo privado
     */
    public String getNome() {
        return nome;
    }
}

