package inheritanceAndAbstraction;

public class TestMedicine {

	public static void main(String[] args) {

		//Medicine m[]=new Medicine[5]; 
		double a=Math.random()*4;
		int b=(int) a;
		System.out.println(b);

		switch(b)
		{
		case 1:
			Medicine m =new Syrup(445.65,"08-04-2023");
			m.displayLabel();
			break;

		case 2:

			Medicine m1 =new Ointment(645.20,"09-06-2021");
			m1.displayLabel();
			break;

		case 3:

			Medicine m2 =new Tablet(234.12,"12-01-2024");
			m2.displayLabel();
			break;
		}

	}

}
