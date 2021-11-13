package basicprog;
import java.util.Scanner;

public class PrimeCheck {

		public static void main(String [] args) {
			System.out.print("Input number to check whether prime or not :");
			Scanner sc = new Scanner(System.in);
			int no = sc.nextInt();
			
		boolean retValue =	checkNumberIsPrime(no);
		System.out.println("Number :" +no+ "is prime? " + retValue);
		}

		private static boolean checkNumberIsPrime(int no) {
			
			boolean isPrime = true;
			for (int i= 0; i<= no ; i++) {
				
				if (no % 2 ==0) {
					isPrime = false;
					break; //it breaks the loop
				}
			}
			//System.out.print("Is" +no + "prime:" + isPrime);
			return isPrime;
		
		}
}
