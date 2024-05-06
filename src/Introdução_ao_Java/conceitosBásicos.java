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
     * As variáveis se dividem em primitivas e não primitivas. Integer, ou inteiro em português
     */
    Integer Minha_idade = 17;
    String Meu_Nome = "Erick";
    System.out.println(Minha_idade + Meu_Nome);
    }
} 