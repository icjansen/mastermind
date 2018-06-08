import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

@SuppressWarnings("serial")
class MastermindController extends JPanel {

	private GameView gameview;
	private CheckView checkview;
	private OverviewView overviewview;
	private InvoerView invoerview;
	private SecretView secretview;
	private CodeModel codemodel;
	public KnopRij[] knoprijen = new KnopRij[8];
	public KnopRij knoprij1, knoprij2, knoprij3, knoprij4, knoprij5, knoprij6, knoprij7, knoprij8;
	private int waarde = 0;
	private int turncount=0;

	boolean geraden = false;

	public MastermindController() {

		//De getallen staan voor de ruimte tussen de views
		setLayout( new BorderLayout( 5, 5 ) );

		for (int i = 7; i >= 0 ; i--){
			KnopRij knopRij = knoprijen[i];
			knopRij = new KnopRij();


			knopRij.pin1.addActionListener(new pinActionListener(knopRij.pin1));
			knopRij.pin2.addActionListener(new pinActionListener(knopRij.pin2));
			knopRij.pin3.addActionListener(new pinActionListener(knopRij.pin3));
			knopRij.pin4.addActionListener(new pinActionListener(knopRij.pin4));

			knoprijen[i] = knopRij;
		}



		gameview = new GameView(this);
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
		}

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
		}

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
		}

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
		}
	}


	class CheckknopHandler implements ActionListener {
		public void actionPerformed( ActionEvent e ) {

			//hier komen de getters en setters voor de waarden
			//Hier checkt hij ook of die waardes overeenkomen met de te kraken code
			//getIngevoerdewaarde();
			if(geraden){

			}
			else{

			}
			//row ++;
			System.out.println("row = ");

		}
	}

	class ButtonHandler implements ActionListener{
		public void actionPerformed(ActionEvent e){
			if(e.getSource()==knoprij1.pin1){
				if(waarde < 6){
					waarde += 1;
					System.out.println("waarde = " + waarde);
				}
				else {
					waarde = 1;
					System.out.println("waarde = " + waarde);
				}

				if(waarde == 1){
					knoprij1.pin1.setBackground(Color.GREEN);
				}
				if(waarde == 2){
					knoprij1.pin1.setBackground(Color.RED);
				}
				if(waarde == 3){
					knoprij1.pin1.setBackground(Color.BLUE);
				}
				if(waarde == 4){
					knoprij1.pin1.setBackground(Color.YELLOW);
				}
				if(waarde == 5){
					knoprij1.pin1.setBackground(Color.CYAN);
				}
				if(waarde == 6){
					knoprij1.pin1.setBackground(Color.MAGENTA);
				}
			}
		}
	}

	class pinActionListener implements ActionListener {

		JButton pin;

		public pinActionListener(JButton pin) {
			this.pin = pin;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			pin.setText("pin 1 gedrukt");
			for (int i = 0; i < knoprijen.length; i++) {
				if (e.getSource() == knoprijen[i].pin1) {
//					knoprijen[i].pin1.setBackground(Color.BLUE);
					System.out.println("test rij 1");
					if(waarde < 6){
						waarde += 1;
					}
					else {
						waarde = 1;
						System.out.println("waarde = " + waarde);
					}

					if(waarde == 1){
						knoprijen[i].pin1.setBackground(Color.GREEN);
					}
					if(waarde == 2){
						knoprijen[i].pin1.setBackground(Color.RED);
					}
					if(waarde == 3){
						knoprijen[i].pin1.setBackground(Color.BLUE);
					}
					if(waarde == 4){
						knoprijen[i].pin1.setBackground(Color.YELLOW);
					}
					if(waarde == 5){
						knoprijen[i].pin1.setBackground(Color.CYAN);
					}
					if(waarde == 6){
						knoprijen[i].pin1.setBackground(Color.MAGENTA);
					}
				}else if(e.getSource() == knoprijen[i].pin2) {
//					knoprijen[i].pin1.setBackground(Color.BLUE);
						System.out.println("test rij 2");
						if(waarde < 6){
							waarde += 1;
						}
						else {
							waarde = 1;
							System.out.println("waarde = " + waarde);
						}

						if(waarde == 1){
							knoprijen[i].pin2.setBackground(Color.GREEN);
						}
						if(waarde == 2){
							knoprijen[i].pin2.setBackground(Color.RED);
						}
						if(waarde == 3){
							knoprijen[i].pin2.setBackground(Color.BLUE);
						}
						if(waarde == 4){
							knoprijen[i].pin2.setBackground(Color.YELLOW);
						}
						if(waarde == 5){
							knoprijen[i].pin2.setBackground(Color.CYAN);
						}
						if(waarde == 6){
							knoprijen[i].pin2.setBackground(Color.MAGENTA);
						}
					}else if(e.getSource() == knoprijen[i].pin3) {
//					knoprijen[i].pin1.setBackground(Color.BLUE);
					System.out.println("test rij 3");
					if(waarde < 6){
						waarde += 1;
					}
					else {
						waarde = 1;
						System.out.println("waarde = " + waarde);
					}

					if(waarde == 1){
						knoprijen[i].pin3.setBackground(Color.GREEN);
					}
					if(waarde == 2){
						knoprijen[i].pin3.setBackground(Color.RED);
					}
					if(waarde == 3){
						knoprijen[i].pin3.setBackground(Color.BLUE);
					}
					if(waarde == 4){
						knoprijen[i].pin3.setBackground(Color.YELLOW);
					}
					if(waarde == 5){
						knoprijen[i].pin3.setBackground(Color.CYAN);
					}
					if(waarde == 6){
						knoprijen[i].pin3.setBackground(Color.MAGENTA);
					}
				}else if(e.getSource() == knoprijen[i].pin4) {
//					knoprijen[i].pin1.setBackground(Color.BLUE);
					System.out.println("test rij 4");
					if (waarde < 6) {
						waarde += 1;
					} else {
						waarde = 1;
						System.out.println("waarde = " + waarde);
					}

					if (waarde == 1) {
						knoprijen[i].pin4.setBackground(Color.GREEN);
					}
					if (waarde == 2) {
						knoprijen[i].pin4.setBackground(Color.RED);
					}
					if (waarde == 3) {
						knoprijen[i].pin4.setBackground(Color.BLUE);
					}
					if (waarde == 4) {
						knoprijen[i].pin4.setBackground(Color.YELLOW);
					}
					if (waarde == 5) {
						knoprijen[i].pin4.setBackground(Color.CYAN);
					}
					if (waarde == 6) {
						knoprijen[i].pin4.setBackground(Color.MAGENTA);
					}
				}
			}
		}
	}
}
