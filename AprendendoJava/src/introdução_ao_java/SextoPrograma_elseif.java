package introdução_ao_java;

public class SextoPrograma_elseif {
    public static void main(String[] args) {
    int A = 1;
    int B = 2;
    /*
     * o Else if é uma estrutura de if onde há a possibilidade de estabelecer uma série
     * de condições, muito semelhante ao switch. Porém aqui, pode haver o retorno de mais
     * de uma condição booleana (verdadeiro ou falso), 
     * usando os comando AND e OR, mas veremos mais profundamente
     * mais tarde. Sendo que: AND = && e OR == ||. 
     */
    if (A>B){
        System.out.println("A é maior que B");
    } else if (A == B){
        System.out.println("A é igual a B");
    } else if (B>A){
        System.out.println("B é maior que A");
    } else {
        System.out.println("Erro");
    }
}}
