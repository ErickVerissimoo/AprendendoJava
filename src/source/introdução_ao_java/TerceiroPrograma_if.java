package source.introdução_ao_java;
    public class TerceiroPrograma_if{
        public static void main (String [] args){
            int Nota = 10;
            int Media = 11;
            /*
             * Abaixo entramos no conceito de if e else
             * o if basicamente consiste no estabelecimento de uma cláusula
             * que caso se comprove verdadeira, executa uma determinada linha de 
             * código. Caso se comprove falsa, ou não faz nada e apenas segue o código, ou
             * executa a segunda cláusula, o else. Neste programa, caso a média seja
             * maior do que a nota, aparecerá reprovado. Caso a nota seja maior, 
             * aparecerá aprovado.
             */
            if (Nota<Media){
                System.out.println("Reprovado");
            }else{
                System.out.println("Aprovado");
                System.out.println("Fim do programa");
            }
        }
    }