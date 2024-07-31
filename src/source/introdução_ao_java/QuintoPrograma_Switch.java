package source.introdução_ao_java;

public class QuintoPrograma_Switch {
    public static void main(String[] args) {
        int posicao = 1;
        /*
         * O switch é uma estrutra em que avalia uma série de
         * situações, ou casos, que podem ocorrer no programa,
         * e após avaliar, executa um bloco de código. Caso
         * a avaliação feita não coincida com nenhum dos casos,
         * o programa executa o caso "default". O programa
         * pode parar imediatamente após a verificação
         * dos casos e dos códigos usando o break,
         * ou seguir, usando o continue.
         */
        switch (posicao) {
            case 1:
                System.out.println("Primeiro lugar");
                break;
            case 2:
            System.out.println("Segundo lugar");
            break;
            case 3:
                System.out.println("terceiro lugar");
            default:
            System.out.println("Fora do pódio");
                break;
        }
    }
}
/*
 * o programa acima verifica a posição de um
 * campeonato e diz se ficou entre os três primeiros
 * ou fora.
 */