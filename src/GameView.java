import java.awt.*;
import javax.swing.*;


@SuppressWarnings("serial")
public class GameView extends JPanel {
    public GameView (MastermindController controller){
        setBackground(Color.GREEN);

        //alle rijen met knoppen worden van onder naar boven toegevoegd
        for (int i = 7; i >= 0 ; i--){
            add(controller.knoprijen[i]);
        }

        for(int i=1; i<=4; i++){
            add(controller.secretButton[i]);
        }
    }
}