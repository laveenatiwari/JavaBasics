package collectionspractice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMap1 {

	public static void main(String[] args) {
		HashMap<String,String> cities = new HashMap<String,String>();
		cities.put("England", "London");
		cities.put("India", "New Delhi");
		cities.put("Norway", "Oslo");
		cities.put("USA", "Washington DC");
		System.out.println(cities);
//		Iterator it = cities.entrySet().iterator();
//		while(it.hasNext()) {
//			Map.Entry pair = (Map.Entry)it.next();
//			System.out.println(pair.getKey()+ " = "+ pair.getValue());
//			it.remove();
//		}
		for(String i:cities.keySet()) {
			System.out.println("key : "+ i +"  and value: " + cities.get(i));
		}
	}

}
