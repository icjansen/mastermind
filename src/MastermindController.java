import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

@SuppressWarnings("serial")
class MastermindController extends JPanel {

	private GameView gameview;
	private CheckView checkview;
	private OverviewView overviewview;
	private InvoerView invoerview;
	private SecretView secretview;
	private CodeModel codemodel;
	
	boolean geraden = false;

	public MastermindController() {

		//De getallen staan voor de ruimte tussen de views
		setLayout( new BorderLayout( 5, 5 ) );

		gameview = new GameView();
		invoerview = new InvoerView();
		checkview = new CheckView();
		overviewview = new OverviewView();
		secretview = new SecretView();
		codemodel = new CodeModel();

		add( gameview, BorderLayout.CENTER );
		add( invoerview, BorderLayout.SOUTH );
		add( checkview, BorderLayout.EAST );
		add( overviewview, BorderLayout.NORTH);
		add( secretview, BorderLayout.NORTH);

		if (codemodel.secretpin1 == 1){
			secretview.geheim1.setText("groen");
		} else if(codemodel.secretpin1 == 2){
			secretview.geheim1.setText("rood");
		} else if(codemodel.secretpin1 == 3){
			secretview.geheim1.setText("blauw");
		} else if(codemodel.secretpin1 == 4){
			secretview.geheim1.setText("geel");
		} else if(codemodel.secretpin1 == 5){
			secretview.geheim1.setText("cyan");
		}else{
			secretview.geheim1.setText("magenta");
		};

		if (codemodel.secretpin2 == 1){
			secretview.geheim2.setText("groen");
		} else if(codemodel.secretpin2 == 2){
			secretview.geheim2.setText("rood");
		} else if(codemodel.secretpin2 == 3){
			secretview.geheim2.setText("blauw");
		} else if(codemodel.secretpin2 == 4){
			secretview.geheim2.setText("geel");
		} else if(codemodel.secretpin2 == 5){
			secretview.geheim2.setText("cyan");
		} else{
			secretview.geheim2.setText("magenta");
		};

		if (codemodel.secretpin3 == 1){
			secretview.geheim3.setText("groen");
		} else if(codemodel.secretpin3 == 2){
			secretview.geheim3.setText("rood");
		} else if(codemodel.secretpin3 == 3){
			secretview.geheim3.setText("blauw");
		} else if(codemodel.secretpin3 == 4){
			secretview.geheim3.setText("geel");
		} else if(codemodel.secretpin3 == 5){
			secretview.geheim3.setText("cyan");
		} else{
			secretview.geheim3.setText("magenta");
		};

		if (codemodel.secretpin4 == 1){
			secretview.geheim4.setText("groen");
		} else if(codemodel.secretpin4 == 2){
			secretview.geheim4.setText("rood");
		} else if(codemodel.secretpin4 == 3){
			secretview.geheim4.setText("blauw");
		} else if(codemodel.secretpin4 == 4){
			secretview.geheim4.setText("geel");
		} else if(codemodel.secretpin4 == 5){
			secretview.geheim4.setText("cyan");
		} else{
			secretview.geheim4.setText("magenta");
		};
	}
	
	
	class CheckknopHandler implements ActionListener {
		public void actionPerformed( ActionEvent e ) {
			
			//hier komen de getters en setters voor de waarden
			//Hier checkt hij ook of die waardes overeenkomen met de te kraken code
			//getIngevoerdewaarde();
			if(geraden == true){

			}
			else if (geraden == false){

			}
			//row ++;
			System.out.println("row = ");

		}
	}
}
