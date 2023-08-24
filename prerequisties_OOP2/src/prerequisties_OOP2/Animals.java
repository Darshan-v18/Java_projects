package prerequisties_OOP2;

public abstract class Animals {
	
	int age;
	double weight;
	String gender;
	
	
	public Animals(int age, double weight, String gender) {
		super();
		
		this.age = age;
		this.weight = weight;
		this.gender = gender;
	}

	public void eat() {
		System.out.println(" eats");
	}
	
	public void sleep() {
		System.out.println(" sleeps");
				
	}
	
	public abstract void move();
	
	
}
