package basicprog;

public class CircleCircumference {
	
	public static void main(String args[]) {
//		int r =1;
//		double cir = circumference(r);
//		System.out.print("circumference is" +cir);
		double ans =circumference(1);
		System.out.print(ans);
	}

	private static double circumference(int r) {
			
		double ans = 2*Math.PI* r ;

		return ans;
	}

}
