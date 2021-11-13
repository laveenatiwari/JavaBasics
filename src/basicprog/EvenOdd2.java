package basicprog;

public class EvenOdd2 {
	
	public static void main(String[] args) {
		checkEvenOdd(13);
		sayHi();
	}
		private static void sayHi() {
			System.out.println("hello");
		
	}
		public static void checkEvenOdd(int no) { //parameterised method
			
			 int rem = no % 2;
			 if( rem ==0)
			 {
				 System.out.println("number " + no + "is even");
			 }
			 else {
				 System.out.println("number" + no + "is odd");
			 }
			
			
		}
		 
	}


