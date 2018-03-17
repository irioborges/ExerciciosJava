package javaapplication28;

import Janela;
import javax.swing.JFrame;

public class JavaApplication28 {

    public static void main(String[] args) {
        Janela janela = new Janela();
        
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(800, 600); 
        janela.setVisible(true);
        
    }
    
}
