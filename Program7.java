import java.util.Scanner;

public class ReverseString {
	public static void reverseS(String s) {
		
	    String RS = new StringBuffer(s).reverse().toString();
		System.out.println("String in reverse order : " +  RS);
		
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s= scan.nextLine();
        reverseS(s);
	}

}
