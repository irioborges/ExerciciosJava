package interfacegrafica;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Janela extends JFrame{
    private JButton botao;
    
    public Janela(){
        super("Minha primeira janela");
        setLayout(new FlowLayout());
    }
    
    //botao = new JButton("Botão simples"); add(botao);
    
    
    
}
