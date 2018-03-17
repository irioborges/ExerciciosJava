package asp05.a;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Janela extends JFrame{
    private JLabel lbl_x, lbl_y;
    
    public Janela(){
        super("Align");
        setLayout(new FlowLayout());
        lbl_x = new JLabel("x");
        lbl_x.setToolTipText("X");
        lbl_y = new JLabel("y");
        lbl_x.setToolTipText("Y");
        add(lbl_x);
        add(lbl_y);
    }
    
    
    
    
}
