package inheritanceAndAbstraction;

public class Tablet extends Medicine {


	public Tablet(double price, String expiry_date) {
		super(price, expiry_date);

	}

	@Override
	void displayLabel() {
		System.out.println("Store tablets in cool and dry place");
		
	}
	

}
