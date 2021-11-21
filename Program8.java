import java.util.Scanner;

public class MirrorInverse {
	
	public static boolean swapIndexValue(int a[] , int n) {
		for (int i =0 ; i<n ; i++) {
			 if (a[a[i]] != i)
	                return false;
	        }
		return true;
	 
		}
		
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i =0 ; i<n ; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println(swapIndexValue(a,n));
		
	}

}
