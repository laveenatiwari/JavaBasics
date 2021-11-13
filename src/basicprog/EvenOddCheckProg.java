package basicprog;

public class EvenOddCheckProg {
	
	
	public static void main(String args[]) {
		
		boolean returnValue = checkEvenOdd(2);//at run time the number will be provided
		System.out.println("Is number prime : " +returnValue);
		
	}
	public static boolean checkEvenOdd(int no) {
				
//		int rem =no % 2;
//		
//		if (rem ==0)
//		{
//			System.out.println("number is " + no +"is even");
//		}
//		else 
//		{ 
//			System.out.println("Number is " + no + "is odd");
//		}
		
		boolean isPrime = true;
				for(int i =2; i <no ; i++)
					if (no%2==0) {
						isPrime= false;
						break;
					}
		//		System.out.print("Is \t" +no +"isPrime : \t" +isPrime);
				return isPrime;
	}

}
