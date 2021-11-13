package codilityprogramspractice;

public class CyclicRotation {

	public int[] solution(int[] A, int K) {
		for (int i = 0; i < K; i++) {
			int lastValue = A[A.length - 1];
			for (int j = A.length - 2; j >= 0; j--) {
				A[j + 1] = A[j];
			}
			A[0] = lastValue;
		}
		return A;
	} 

	public static void main(String[] args) {
		CyclicRotation cr = new CyclicRotation();
		int[] result = cr.solution(new int[] { 3, 8, 9, 7, 6 },3);
		for(int i: result) {
			System.out.print(i +" ");
		}
	}
}