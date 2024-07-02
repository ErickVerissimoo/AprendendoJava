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
          

           
           int i = 0, i2 =0, i3 =0;
           int i4 = 1;
           int tentativas = 15;
           char a;
                                      int ww =0;
           Scanner entrada = new Scanner (System.in);
           Random aleatorio = new Random();
        
           int random = aleatorio.nextInt(0, 5); 
           String palavra = palavras[random];
           ArrayList <Character> Palavra = new ArrayList<Character>();
           char [] palavraChar = palavra.toCharArray();
           System.out.print("\n\tBem vindo ao jogo da forca! \n\n\tDica: animais ");
           System.out.println("                  ");
               while(i<palavra.length()){
                   System.out.print(" _");
                   i++;
               }
               while(tentativas>0){

                   char letra;
               System.out.print("Entre com uma letra: ");
               letra = entrada.next().charAt(0);
               if(palavra.contains(String.valueOf(Character.toUpperCase(letra))) && palavra.charAt(0) == letra){
                   System.out.print("Você acertou a primeira letra!");
                   Palavra.add(0, Character.toUpperCase(letra));
                         tentativas--;
               }
         

                   else if(palavra.contains(String.valueOf(Character.toLowerCase(letra))) && palavra.charAt(0) != letra){
                           System.out.print("Você acertou uma letra");
                           Palavra.add(String.valueOf(letra).indexOf(palavra) ,Character.toLowerCase(letra));
                           }
                           }
                           for(i = 0; i<palavra.length(); i++){
                        if (palavraChar.equals(Palavra.get(i))){
                            System.out.println(Palavra.get(i));
                            
                        } else{
                            System.out.print(" _");
                        }
               }
               
        }  
     
        public static void main(String[] args) {
        jogo();
    }
}