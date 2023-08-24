package generics;

import java.util.HashSet;
import java.util.Set;

public class generic_application {

	public static void main(String[] args) {
		Containers<Integer,String> container=  new Containers<>(21, "HELLO");
		Containers<Double,String> container2=  new Containers<>(2.1, "HELLO");
		int item1=container.getItem1();
		String item2=container.getItem2();
		container2.printItems();
	}
		
		
		public static<E> Set<E> union(Set<E> set1, Set<E> set2){
			Set<E> result = new HashSet<E>(set1);
			result.addAll(set2);
			return result;
		}
		
	}
