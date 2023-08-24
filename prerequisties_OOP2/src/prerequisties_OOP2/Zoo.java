package prerequisties_OOP2;

public class Zoo {

	public static void main(String[] args) {
		
		Animals sparrow1 = new Sparrow(1,2,"M"); 
//		sparrow1.move();
		
		Animals fish1 = new Fish(1,2,"f");
//		fish1.move();
		
		moveAnimals(fish1);
		moveAnimals(sparrow1);
	}	
		public static void moveAnimals(Animals animal) {
			animal.move();
		}
	}


