import java.util.Random;

public class CodeModel {
	//Hier wordt de random te kraken waarde gemaakt
	public int secretpin1, secretpin2, secretpin3, secretpin4, secretpin5, secretpin6;
	
	public CodeModel(){
		
		Random random = new Random();
		secretpin1 = random.nextInt(6 - 1 + 1) + 1;
		secretpin2 = random.nextInt(6 - 1 + 1) + 1;
		secretpin3 = random.nextInt(6 - 1 + 1) + 1;
		secretpin4 = random.nextInt(6 - 1 + 1) + 1;
		secretpin5 = random.nextInt(6 - 1 + 1) + 1;
		secretpin6 = random.nextInt(6 - 1 + 1) + 1;

	}
}