/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prototipagem;
import java.util.*;

/** 
 *
 * @author Erick
 */
public abstract class metodos {
    public static String[] palavras = {"Macaco", "Elefante", "Cachorro", "Girafa", "Vaca"}; 
        public static void jogo(){
            boolean acabou = false;
       try{
           
           int i = 0;
           int tentativas = 15;
           Scanner entrada = new Scanner (System.in);
           Random aleatorio = new Random();
           int random = aleatorio.nextInt(0, 5); 
           System.out.print("\n\tBem vindo ao jogo da forca! \n\n\tDica: animais ");
           System.out.println("                  ");
           while(tentativas>0){
               char letra;
               while(i<palavras[random].length()){
                   System.out.print(" _ ");
                   i++;
               }
               System.out.println("           ");
               System.out.print("\n\tEntre com uma letra: ");
               letra = entrada.next().charAt(0);
              if (Character.toUpperCase(letra) == palavras[random].charAt(0)) {
    System.out.print("\n\tVocê acertou a primeira letra!");
    String[] linhas = new String[palavras[random].length()];
    String letrae = String.valueOf(Character.toUpperCase(letra));
    linhas[0] = letrae;
    System.out.print(letrae);
    for (int in = 0; in < linhas.length; in++) {
        System.out.print("\t _ ");
    }
} else if (Character.toUpperCase(letra) != palavras[random].charAt(0)) {
    while (i < palavras[random].length()) {
        System.out.print(" _ ");
        i++;
    }
    System.out.print("\n\tVocê errou! \n\tTente novamente: ");
    tentativas--;
}


           tentativas--;
           }    
       }catch(Throwable exception){  
           System.out.println("Erro!");}
    finally{
            
            }
       }
       
           
       
        
        public static void main(String[] args) {
        jogo();
    }
}