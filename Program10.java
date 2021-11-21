public class Transpose {

	public static void main(String[] args) {
		//3x3 matrix
		int a[][]={{1,1,1},{2,2,2},{3,3,3}};
		int b[][] = new int [3][3];
	
		for (int i =0 ; i<3 ; i++) {
			for (int j =0 ; j<3 ;j++) {
			b[i][j] = a[j][i];
			}
		}
		for (int i =0 ; i<3 ; i++) {
			System.out.println();
			for (int j =0 ; j<3 ;j++) {
				System.out.print( b[i][j] +" ");
			}
	}

}}
