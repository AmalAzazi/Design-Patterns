
public class ChocolateController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChocolateBoiler boiler = ChocolateBoiler.getInstance();
		boiler.fill();
		boiler.boil();
		boiler.drain();

		// will return the existing instance
		ChocolateBoiler boiler2 = ChocolateBoiler.getInstance();
	}

}
