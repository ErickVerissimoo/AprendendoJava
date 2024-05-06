/*
 * Package é o pacote, em outras palavras, o folder principal onde o arquivo java está armazenado. 
 */
package Introdução_ao_Java;
/*Aqui é o básico. Todo programa em java inicia com uma classe pública e sempre com o nome do arquivo, neste caso
 * o nome é "conceitosBásicos". Inclusive, todo o código em Java precisa estar dentro de uma classe. 
 * É recomendável que uma classe inicie com letra maiúscula, caso seja uma classe com mais de uma palavra, 
 * a primeira letra é minúscula e a segunda que é máiuscula. 
 */
public class conceitosBásicos {
    /*
     * Váriavel é basicamente um lugar da memória na qual vai ser utilizada para armazenar algum tipo de dado. 
     * As variáveis se dividem em primitivas e não primitivas
     */
    public static void main (String[] args){
    /*
     * Váriavel é basicamente um lugar da memória na qual vai ser utilizada para armazenar algum tipo de dado. 
     * As variáveis se dividem em primitivas e não primitivas. Primitivos: integer(4 bytes), char, Byte(1 byte), Short(2 bytes), Long(8 bytes)
     * Float, Double. 
     */
    Integer Minha_idade = 18;
    /*
     * If e else são estruturas de controle. If permite executar um código em Java SE uma condição ser 
     * verdadeira. Em termos mais técnicos, o if é uma expressão booleana de verdadeiro ou falso. Caso a 
     * condição estabelecida se mostre verdadeira, o if realiza determinado bloco de código.
     * Caso seja falsa, entra o else, que significa "senão". Ou seja, se a condição for falsa, o bloco
     * de código do if é ignorado, e o bloco de código do else quem é executado. 
     * 
     * "==" é um operador lógico de comparação. Ele basicamente compara uma váriavel a outro código e 
     * verifica se a váriavel é igual a esse código. No caso deste código, ele verifica se "Minha_idade" 
     * é igual a 17, e caso seja, mostra "Sua idade é 17", e caso não seja, mostra "Sua idade não é 17"
     */
    if (Minha_idade== 17){
        System.out.println("Sua idade é 17");
    } else {
        System.out.println("Sua idade não é 17");
    }
    }
} 