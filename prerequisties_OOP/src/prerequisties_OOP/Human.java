package prerequisties_OOP;

public class Human {
	int age;
	String name;
	String eyecolour;
	double heightininches;
	
	public void Human() {
		
	}
	
	public  void speak() {
		System.out.println("Hello my name is "+name);
		System.out.println("i am " + heightininches +" inches tall" );
		System.out.println("I am "+ age +" years old");
		System.out.println("my eye colour is "+ eyecolour);
	}
}
