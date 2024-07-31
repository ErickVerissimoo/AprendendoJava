package source.exceções;
import java.awt.Color;

import javax.swing.JFrame;
public class SwingMuitoBasico {
    public static void main (String [] args){
        JFrame tela = new JFrame();
        tela.setBackground(Color.black);
        tela.setTitle("primeira tela em Swing");
        tela.setSize(400, 400);
        tela.setResizable(true);
                tela.setVisible(true);
    }
}