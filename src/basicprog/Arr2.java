package basicprog;
import java.util.Scanner;

public class Arr2 {

	public static void main(String args[]) {
		
		System.out.print("how many sujects :");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int marks[] = new int [n];
		for (int i =0; i<n ; i++)
		{
			System.out.println("Enter marks :");
			marks [i] = sc.nextInt();
			
		}
		
		//find total marks
		int tot =0;
		for (int i =0; i <n ; i++) {
			tot = tot +marks [i];
					}
	
	System.out.println("display total marks " + tot);
	}
	
}
