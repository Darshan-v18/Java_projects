package prerequisties_OOP2;

public class Chicken extends Bird{

	public Chicken( int age, double weight, String gender) {
		super( age, weight, gender);
			}
	public void fly() {
		System.out.println("Cannot fly");
	}
}

