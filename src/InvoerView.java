import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class InvoerView extends JPanel {

    public JButton checkknop;

    public InvoerView (){

        setBackground(Color.YELLOW);

        checkknop = new JButton("Check");
        checkknop.setSize(100, 100);

        add(checkknop);
    }
}