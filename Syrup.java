package inheritanceAndAbstraction;

public class Syrup extends Medicine{

	public Syrup(double price, String expiry_date) {
		super(price, expiry_date);
		
	}

	@Override
	void displayLabel() {
		System.out.println("Syrup for dry cough");
		
	}

}
