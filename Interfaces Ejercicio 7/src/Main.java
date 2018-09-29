import java.util.ArrayList;

import model.Alien.Andorian;
import model.Terrestrial.Cat;
import model.Universe.Being;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cat cat = new Cat(7, true);
		cat.listen();
		cat.isPettable = true;
		
		Andorian shran = new Andorian(true);
		shran.listen();
		shran.levitate();
		
		ArrayList<Being> test = new ArrayList<Being>();
		test.add(cat);
		test.add(shran);
	}

}