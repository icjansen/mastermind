import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class KnopRij extends JPanel{
	
    JButton pin1;
	JButton pin2;
	JButton pin3;
	JButton pin4;

    public KnopRij(){
        pin1 = new JButton("1");
        pin2 = new JButton("2");
        pin3 = new JButton("3");
        pin4 = new JButton("4");
        pin1.setPreferredSize(new Dimension(100, 50));
        pin2.setPreferredSize(new Dimension(100, 50));
        pin3.setPreferredSize(new Dimension(100, 50));
        pin4.setPreferredSize(new Dimension(100, 50));
        
        setBackground(Color.GREEN);

        add(pin1);
        add(pin2);
        add(pin3);
        add(pin4);
    }
    
    
}
