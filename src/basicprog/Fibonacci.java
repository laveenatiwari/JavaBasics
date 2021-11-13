package basicprog;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		int fibLength;
		Scanner sc = new Scanner(System.in);
	    fibLength = sc.nextInt();
		int[] num =new int[fibLength];
		num[0]=0;
		num[1]=1;
		for(int i=2;i<fibLength;i++) {
			num[i]=num[i-1]+num[i-2];
		}
		System.out.println("fibonacci series : ");
		for(int i=0;i<fibLength; i++) {
			System.out.print(num[i]+ " ");
		}
	}
}
