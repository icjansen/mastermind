import java.awt.*;

import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class SecretView extends JPanel {
	public JLabel geheim1,geheim2,geheim3,geheim4;
	
	public SecretView() {
		setLayout(new GridLayout(1,1,1,1));
		
		geheim1 = new JLabel("niks");
		geheim2 = new JLabel();
		geheim3 = new JLabel();
		geheim4 = new JLabel();
		
		add(geheim1);
		add(geheim2);
		add(geheim3);
		add(geheim4);
	}
	
}