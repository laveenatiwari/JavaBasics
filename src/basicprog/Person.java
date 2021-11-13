package basicprog;
import java.io.OutputStream;

public class Person {

	private String name ;
	private String company;
	private int age;
	
	Person()
	{
		name = "Laveena";
		company = "Barclays";
		age = 26;
	}
	
Person(String s, String c, int i)
{
	name = s;
	company = c ;
	age = i;
	
}
	
	void details()
	{
		System.out.println("Hello my name is " + name);
		System.out.println("My age is " + age);
		System.out.println("I am working at" + company);
	}
}
