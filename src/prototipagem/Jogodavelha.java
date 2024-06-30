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
public abstract class Jogodavelha {
   public static Scanner entrada = new Scanner (System.in);
   public static int x;
   protected static char jogador;
   public static int y;
   public static int [][] vetor = new int [3][3];
   public static void sorteioinicial(){
       try{
       Random sorteio = new Random();
       int a = sorteio.nextInt(0, 2);
       if (a==1){
           jogador = 'X';
           System.out.print("Você começa jogando de X!");
       } else{
           jogador = 'O';
           System.out.print("Você joga de O");
       }
   } catch (Throwable e){
           System.out.println("erro!");
   }}
    public  void menu(){
            try{
      System.out.print("\n\tBem vindo ao jogo da velha ");
        System.out.print("\n\n\t     1   2   3 ");
        System.out.print("\n\t 1 |___|___|___|");
        System.out.print("\n\t 2 |___|___|___|");
        System.out.print("\n\t 3 |___|___|___|");
        System.out.print("\n\tEntre com a linha vertical da jogada; ");
        y = entrada.nextInt();
        System.out.print("\n\tEntre com a linha horizontal da jogada; ");
        x = entrada.nextInt();
        } catch (Throwable errogenerico){
           
        }
    }
public void maquina(){
    Random jogadamaquina = new Random();
    boolean jogada_acabou = false; 
       while(vetor[x][y] == 'X' || jogada_acabou==false){
              x = jogadamaquina.nextInt(0, 4);
              y = jogadamaquina.nextInt(0, 4);
              vetor[x][y] = 'O'; 
           if(vetor[x][y] == 'O' ){
               jogada_acabou= true;
              }
           }
       }
 protected static void imprimirTabuleiro() {
    for (int xy = 0; xy < vetor.length; xy++) {
        for (int yx = 0; yx < vetor[x].length; yx++) {
            if(vetor[x][y] == jogador){
            System.out.print(jogador);} 
            else{
                System.out.print(vetor[xy][yx]);
            }
            if (yx < vetor[x].length - 1) {
                System.out.print(" | "); 
            }
        }
        System.out.println();
        if (xy < vetor.length - 1) {
            System.out.println("---------"); 
        }
    }
    }
   }  