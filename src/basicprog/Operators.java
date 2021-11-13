package basicprog;

public class Operators {

	
	public static void main(String args[]) {
		int n =12;
		float f = 12.34f;
		//f =(float)n;  //EXPLICIT CASTING
		f =n ; //implicit casting
		int no1 = (int) (f * n);
		System.out.println(no1);
		byte b =23;
		long l =122872947l;
		n =(int)l;
		b = (byte)n;
		System.out.println(l);
		System.out.println(Double.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
	}
}
