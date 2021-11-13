package basicprog;
class StaticMethod1  
	{
	public static void main(String[] args) {
		Test.access();
	}
}


class Test{

	//static variable
	static int x = 55;
	//static method accessing x value 
	static void access()
	{
		System.out.println("x="+ x);
	}
}
