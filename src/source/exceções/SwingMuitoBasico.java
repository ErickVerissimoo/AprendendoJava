package source.exceções;

import java.awt.Color;
import javax.swing.JFrame;

public class SwingMuitoBasico {
    public static void main(String[] args) {
        JFrame tela = new JFrame();
        
        tela.setTitle("Primeira tela em Swing");
        tela.setSize(400, 400);
        tela.setResizable(true);
        tela.getContentPane().setBackground(Color.BLACK); 
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                tela.setVisible(true);
    }
}