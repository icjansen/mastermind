import javax.swing.*;

public class Mastermind extends JFrame {
    public static void main( String args[] ) {
        JFrame frame = new Mastermind();
        frame.setBounds( 0, 0, 600, 730 );
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.setTitle( "Mastermind" );
        frame.setContentPane( new MastermindController() );
        frame.setVisible( true );
        frame.setResizable(false);
    }
    //Teken een paneel
    //Je tekent een ellipse
    //Je maakt een waarde, 0-3 of 1-4
    //Laat je waarde random genereren
    //Geef je die ellipse een kleur gelijk aan die waarde
    //Maak 4 zwarte ellipsen die over de te kraken code heen gaan zodat je die weer uit kan zetten
    //Knoppen maken, die de waarde verhogen, als die bij 4 is resetten naar 1
    //Dan vergelijk je de ingevoerde waarde met de te kraken waarde
}