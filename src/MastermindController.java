import java.awt.BorderLayout;

import javax.swing.JPanel;

class MastermindController extends JPanel {

    private GameView gameview;
    private CheckView checkview;
    private OverviewView overviewview;
    private InvoerView invoerview;

    public MastermindController() {

        //De getallen staan voor de ruimte tussen de views
        setLayout( new BorderLayout( 5, 5 ) );

        gameview = new GameView();
        invoerview = new InvoerView();
        checkview = new CheckView();
        overviewview = new OverviewView();

        add( gameview, BorderLayout.CENTER );
        add( invoerview, BorderLayout.SOUTH );
        add( checkview, BorderLayout.EAST );
        add( overviewview, BorderLayout.NORTH);
    }
}