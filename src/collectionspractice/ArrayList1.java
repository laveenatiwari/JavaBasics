package collectionspractice;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(12);
		numbers.add(30);
		numbers.add(30);
		numbers.add(13);
		System.out.println(numbers);
		Iterator<Integer> it = numbers.iterator();
		while(it.hasNext()) {
			Integer i = it.next();
			if(i<15) {
				it.remove();
			}
		}
		System.out.println(numbers);
	}
}
