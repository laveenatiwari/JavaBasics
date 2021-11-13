package basicprog;


class Sum{
	//method to calculate sum of to numbers
	int sum(int x, int y){
		int Z = x + y;
		return Z; // method returns int type result
				
	}
}
public class Method_2parameters {

	public static void main(String[] args) {
		
		Sum s = new Sum ();//create object to Sum class
		int Z1 = s.sum(10, 20); //call method and pass two values to the method. store the result in Z1
		System.out.println("Sum of two values " + Z1);

	}

}
