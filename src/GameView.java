import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class GameView extends JPanel {
    private int aantal_pins = 41;
    private JButton[] pin;
//    private int[] waarde;
    private int waarde = 0;
    private int turncount=0;
    private KnopRij knoprij1, knoprij2, knoprij3, knoprij4, knoprij5, knoprij6, knoprij7, knoprij8;

    public GameView (){

        setBackground(Color.GREEN);

        knoprij1 = new KnopRij();
        knoprij2 = new KnopRij();
        knoprij3 = new KnopRij();
        knoprij4 = new KnopRij();
        knoprij5 = new KnopRij();
        knoprij6 = new KnopRij();
        knoprij7 = new KnopRij();
        knoprij8 = new KnopRij();

//        pin = new JButton[aantal_pins];
//
//        for(int i=1; i<aantal_pins; i++){
//            pin[i]=new JButton(""+i);
//            pin[i].setPreferredSize(new Dimension(100, 50));
//            pin[i].addActionListener(new ButtonHandler());
//            pin[i].setEnabled(false);
//        }
//
//        if(turncount==0){
//
//        }
//
//        for(int i=40; i>0; i--){
//            add(pin[i]);
//        }



//        for(int i=4; i<=6; i++){
//            add(pin[i]);
//        }
//        for(int i=7; i<=9; i++){
//            add(pin[i]);
//        }
//        for(int i=10; i<=12; i++){
//            add(pin[i]);
//        }
//        for(int i=13; i<=15; i++){
//            add(pin[i]);
//        }
//        for(int i=16; i<=18; i++){
//            add(pin[i]);
//        }
//        for(int i=19; i<=21; i++){
//            add(pin[i]);
//        }
//        for(int i=22; i<=24; i++){
//            add(pin[i]);
//        }
//        for(int i=25; i<=27; i++){
//            add(pin[i]);
//        }
//        for(int i=28; i<=30; i++){
//            add(pin[i]);
//        }
//        for(int i=31; i<=33; i++){
//            add(pin[i]);
//        }
//        for(int i=34; i<=36; i++){
//            add(pin[i]);
//        }
//        for(int i=37; i<=39; i++){
//            add(pin[i]);
//        }
    }

    //knoprijen-->if(knoprij ==1 && knop1)

    //https://coderanch.com/t/411623/java/Identifying-button-array-pressed
    //https://stackoverflow.com/questions/29529411/java-array-of-buttons-get-the-source?utm_medium=organic&utm_source=google_rich_qa&utm_campaign=google_rich_qa

    //welke pin geklikt? die pin onthouden en de kleur en waarde daarvan aanpassen
    class ButtonHandler implements ActionListener{
        public void actionPerformed(ActionEvent e){

//            for(int i=0; i<pin.length; i++){
//                if(e.getSource() == pin[i]){
//                    pin[i].setBackground(Color.BLUE);
//                    if(waarde < 6){
//                        waarde += 1;
//                        System.out.println("waarde = " + waarde);
//                    }
//                    else {
//                        waarde = 1;
//                        System.out.println("waarde = " + waarde);
//                    }
//
//                    if(waarde == 1){
//                        pin[i].setBackground(Color.GREEN);
//                    }
//                    if(waarde == 2){
//                        pin[i].setBackground(Color.RED);
//                    }
//                    if(waarde == 3){
//                        pin[i].setBackground(Color.BLUE);
//                    }
//                    if(waarde == 4){
//                        pin[i].setBackground(Color.YELLOW);
//                    }
//                    if(waarde == 5){
//                        pin[i].setBackground(Color.CYAN);
//                    }
//                    if(waarde == 6){
//                        pin[i].setBackground(Color.MAGENTA);
//                    }
////                    if(waarde[i] < 6){
////                        waarde[i] += 1;
////                        System.out.println("waarde van " + pin[i] + "= " + waarde[i]);
////                    }
////                    else {
////                        waarde[i] = 1;
////                        System.out.println("waarde van " + pin[i] + "= " + waarde[i]);
////                    }
////
////                    if(waarde[i] == 1){
////                        pin[i].setBackground(Color.GREEN);
////                    }
////                    if(waarde[i] == 2){
////                        pin[i].setBackground(Color.RED);
////                    }
////                    if(waarde[i] == 3){
////                        pin[i].setBackground(Color.BLUE);
////                    }
////                    if(waarde[i] == 4){
////                        pin[i].setBackground(Color.YELLOW);
////                    }
////                    if(waarde[i] == 5){
////                        pin[i].setBackground(Color.CYAN);
////                    }
////                    if(waarde[i] == 6){
////                        pin[i].setBackground(Color.MAGENTA);
////                    }
//                }
//            }
        }
    }
}