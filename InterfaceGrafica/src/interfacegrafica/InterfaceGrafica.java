package interfacegrafica;

import javax.swing.JFrame;
import javax.swing.JButton;

public class InterfaceGrafica {
    
    public static void main(String[] args) {
        Janela janela = new Janela();
    
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(800,600);
        janela.setVisible(true);
       
    }
    
}
