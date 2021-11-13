package basicprog;
import java.util.Scanner;

public class InputUsingScannerClass {
	
	public static void main(String args[]) {
		
		System.out.print("Enter name, salary and id");
		Scanner sc = new Scanner(System.in);
		
		int id = sc.nextInt(); //nextInt() is used to read an integer
		String name = sc.next(); //next() method is used to read a String value
		float salary = sc.nextFloat();
		
		System.out.println(" Id is " +id);
		System.out.println("Name is " +name);
		System.out.println("Salary is" +salary);
	}

}
