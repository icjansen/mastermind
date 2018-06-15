import java.awt.*;
import javax.swing.JButton;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class InvoerView extends JPanel {

    public JButton checkknop, resetKnop;

    public InvoerView (){

        checkknop = new JButton("Check");
        checkknop.setPreferredSize(new Dimension(300, 50));

        resetKnop = new JButton("Reset");
        resetKnop.setBackground(Color.RED);

        add(checkknop);
        add(resetKnop);
    }
}