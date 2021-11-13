package basicprog;

class Sample
{
	private double num1,num2;
	Sample(double x, double y){
		num1 = x;
		num2 = y;		
	}
	double sum()
	{
		double res = num1 + num2;
		
		return res;//return result
		
	}
}
 class MethodsSample {

	public static void main(String[] args) {
		Sample s = new Sample(10,2.4);
		double x = s.sum();
		System.out.print("Sum =" + x);

	}

}
