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
          
           
       try{ 
            
           int i = 0, i2 =0, i3 =0;
           int i4 = 1;
           int tentativas = 15;
                                      int ww =0;
           Scanner entrada = new Scanner (System.in);
           Random aleatorio = new Random();

           int random = aleatorio.nextInt(0, 5); 
           ArrayList <Character> palavra = new ArrayList<Character>();
           System.out.print("\n\tBem vindo ao jogo da forca! \n\n\tDica: animais ");
           System.out.println("                  ");
           do{
               
               char letra;
               while(i<palavras[random].length()){
                   System.out.print(" _");
                   i++;
               }
               System.out.println("           ");
               System.out.print("\n\tEntre com uma letra: ");
               letra = entrada.next().charAt(0);
               if(Character.toUpperCase(letra) == palavras[random].charAt(0)){
                   System.out.println("Você acertou uma letra!");
                   palavra.add(letra);
                   tentativas--;
                   System.out.print(palavra.get(0));
                   while(i>palavras[random].length()){
                       System.out.print(" _");
                       i++;
                   }
               } else if (Character.toLowerCase(letra)== palavras[random].charAt(i4)){
                   for(i4 = 1; i4<palavra.size(); i4++){
                        System.out.println("Você acertou uma letra!");
                   palavra.add(letra);
                   tentativas--;
                   for(int i5 = 0; i5>palavra.size(); i5++){
                   System.out.print(palavra.get(i5) + "");}
                   
                   while(i>palavras[random].length() - palavra.size()){
                       System.out.print(" _");
                       i++;
                   }
                   }
               }else{
                   System.out.print("Você errou");
                   tentativas--;
               }}while(tentativas>0);}
            
       catch(Throwable exception){  
           System.out.println("Erro!");}
    finally{
            
            }
       }
        public static void main(String[] args) {
        jogo();
    }
}