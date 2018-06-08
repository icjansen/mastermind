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

	private int current = 0;
	//		private int waarde = 0;
	//		private int turncount=0;

	boolean geraden = false;

	public MastermindController() {

		//De getallen staan voor de ruimte tussen de views
		setLayout( new BorderLayout( 5, 5 ) );

		//alle rijen met knoppen worden van onder naar boven toegevoegd
		for (int i = 7; i >= 0 ; i--){
			KnopRij knopRij = knoprijen[i];
			knopRij = new KnopRij();

			//hier worden alle knoppen muv de huidige rij standaard uitgeschakeld
			setRowState(knopRij, false);

			knopRij.pin1.addActionListener(new pinActionListener(knopRij.pin1));
			knopRij.pin2.addActionListener(new pinActionListener(knopRij.pin2));
			knopRij.pin3.addActionListener(new pinActionListener(knopRij.pin3));
			knopRij.pin4.addActionListener(new pinActionListener(knopRij.pin4));

			knoprijen[i] = knopRij;
		}

		setRowState(knoprijen[current], true);

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
		//add( secretview, BorderLayout.NORTH);

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

		invoerview.checkknop.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				setRowState(knoprijen[current], false);

				KnopRij currentRij = knoprijen[current];

				int pin1waarde = getIntByColor(currentRij.pin1.getBackground());
				int pin2waarde = getIntByColor(currentRij.pin2.getBackground());
				int pin3waarde = getIntByColor(currentRij.pin3.getBackground());
				int pin4waarde = getIntByColor(currentRij.pin4.getBackground());


				current++;
				setRowState(knoprijen[current], true);


				//Wat de checkknop moet doen
				System.out.println("Rij is: ");
				boolean zwartepin = false;
				if(pin1waarde == codemodel.secretpin1){
					//geef een zwarte pin
					System.out.println("Voor pin1 is een zwarte pin");
					zwartepin  = true;
				}
				if(pin2waarde == codemodel.secretpin2){
					//geef een zwarte pin
					System.out.println("Voor pin2 is een zwarte pin");
					zwartepin = true;
				}
				if(pin3waarde == codemodel.secretpin3){
					//geef een zwarte pin
					System.out.println("Voor pin3 is een zwarte pin");
					zwartepin = true;
				}
				if(pin4waarde == codemodel.secretpin4){
					//geef een zwarte pin
					System.out.println("Voor pin4 is een zwarte pin");
					zwartepin = true;
				}
				if(pin1waarde == codemodel.secretpin2 || pin1waarde == codemodel.secretpin3 || pin1waarde == codemodel.secretpin4 && zwartepin == false){
					//geef een witte pin
					System.out.println("Voor pin1 is een witte pin");
				}
				if(pin2waarde == codemodel.secretpin1 || pin1waarde == codemodel.secretpin3 || pin1waarde == codemodel.secretpin4 && zwartepin == false){
					//geef een witte pin
					System.out.println("Voor pin2 is een witte pin");
				}
				if(pin3waarde == codemodel.secretpin1 || pin1waarde == codemodel.secretpin2 || pin1waarde == codemodel.secretpin4 && zwartepin == false){
					//geef een witte pin
					System.out.println("Voor pin3 is een witte pin");
				}
				if(pin4waarde == codemodel.secretpin1 || pin1waarde == codemodel.secretpin2 || pin1waarde == codemodel.secretpin3 && zwartepin == false){
					//geef een witte pin
					System.out.println("Voor pin4 is een witte pin");
				}
				else{
					System.out.println("Geen pinnen");
				}
			}
		});
	}

	public int getIntByColor(Color color){
		if(color == Color.GREEN){
			return 1;
		}
		if(color == Color.RED){
			return 2;
		}			
		if(color == Color.BLUE){
			return 3;
		}			
		if(color == Color.YELLOW){
			return 4;
		}			
		if(color == Color.CYAN){
			return 5;
		}
		if(color == Color.MAGENTA){
			return 6;
		}
		return current;
	}

	public void setRowState(KnopRij rij, boolean bool){
		rij.pin1.setEnabled(bool);
		rij.pin2.setEnabled(bool);
		rij.pin3.setEnabled(bool);
		rij.pin4.setEnabled(bool);
	}
}

class pinActionListener implements ActionListener {

	int waarde = 0;

	JButton pin;

	public pinActionListener(JButton pin){
		this.pin = pin;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		waarde++;
		if(waarde == 1){
			pin.setBackground(Color.GREEN);
		}
		if(waarde == 2){
			pin.setBackground(Color.RED);
		}
		if(waarde == 3){
			pin.setBackground(Color.BLUE);
		}
		if(waarde == 4){
			pin.setBackground(Color.YELLOW);
		}
		if(waarde == 5){
			pin.setBackground(Color.CYAN);
		}
		if(waarde == 6){
			pin.setBackground(Color.MAGENTA);
			waarde = 0;
		}
		//getsource, knoprij, pin, een actie toevoegen
	}
}