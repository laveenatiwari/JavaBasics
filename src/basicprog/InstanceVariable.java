package basicprog;
class ExTest
{
	//instance var
	int x =10;
	//display the variable
	void display()
	{
		System.out.println(x);
	}
}

 class InstanceVariable {

	 public static void main(String[] args) {
		
		ExTest obj1 = new ExTest();
		ExTest obj2 = new ExTest();
		++obj1.x;
		System.out.print("x in obj1 :");
		obj1.display();
		System.out.print("x in obj2:");
		obj2.display();
	}
	
}
