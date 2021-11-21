import java.util.ArrayList;

public class ArrayListprogram {

	public static void main(String[] args) {
		 ArrayList<Integer> list = new ArrayList<>();
		 // add elements to list
		 list.add(0);
		 list.add(1);
		 list.add(2);
		 list.add(3);
		 list.add(4);
		 System.out.println("ArrayList");
		 for (int i =0 ; i<list.size(); i++) {
			 System.out.print(list.get(i) + " ");
		 }
		 System.out.println();
    // Removing elements from arraylist
		 list.remove(2);
		 list.remove(2);
		 System.out.println("ArrayList");
		 for (int i =0 ; i<list.size( ); i++) {
			 System.out.print(list.get(i) + " ");
		 }
		 
	 

	}

}
