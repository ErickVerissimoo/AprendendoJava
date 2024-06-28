/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MiniProjetos;
import java.util.*;
/**
 *
 * @author Erick
 */
public class JogoDaVelha {
       static char jogador;
       static boolean jogadaInicial;
       static int x;
       static int y;
       static Scanner entrada = new Scanner (System.in);
       static boolean perdeu = false;
       static int i = 0;
    public static void main(String[] args) {
        Random sorteioJogador = new Random();
        Random maquina = new Random();
        int sorteio = sorteioJogador.nextInt(0, 2);
        char [][] jogo = new char [3][3];
        System.out.print("\n\tBem vindo ao jogo da velha ");
        System.out.print("\n\n\t     1   2   3 ");
        System.out.print("\n\t 1 |___|___|___|");
        System.out.print("\n\t 2 |___|___|___|");
        System.out.print("\n\t 3 |___|___|___|");
        if (sorteio== 0){
            jogador = 'X';
            System.out.printf("\n\n\tVocê joga de %c", jogador);
            jogadaInicial = true;
        }else {
            jogador = 'O';
            System.out.printf("\n\n\tVocê joga de %c", jogador);
            jogadaInicial = false;
        }
        if(jogadaInicial ==true){
            
        while(perdeu == false ||  i<jogo.length){
            System.out.print("\n\tCom base na tabela do jogo, digite o número da linha vertical da sua jogada "
                    + "\n\n\tEntre com a linha: ");
            x= entrada.nextInt();
               System.out.print("\n\tCom base na tabela do jogo, digite o número da linha horizontal da sua jogada "
                    + "\n\n\tEntre com a linha: ");
            y= entrada.nextInt();
            if (x==1 && y==1){
                // primeiro [] = eixo x
                // segundo [] = eixo y
                jogo[0][0]= jogador ;
        System.out.print("\n\n\t     1   2   3 ");
        System.out.print("\n\t 1 |X|___|___|");
        System.out.print("\n\t 2 |___|___|___|");
        System.out.print("\n\t 3 |___|___|___|");
        
                        i++;
        }
    
    }
} else if (jogadaInicial == false){
    while(perdeu == false ||  i<jogo.length){
        
    }
}
    
    
    }}