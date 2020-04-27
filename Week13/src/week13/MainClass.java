/**
 * 
 */
package week13;

import java.util.ArrayList;

/**
 * @author sergiohgp
 *
 */
public class MainClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> myList = new ArrayList<String>();
		
		// 1. Add five name to the list
			myList.add("Bob");
			myList.add("Bam");
			myList.add("Billy");
			myList.add("Bobby");
			myList.add("Hum");
		
        // 2. Get the size of the list, and print it.
			
			System.out.println(myList.size());

        // 3. Get the value of the first element, and print it.
			
			System.out.println(myList.get(0));

        // 4. Print the list Strings
			
			System.out.println(myList);

        // 5. Remove Bam element from the list
			
			myList.remove(1);

        // 6. Replace Billy with your name.
			
			myList.set(2, "Sergio");

        // 7. Print the list again as String
			
			System.out.println(myList);

        // 8. Print all elements of the list
			
			for (String names : myList) {
				System.out.println(names);
			}

	}

}
