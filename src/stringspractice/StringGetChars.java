package stringspractice;

public class StringGetChars {
public static void main(String[] args) {
	String str = "hello this is  book on java";
	char arr[] = new char[20];
	str.getChars(0, 5, arr, 0);
	System.out.println(arr);
}
}
