import javax.swing.*;

public class KnopRij extends JPanel{

    private JButton pin1, pin2, pin3, pin4;
    private int aantal_pins=4;

    public KnopRij(){
        pin1 = new JButton("1");
        pin2 = new JButton("2");
        pin3 = new JButton("3");
        pin4 = new JButton("4");

        add(pin1);
        add(pin2);
        add(pin3);
        add(pin4);
    }hoi
}
