package basicprog;

import java.util.Scanner;

public class ReverseString2 {
	static String reverse(String str) {
		String rev ="";
		for(int i=str.length();i>0;--i) {
			rev = rev+(str.charAt(i-1));
	}
		return rev;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String s = sc.nextLine();
		System.out.println("Reverse String is : " +ReverseString2.reverse(s));
	}
}
