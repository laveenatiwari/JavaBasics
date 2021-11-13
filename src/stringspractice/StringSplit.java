package stringspractice;

public class StringSplit {
public static void main(String[] args) {
	String str = "hello this is a book on java ";
	String s[];
	s=str.split(" ");
	System.out.println(str.split(" "));
	for(int i=0; i<s.length;i++) {
		System.out.println(s[i]);
	}
}
}
