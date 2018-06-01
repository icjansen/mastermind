import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

public class InvoerView extends JPanel {

    JButton checkknop;

    public InvoerView (){

        setBackground(Color.YELLOW);

        checkknop = new JButton("Check");
        checkknop.setSize(100, 100);

        add(checkknop);
    }

//    class KnopHandler implements ActionListener {
//        public void actionPerformed( ActionEvent e ) {
//            if(e.getSource() == knop1){
//                if(waarde1 < 6){
//                    waarde1 += 1;
//                    System.out.println("waarde1 = " + waarde1);
//                }
//                else {
//                    waarde1 = 1;
//                    System.out.println("waarde1 = " + waarde1);
//                }
//
//                if(waarde1 == 1){
//                    knop1.setBackground(Color.GREEN);
//                }
//                if(waarde1 == 2){
//                    knop1.setBackground(Color.RED);
//                }
//                if(waarde1 == 3){
//                    knop1.setBackground(Color.BLUE);
//                }
//                if(waarde1 == 4){
//                    knop1.setBackground(Color.YELLOW);
//                }
//                if(waarde1 == 5){
//                    knop1.setBackground(Color.CYAN);
//                }
//                if(waarde1 == 6){
//                    knop1.setBackground(Color.MAGENTA);
//                }
//            }
//
//            if(e.getSource() == knop2){
//                if(waarde2 < 6){
//                    waarde2 += 1;
//                    System.out.println("waarde2 = " + waarde2);
//                }
//                else {
//                    waarde2 = 1;
//                    System.out.println("waarde2 = " + waarde2);
//                }
//
//                if(waarde2 == 1){
//                    knop2.setBackground(Color.GREEN);
//                }
//                if(waarde2 == 2){
//                    knop2.setBackground(Color.RED);
//                }
//                if(waarde2 == 3){
//                    knop2.setBackground(Color.BLUE);
//                }
//                if(waarde2 == 4){
//                    knop2.setBackground(Color.YELLOW);
//                }
//                if(waarde2 == 5){
//                    knop2.setBackground(Color.CYAN);
//                }
//                if(waarde2 == 6){
//                    knop2.setBackground(Color.MAGENTA);
//                }
//            }
//
//            if(e.getSource() == knop3){
//                if(waarde3 < 6){
//                    waarde3 += 1;
//                    System.out.println("waarde3 = " + waarde3);
//                }
//                else {
//                    waarde3 = 1;
//                    System.out.println("waarde3 = " + waarde3);
//                }
//
//                if(waarde3 == 1){
//                    knop3.setBackground(Color.GREEN);
//                }
//                if(waarde3 == 2){
//                    knop3.setBackground(Color.RED);
//                }
//                if(waarde3 == 3){
//                    knop3.setBackground(Color.BLUE);
//                }
//                if(waarde3 == 4){
//                    knop3.setBackground(Color.YELLOW);
//                }
//                if(waarde3 == 5){
//                    knop3.setBackground(Color.CYAN);
//                }
//                if(waarde3 == 6){
//                    knop3.setBackground(Color.MAGENTA);
//                }
//            }
//
//            if(e.getSource() == knop4){
//                if(waarde4 < 6){
//                    waarde4 += 1;
//                    System.out.println("waarde4 = " + waarde4);
//                }
//                else {
//                    waarde4 = 1;
//                    System.out.println("waarde4 = " + waarde4);
//                }
//
//                if(waarde4 == 1){
//                    knop4.setBackground(Color.GREEN);
//                }
//                if(waarde4 == 2){
//                    knop4.setBackground(Color.RED);
//                }
//                if(waarde4 == 3){
//                    knop4.setBackground(Color.BLUE);
//                }
//                if(waarde4 == 4){
//                    knop4.setBackground(Color.YELLOW);
//                }
//                if(waarde4 == 5){
//                    knop4.setBackground(Color.CYAN);
//                }
//                if(waarde4 == 6){
//                    knop4.setBackground(Color.MAGENTA);
//                }
//            }
//        }
//    }
}