/*
 * ! Package é o pacote, em outras palavras, o folder principal onde o arquivo java está armazenado. 
 */
package src;
/*Aqui é o básico. Programas em java inicia com uma classe pública e sempre com o nome do arquivo, neste caso
 * o nome é "conceitosBásicos". Inclusive, todo o código em Java precisa estar dentro de uma classe. 
 * ? É recomendável que uma classe inicie com letra maiúscula, caso seja uma classe com mais de uma palavra, 
 * ? primeira letra é minúscula e a segunda que é máiuscula. 
 */
public class PrimeiroPrograma_basico {
    /*
     * Váriavel é basicamente um lugar da memória na qual vai ser utilizada para armazenar algum tipo de dado. 
     /* As variáveis se dividem em primitivas e não primitivas
     */
    public static void main (String[] args) {
    /*
      Váriavel é basicamente um lugar da memória na qual vai ser utilizada para armazenar algum tipo de dado.
      As variáveis se dividem em primitivas e não primitivas. Primitivos: integer(4 bytes), char, Byte(1 byte), Short(2 bytes), Long(8 bytes)
      Float, Double.
     */
        Integer Minha_idade = 18;
        System.out.println(Minha_idade);

    }
} 