import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class OverviewView extends JPanel {

    private JLabel highscorelabel, titellabel;
    private JTextField naamtekst;

    public OverviewView (){

        setBackground(Color.RED);
        highscorelabel = new JLabel();
        highscorelabel.setText("Highscore");

        titellabel = new JLabel();
        titellabel.setText("Mastermind");

        naamtekst = new JTextField(10);
        naamtekst.setText("Voer hier een naam in");

        add(highscorelabel);
        add(titellabel);
        add(naamtekst);
    }
}