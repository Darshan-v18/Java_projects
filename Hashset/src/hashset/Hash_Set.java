package hashset;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Hash_Set {

	public static void main(String[] args) {
//		HashSet<Animals> values = new HashSet<Animals>();
//		Animals ani1=new Animals("Dog",12);
//		Animals ani2=new Animals("cat",8);
//		Animals ani3=new Animals("bird",3);
//		Animals ani4=new Animals("Dog",12);
//		Animals ani5=new Animals("Kangaroo",22);
//		
//		values.add(ani1);
//		values.add(ani2);
//		values.add(ani3);
//		values.add(ani4);
//		values.add(ani5);
//		
//		
//		System.out.println(ani1.equals(ani4));
//		
//		for(Animals animal: values) {
//			System.out.println(animal);
//		}
		
		HashSet<Employee> hashset=new HashSet<Employee>();
		hashset.add(new Employee("Mike",3500,"Accounting"));
		hashset.add(new Employee("Paul",3000,"Admin"));
		hashset.add(new Employee("Peter",4500,"IT"));
		hashset.add(new Employee("Angel",4000,"Moint"));
		hashset.add(new Employee("eren",3500,"Accounting"));
		
		ArrayList<Employee> mylist =new ArrayList<Employee>(hashset);
		Collections.sort(mylist);
		System.out.println(mylist);

	
	}
}
