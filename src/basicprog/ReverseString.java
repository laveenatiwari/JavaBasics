package basicprog;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string - ");
		String s = sc.nextLine();
		for(int i=s.length();i>0;i--) {
			System.out.println(s.charAt(i-1));
		}
	}
}
