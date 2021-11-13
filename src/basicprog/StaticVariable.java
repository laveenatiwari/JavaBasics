package basicprog;
class Variables
{
	//class var
	static int x =10;
	//display the variable 
	static void display()
	{
		System.out.println(x);
	}
}
 class StaticVariable {
		//create two references 
	 public static void main(String[] args) {
		
	Variables obj1 = new Variables();
	Variables obj2 = new Variables();
	++obj1.x;
	System.out.print("x in obj1:");
	obj1.display();
	System.out.print("x in obj2:");
	obj2.display();
	}
}