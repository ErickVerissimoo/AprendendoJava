package introdução_ao_java;
public class QuartoPrograma_condicaoternaria{
    public static void main (String [] args){
        int A = 2;
        String res;
        /*
         * A condição ternária é uma forma mais compacta da estrutura if e else,
         * ela testa a váriavel e estabelece condições, porém de maneira mais simples,
         * não podendo haver uma série de condições e retornos de verdadeiro ou falso,
         * ou seja, não há como haver mais do que uma condição. 
         */
        res = (A>1? "Aprovado" : "Reprovado");
        System.out.println(res);
    }
}