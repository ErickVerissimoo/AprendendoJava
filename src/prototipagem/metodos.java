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
    public static String[] palavras = {"\n\tMacaco", "\n\tElefante", "\n\tCachorro", "\n\tGirafa", "\n\tVaca"}; 
        public static void jogo(){
        try{
        Random escolha = new Random();
        int aleatorio = escolha.nextInt(0, 5);
            Scanner entrada = new Scanner (System.in);
            System.out.println("\n\tBem vindo ao jogo da forca! \n\tTema do jogo: animais");
            for(int letra = 0; letra<palavras[aleatorio].length(); letra++){
                System.out.print("\t _ ");
        }
            int tentativas = palavras[aleatorio].length() +3;
            while(tentativas>0){
            char letra;
            System.out.print("\n\tEntre com uma letra da palavra: ");
            letra = entrada.next().charAt(0);
             
              for(int index = 0; index<palavras[aleatorio].length(); index++ ){
               if(letra == palavras[aleatorio].charAt(index) && index>0){
                    System.out.print(Character.toLowerCase(letra));
                    tentativas--;
                } else{
                   System.out.print("\n\t voce errou ");
                   tentativas--;

        }
              
                
                
                
          if(letra == palavras[aleatorio].charAt(0)){
               System.out.print(Character.toUpperCase(letra));}
               else {
        
                System.out.print(" _ ");        
          }
            }} 
            
     
        } catch(Throwable errado){
            System.out.print("\n\tErro!");
        }
}
    public static void main(String[] args) {
        jogo();
    }
} 
