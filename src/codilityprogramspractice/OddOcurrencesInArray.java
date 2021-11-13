package codilityprogramspractice;

import java.util.HashSet;

public class OddOcurrencesInArray {
	
  	HashSet<Integer> aList = new HashSet<Integer>();
    public int solution(int[] A) {
	for(int i=0;i<A.length;i++) {
	int a =A[i];
	if(aList.contains(a)) {
		aList.remove(new Integer(a));
	}else {
		aList.add(a);
	}
	}
	return aList.iterator().next();      
    }
	
	public static void main(String[] args) {
		OddOcurrencesInArray  ar = new OddOcurrencesInArray();
		ar.solution(new int[] {3,4,4,5,3,5,7});
	}

}
