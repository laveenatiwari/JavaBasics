package codilityprogramspractice;

import java.util.LinkedList;

public class LinkedListLength {

	public int solution(int[] A) {
		LinkedList<Integer> ls = new LinkedList<Integer>();
		for (int a : A) {
			if (a >= 0) {
				ls.add(a);
			}
		}
		return ls.size();
	}

	public static void main(String[] args) {
		LinkedListLength dv = new LinkedListLength();
		System.out.println(dv.solution(new int[] { 1, -4, -1, 3, 2 }));
	}
}
