import java.util.Scanner;

public class permutationandcombination {
	
	public static int factorial (int num) {
		if (num <=1) {
			return 1;
		}
		else {
			return (num * factorial (num-1));// recursively calling factorial function
		}
	}
		
		
		
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int n, r, NCR, NPR;
			
			System.out.print("Please Enter n Value = ");
			n = sc.nextInt();
			System.out.print("Please Enter r Value = ");
			r = sc.nextInt();
			
			NCR = factorial(n)/(factorial(n - r) * factorial(r));
			NPR = factorial(n)/factorial(n - r);
			
			System.out.println("NCR Value = " + NCR);
			System.out.println("NPR Value = " + NPR);
			
			
			
	
	}

}
