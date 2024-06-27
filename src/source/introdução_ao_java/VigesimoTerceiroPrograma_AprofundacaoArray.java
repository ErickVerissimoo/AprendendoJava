package source.introdução_ao_java;

import java.util.Scanner;

public class VigesimoTerceiroPrograma_AprofundacaoArray {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] array = new int[5]; 
        /*
         * Abaixo usamos o for para percorrer a váriavel array.
         * "lenght" se refere a quantidade de espaços totais do array.
         * Ou seja, se o array tem tamanho 5, seu lenght total é de 5.
         * 
         */
        for (int contador = 0; contador < array.length; contador++) {
            System.out.print("\n\tEntre com o número: ");
            array[contador] = entrada.nextInt(); 
            /*
             * O comando acima armazena os números digitados pelo usuário
             * e o faz X vezes com base no tamanho do array.
             */
        }

        System.out.println("Os números digitados foram:");
        /*
         * Usamos o for agora para percorrer os valores contidos no array, 
         * e imprimi-los um por um.
         */
        for (int numero : array) {
            System.out.print(numero + " "); 
        }

        entrada.close();
    }
}
