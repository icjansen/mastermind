
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

import javax.swing.*;

public class CheckView extends JPanel {

    private JLabel tijdlabel, tijdbeschrijving;
    private Timer timer = new Timer(10, new TimerHandler());
    LocalTime startTime=LocalTime.now();
    LocalTime currentTime=LocalTime.now();
    private boolean isgestart=false;

    public CheckView (){

//        setLayout(null);

//        setBackground(Color.BLUE);
        if (!isgestart) {
            timer.start();
            startTime = LocalTime.now();
            isgestart=true;
        }
        tijdlabel = new JLabel (""+timer);
        tijdbeschrijving = new JLabel("Verstreken tijd:");

        add(tijdbeschrijving);
        add(tijdlabel);
    }
    class TimerHandler implements ActionListener {
        public void actionPerformed(ActionEvent e){
            currentTime = LocalTime.now();
            long elapsedtime= ChronoUnit.MILLIS.between(startTime, currentTime);

            long minuten = elapsedtime / 60000;
            long seconden = elapsedtime%60000;
//            long milliseconden = elapsedtime/1000;

            tijdlabel.setText("" + minuten + ":"+ seconden/1000 + " m:s");
//            tijdlabel.setText(String.format("%2.2f", (double)(elapsedtime/1000.0))+" seconden" );
        }
    }
}