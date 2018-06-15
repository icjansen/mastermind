import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalTime;

import javax.swing.*;

@SuppressWarnings("serial")
class MastermindController extends JPanel {

	private GameView gameview;
	private CheckView checkview;
	private OverviewView overviewview;
	private InvoerView invoerview;
	private CodeModel codemodel;
	public KnopRij[] knoprijen = new KnopRij[8];
	public JButton[] secretButton;
	//TODO public int[] goedoffout = new int[8];

	private int current = 0;
	//		private int waarde = 0;
	//		private int turncount=0;


	public MastermindController() {

		Color achtergrondKleur = new Color(118, 212, 255);

		//De getallen staan voor de ruimte tussen de views
		setLayout( new BorderLayout( 0, 0 ) );

		//TODO
//		for(int i=0; i<8; i++){
//
//		}

		for (int i = 7; i >= 0 ; i--){
			KnopRij knopRij;
			knopRij = new KnopRij();

			setRowState(knopRij, false);

			knopRij.pin1.addActionListener(new pinActionListener(knopRij.pin1));
			knopRij.pin2.addActionListener(new pinActionListener(knopRij.pin2));
			knopRij.pin3.addActionListener(new pinActionListener(knopRij.pin3));
			knopRij.pin4.addActionListener(new pinActionListener(knopRij.pin4));

			knoprijen[i] = knopRij;
		}

		setRowState(knoprijen[current], true);

        secretButton = new JButton[5];
        for(int i=1; i<=4; i++){
            secretButton[i]=new JButton("");
            secretButton[i].setPreferredSize(new Dimension(100, 50));
            secretButton[i].setEnabled(false);
            secretButton[i].setBackground(Color.BLACK);
        }


        gameview = new GameView(this);
		invoerview = new InvoerView();
		checkview = new CheckView();
		overviewview = new OverviewView();
		codemodel = new CodeModel();

		gameview.setBackground(achtergrondKleur);
		invoerview.setBackground(achtergrondKleur);
		checkview.setBackground(achtergrondKleur);
		overviewview.setBackground(achtergrondKleur);

		add( gameview, BorderLayout.CENTER );
		add( invoerview, BorderLayout.SOUTH );
		add( checkview, BorderLayout.EAST );
		add( overviewview, BorderLayout.NORTH);

		if (codemodel.secretpin1 == 1){
			System.out.println("Secretpin1 is groen");
		} else if(codemodel.secretpin1 == 2){
			System.out.println("Secretpin1 is rood");
		} else if(codemodel.secretpin1 == 3){
			System.out.println("Secretpin1 is blauw");
		} else if(codemodel.secretpin1 == 4){
			System.out.println("Secretpin1 is geel");
		} else if(codemodel.secretpin1 == 5){
			System.out.println("Secretpin1 is cyan");
		}else{
			System.out.println("Secretpin1 is magenta");
		}

		if (codemodel.secretpin2 == 1){
			System.out.println("Secretpin2 is groen");
		} else if(codemodel.secretpin2 == 2){
			System.out.println("Secretpin2 is rood");
		} else if(codemodel.secretpin2 == 3){
			System.out.println("Secretpin2 is blauw");
		} else if(codemodel.secretpin2 == 4){
			System.out.println("Secretpin2 is geel");
		} else if(codemodel.secretpin2 == 5){
			System.out.println("Secretpin2 is cyan");
		} else{
			System.out.println("Secretpin2 is magenta");
		}

		if (codemodel.secretpin3 == 1){
			System.out.println("Secretpin3 is groen");
		} else if(codemodel.secretpin3 == 2){
			System.out.println("Secretpin3 is rood");
		} else if(codemodel.secretpin3 == 3){
			System.out.println("Secretpin3 is blauw");
		} else if(codemodel.secretpin3 == 4){
			System.out.println("Secretpin3 is geel");
		} else if(codemodel.secretpin3 == 5){
			System.out.println("Secretpin3 is cyan");
		} else{
			System.out.println("Secretpin3 is magenta");
		}

		if (codemodel.secretpin4 == 1){
			System.out.println("Secretpin4 is groen");
		} else if(codemodel.secretpin4 == 2){
			System.out.println("Secretpin4 is rood");
		} else if(codemodel.secretpin4 == 3){
			System.out.println("Secretpin4 is blauw");
		} else if(codemodel.secretpin4 == 4){
			System.out.println("Secretpin4 is geel");
		} else if(codemodel.secretpin4 == 5){
			System.out.println("Secretpin4 is cyan");
		} else{
			System.out.println("Secretpin4 is magenta");
		}

		invoerview.resetKnop.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				checkview.timer.stop();
				codemodel = new CodeModel();
				if(current != 8){
					setRowState(knoprijen[current], false);
					current=0;
					setRowState(knoprijen[current], true);
					for(int current=0; current<8; current++){
						knoprijen[current].pin1.setBackground(new JButton().getBackground());
						knoprijen[current].pin2.setBackground(new JButton().getBackground());
						knoprijen[current].pin3.setBackground(new JButton().getBackground());
						knoprijen[current].pin4.setBackground(new JButton().getBackground());
					}
				}
				current=0;
				setRowState(knoprijen[current], true);
				invoerview.checkknop.setEnabled(true);
				for(int i=1; i<=4; i++){
					secretButton[i].setBackground(Color.BLACK);
				}
				checkview.startTime = LocalTime.now();
				checkview.isgestart=true;
				checkview.timer.start();
			}
		});

		invoerview.checkknop.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				setRowState(knoprijen[current], false);

				KnopRij currentRij = knoprijen[current];

				int pin1waarde = getIntByColor(currentRij.pin1.getBackground());
				int pin2waarde = getIntByColor(currentRij.pin2.getBackground());
				int pin3waarde = getIntByColor(currentRij.pin3.getBackground());
				int pin4waarde = getIntByColor(currentRij.pin4.getBackground());

				current++;
				if(current<=7){
					setRowState(knoprijen[current], true);
				}else{
					invoerview.checkknop.setEnabled(false);
					checkview.timer.stop();
				}

				//Wat de checkknop moet doen
				System.out.println("Rij is: ");
				//De booleans die kijken of er een zwarte pin is
				boolean zwartepin1 = false;
				boolean zwartepin2 = false;
				boolean zwartepin3 = false;
				boolean zwartepin4 = false;
				//De booleans die kijken of er een witte pin is
				boolean wittepin1 = false;
				boolean wittepin2 = false;
				boolean wittepin3 = false;
				boolean wittepin4 = false;
				//Alle if statement die de waarde van de ingevoerde pinnen en de secretpinnen checkt
				if(current <= 7){
					System.out.println("current = " + current);
					if(pin1waarde == codemodel.secretpin1){
						//geef een zwarte pin
						System.out.println("Voor pin1 is een zwarte pin");
						zwartepin1  = true;
					}
					if(pin2waarde == codemodel.secretpin2){
						//geef een zwarte pin
						System.out.println("Voor pin2 is een zwarte pin");
						zwartepin2 = true;
					}
					if(pin3waarde == codemodel.secretpin3){
						//geef een zwarte pin
						System.out.println("Voor pin3 is een zwarte pin");
						zwartepin3 = true;
					}
					if(pin4waarde == codemodel.secretpin4){
						//geef een zwarte pin
						System.out.println("Voor pin4 is een zwarte pin");
						zwartepin4 = true;
					}
					if(pin1waarde == codemodel.secretpin1 && pin2waarde == codemodel.secretpin2 && pin3waarde == codemodel.secretpin3 && pin4waarde == codemodel.secretpin4){
						System.out.println("Je hebt de code gekraakt!");
						checkview.timer.stop();
						if (codemodel.secretpin1 == 1){
							secretButton[1].setBackground(Color.GREEN);
						} else if(codemodel.secretpin1 == 2){
							secretButton[1].setBackground(Color.RED);
						} else if(codemodel.secretpin1 == 3){
							secretButton[1].setBackground(Color.BLUE);
						} else if(codemodel.secretpin1 == 4){
							secretButton[1].setBackground(Color.YELLOW);
						} else if(codemodel.secretpin1 == 5){
							secretButton[1].setBackground(Color.CYAN);
						} else{
							secretButton[1].setBackground(Color.MAGENTA);
						}

						if (codemodel.secretpin2 == 1){
							secretButton[2].setBackground(Color.GREEN);
						} else if(codemodel.secretpin2 == 2){
							secretButton[2].setBackground(Color.RED);
						} else if(codemodel.secretpin2 == 3){
							secretButton[2].setBackground(Color.BLUE);
						} else if(codemodel.secretpin2 == 4){
							secretButton[2].setBackground(Color.YELLOW);
						} else if(codemodel.secretpin2 == 5){
							secretButton[2].setBackground(Color.CYAN);
						} else{
							secretButton[2].setBackground(Color.MAGENTA);
						}

						if (codemodel.secretpin3 == 1){
							secretButton[3].setBackground(Color.GREEN);
						} else if(codemodel.secretpin3 == 2){
							secretButton[3].setBackground(Color.RED);
						} else if(codemodel.secretpin3 == 3){
							secretButton[3].setBackground(Color.BLUE);
						} else if(codemodel.secretpin3 == 4){
							secretButton[3].setBackground(Color.YELLOW);
						} else if(codemodel.secretpin3 == 5){
							secretButton[3].setBackground(Color.CYAN);
						} else{
							secretButton[3].setBackground(Color.MAGENTA);
						}

						if (codemodel.secretpin4 == 1){
							secretButton[4].setBackground(Color.GREEN);
						} else if(codemodel.secretpin4 == 2){
							secretButton[4].setBackground(Color.RED);
						} else if(codemodel.secretpin4 == 3){
							secretButton[4].setBackground(Color.BLUE);
						} else if(codemodel.secretpin4 == 4){
							secretButton[4].setBackground(Color.YELLOW);
						} else if(codemodel.secretpin4 == 5){
							secretButton[4].setBackground(Color.CYAN);
						} else{
							secretButton[4].setBackground(Color.MAGENTA);
						}
					}

					if(pin1waarde == codemodel.secretpin2 && wittepin1 == false){
						wittepin1 = true;
						if(!zwartepin2){
							//geef een witte pin
							System.out.println("Voor pin1 is een witte pin");
						}
					}
					if(pin1waarde == codemodel.secretpin3 && wittepin1 == false){
						wittepin1 = true;
						if(!zwartepin3){
							//geef een witte pin
							System.out.println("Voor pin1 is een witte pin");
						}
					}
					if(pin1waarde == codemodel.secretpin4 && wittepin1 == false){
						wittepin1 = true;
						if(!zwartepin4){
							//geef een witte pin
							System.out.println("Voor pin1 is een witte pin");
						}
					}

					if(pin2waarde == codemodel.secretpin1 && wittepin2 == false){
						wittepin2 = true;
						if(!zwartepin1){
							//geef een witte pin
							System.out.println("Voor pin2 is een witte pin");
						}
					}
					if( pin2waarde == codemodel.secretpin3 && wittepin2 == false){
						wittepin2 = true;
						if(!zwartepin3){
							//geef een witte pin
							System.out.println("Voor pin2 is een witte pin");
						}
					}
					if(pin2waarde == codemodel.secretpin4 && wittepin2 == false){
						wittepin2 = true;
						if(!zwartepin4){
							//geef een witte pin
							System.out.println("Voor pin2 is een witte pin");
						}
					}

					if(pin3waarde == codemodel.secretpin1 && wittepin3 == false){
						wittepin3 = true;
						if(!zwartepin1){
							//geef een witte pin
							System.out.println("Voor pin3 is een witte pin");
						}
					}
					if(pin3waarde == codemodel.secretpin2 && wittepin3 == false){
						wittepin3 = true;
						if(!zwartepin2){
							//geef een witte pin
							System.out.println("Voor pin3 is een witte pin");
						}
					}
					if(pin3waarde == codemodel.secretpin4 && wittepin3 == false){
						wittepin3 = true;
						if(!zwartepin4){
							//geef een witte pin
							System.out.println("Voor pin3 is een witte pin");
						}
					}

					if(pin4waarde == codemodel.secretpin1 && wittepin4 == false){
						wittepin4 = true;
						if(!zwartepin1){
							//geef een witte pin
							System.out.println("Voor pin4 is een witte pin");
						}
					}
					if(pin4waarde == codemodel.secretpin2 && wittepin4 == false){
						wittepin4 = true;
						if(!zwartepin2){
							//geef een witte pin
							System.out.println("Voor pin4 is een witte pin");
						}
					}
					if(pin4waarde == codemodel.secretpin3 && wittepin4 == false){
						wittepin4 = true;
						if(!zwartepin3){
							//geef een witte pin
							System.out.println("Voor pin4 is een witte pin");
						}
					}

					else if (pin1waarde != codemodel.secretpin1 &&
								pin1waarde != codemodel.secretpin2 && 
									pin1waarde != codemodel.secretpin3 && 
										pin1waarde != codemodel.secretpin4 && 
							pin2waarde != codemodel.secretpin1 && 
								pin2waarde != codemodel.secretpin2 && 
									pin2waarde != codemodel.secretpin3 && 
										pin2waarde != codemodel.secretpin4 &&
							pin3waarde != codemodel.secretpin1 &&
								pin3waarde != codemodel.secretpin2 &&
									pin3waarde != codemodel.secretpin3 &&
										pin3waarde != codemodel.secretpin4 &&
							pin4waarde != codemodel.secretpin1 &&
								pin4waarde != codemodel.secretpin2 &&
									pin4waarde != codemodel.secretpin3 &&
										pin4waarde != codemodel.secretpin4){
						System.out.println("Geen pinnen");
					}
				}
				else {
					System.out.println("Current = " + current);
					if (codemodel.secretpin1 == 1){
						secretButton[1].setBackground(Color.GREEN);
					} else if(codemodel.secretpin1 == 2){
						secretButton[1].setBackground(Color.RED);
					} else if(codemodel.secretpin1 == 3){
						secretButton[1].setBackground(Color.BLUE);
					} else if(codemodel.secretpin1 == 4){
						secretButton[1].setBackground(Color.YELLOW);
					} else if(codemodel.secretpin1 == 5){
						secretButton[1].setBackground(Color.CYAN);
					} else{
						secretButton[1].setBackground(Color.MAGENTA);
					}

					if (codemodel.secretpin2 == 1){
						secretButton[2].setBackground(Color.GREEN);
					} else if(codemodel.secretpin2 == 2){
						secretButton[2].setBackground(Color.RED);
					} else if(codemodel.secretpin2 == 3){
						secretButton[2].setBackground(Color.BLUE);
					} else if(codemodel.secretpin2 == 4){
						secretButton[2].setBackground(Color.YELLOW);
					} else if(codemodel.secretpin2 == 5){
						secretButton[2].setBackground(Color.CYAN);
					} else{
						secretButton[2].setBackground(Color.MAGENTA);
					}

					if (codemodel.secretpin3 == 1){
						secretButton[3].setBackground(Color.GREEN);
					} else if(codemodel.secretpin3 == 2){
						secretButton[3].setBackground(Color.RED);
					} else if(codemodel.secretpin3 == 3){
						secretButton[3].setBackground(Color.BLUE);
					} else if(codemodel.secretpin3 == 4){
						secretButton[3].setBackground(Color.YELLOW);
					} else if(codemodel.secretpin3 == 5){
						secretButton[3].setBackground(Color.CYAN);
					} else{
						secretButton[3].setBackground(Color.MAGENTA);
					}

					if (codemodel.secretpin4 == 1){
						secretButton[4].setBackground(Color.GREEN);
					} else if(codemodel.secretpin4 == 2){
						secretButton[4].setBackground(Color.RED);
					} else if(codemodel.secretpin4 == 3){
						secretButton[4].setBackground(Color.BLUE);
					} else if(codemodel.secretpin4 == 4){
						secretButton[4].setBackground(Color.YELLOW);
					} else if(codemodel.secretpin4 == 5){
						secretButton[4].setBackground(Color.CYAN);
					} else{
						secretButton[4].setBackground(Color.MAGENTA);
					}
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
	}
}