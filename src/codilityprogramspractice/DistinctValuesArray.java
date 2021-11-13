package codilityprogramspractice;

import java.util.HashSet;

public class DistinctValuesArray {

	public int solution(int[] A) {
		HashSet<Integer> h = new HashSet();
		for (int a : A) {
			h.add(a);
		}
		return h.size();
	}

	public static void main(String[] args) {
		DistinctValuesArray dv = new DistinctValuesArray();
		System.out.println(dv.solution(new int[] { -2, 2, 2, 1, 3, 1, 1 }));
	}
}
