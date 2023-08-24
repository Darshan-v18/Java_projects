package Hashmap;

import java.util.Map;
import java.util.TreeMap;

public class Hashmap {

	public static void main(String[] args) {
		TreeMap<String, String> dictinonary = new TreeMap<String, String>();
		dictinonary.put("brave", "ready to face danger");
		dictinonary.put("brilliant", "exceptionally clever");
		dictinonary.put("joy", "a feeling of grear happy");
		dictinonary.put("confidance", "the state of feeling");

//		for(String word: dictinonary.keySet()) {
//			System.out.println(dictinonary.get(word));
//		}
		
		for(Map.Entry<String, String> entry :dictinonary.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
	}

}
