package prerequisties_OOP2;

public class Sparrow extends Bird implements Flyable {

	public Sparrow( int age, double weight, String gender) {
		super( age, weight, gender);
	}
	public void fly() {
		System.out.println("Sparrow flys");
	}
}
