package PracticeLoop;

public class ForLoops {

	public static void main(String[] args) {
		String str = "ghjshjdijijeijs";
		
		for(int i=str.length()-1; i>=0 ; i--) {
			System.out.println("char"+ str.charAt(i));
		}
	}

}