package prerequisties_OOP2;

public class Fish extends Animals {
	
	
	public Fish( int age, double weight, String gender) {
		super( age, weight, gender);
	}

	public void swim() {
		System.out.println("Swim...");
	}
	
	public void move() {
		System.out.println("it is swiming");
	}
}
