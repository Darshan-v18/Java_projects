package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Arraylist {

	public static void main(String[] args) {
		List<String> animals= new ArrayList<String>();
		animals.add("Lion");
		animals.add("cat");
		animals.add("dog");
		animals.add("Elephant");
		
//		for(int i=0; i<animals.size(); i++) {
//			System.out.println(animals.get(i));
//		}
//		
//		for(String value:animals) {
//			System.out.println(value);
//		}
	
	List<Vehicle> vehicles = new ArrayList<Vehicle>();
	Vehicle vehicle2 = new Vehicle("toyota","Camery",12000,false);
	vehicles.add(new Vehicle("honda","accord",1200,false));
	vehicles.add(vehicle2);
	vehicles.add(new Vehicle("Jeep","Wrangler",25000,true));
	
	
 	for(Vehicle v1 : vehicles) {
		System.out.println(v1.toString());
		
		printEle(vehicles);
		printEle(animals);
	}
	}
public static void printEle(List value) {
	for(int i=0; i<value.size();i++) {
		System.out.println(value.get(i));
	}
}
}
