import java.util.Scanner;

public class FindFactorial {
	
	public static int factorial(int num) {
		
		if (num <=1) {
			return 1;
		}
		else {
			return (num * factorial (num-1));// recursively calling factorial function
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
        System.out.println("Factorial of number : " + factorial(n));
	}

}
