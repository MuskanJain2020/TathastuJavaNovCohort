public class StringPalindrome {
	
	public static String checkPalindrome(String s) {
		int n = s.length();
		int count=0;
		for (int i =0 ; i<n/2; i++) {
			if (s.charAt(i) == s.charAt(n-i-1)) {
				count++;
			}
			else {
				break;
			}
		}
		if (count==(n/2)-1) {
			return "palindrome";
		}
		
		else {return" not a palindrome";}
	}
	
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s= scan.nextLine();
		System.out.println(checkPalindrome( s));
		

	}

}
