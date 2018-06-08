import java.awt.*;
import javax.swing.*;


@SuppressWarnings("serial")
public class GameView extends JPanel {
    public GameView (MastermindController controller){
        setBackground(Color.GREEN);

        for (int i = 7; i >= 0 ; i--){
            add(controller.knoprijen[i]);
        }
    }
}