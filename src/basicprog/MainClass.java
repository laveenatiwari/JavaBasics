package basicprog;

public class MainClass {

	public static void main(String[] args) {
		
		Person Laveena = new Person();
		Laveena.details();
		
		Person Bulbul =new Person("Bulbul", "Deloitte",23);
		Bulbul.details();
		
		System.out.println("Hash code of Laveena object is =" + Laveena.hashCode());
		System.out.println("hashcode of Bulbul object is =" + Bulbul.hashCode());		

	}

}
