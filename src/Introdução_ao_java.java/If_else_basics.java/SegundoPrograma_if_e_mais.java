package src;

public class SegundoPrograma_if_e_mais {
    public static void main (String [] args){
        /*
        * o comando abaixo chama o método
         */
    tabuada();
}
/*
* Colocamos private para indicar que a classe, ou neste caso, o método, tem seu acesso limitado
* Ou seja, outras classes e objetos estão restringidos de acessar o método tabuada.
* Um método é um facilitador. Ele permite que um código uma vez feito, não seja
* necessário uma repetição exaustiva daquilo que foi escrito. Basta chamar o método
* de maneira simples como está acima, e pronto. E por fim, vale salientar o uso do void
* que é usado para determinar que o método não retorna nada.
 */
    private static void tabuada() {
        int A = 1;
        System.out.println(A*A);
        System.out.println(A*2);
        System.out.println(A*3);
        System.out.println(A*4);
        System.out.println(A*5);
        System.out.println(A*6);
        System.out.println(A*7);
        System.out.println(A*8);
        System.out.println(A*9);
        System.out.println(A*10);
    }

}
}
