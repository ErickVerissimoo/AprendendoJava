package introdução_ao_java;

import java.util.Scanner;

public class VigesimoTerceiroPrograma_AprofundacaoArray {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] array = new int[5]; 

        for (int contador = 0; contador < array.length; contador++) {
            System.out.print("\n\tEntre com o número: ");
            array[contador] = entrada.nextInt(); 
        }

        System.out.println("Os números digitados foram:");
        for (int numero : array) {
            System.out.print(numero + " "); 
        }

        entrada.close();
    }
}
