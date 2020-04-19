/**
 * 
 */
package week6;
import java.util.Scanner;

/**
 * @author sergiohgp
 *
 */
public class LoopSamples {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. While
		// 1.1. boolean
		boolean bob = true;
		int age = 1;
		
		// Loop Bob's age five times
		
		while (bob)
		{
			System.out.println("Bob is " + age + " year old.");
			age++;
			
			if (age >= 6) {
				bob = false;
			}
		}
		
		System.out.println("---------------------");
		
		//1.2. break
		// Loop Bob's age five times
		bob = true;
		while (bob)
		{
			System.out.println("Bob is " + age + " year old.");
			age++;
			
			if (age >= 6) {
				break;
			}
		}
		
		System.out.println("---------------------");
		
		// 2. Do While
		// 2.1. Numbers
		int anwser;
		
		do {
			System.out.println("1 + 1 is 2.");
			System.out.println("Do you want to see this again? (type 1 for yes and 2 for no): ");
			Scanner keyboard = new Scanner(System.in);
			anwser = keyboard.nextInt();
			
		} while (anwser == 1);
		
		System.out.println("---------------------");
		
		//2.2. Boolean
		boolean anwserBool;
		
		do {
			System.out.println("1 + 1 = 2 is true.");
			anwserBool = false;
			
		} while (anwserBool);
		
		System.out.println("---------------------");
		
		// 3. While with continue
		boolean number = true;
		while (number) {
			if (number == false) {
				continue;
			}
		}
		
		// 4. For
		for (int car = 0; car < 5; car++) {
			System.out.println("There are " + car + "in the stock now.");
		}
		
		System.out.println("---------------------");
		
		// 5. Nested
		for (int hour = 0; hour < 2; hour++) {
			for (int minute = 0; minute < 60; minute++) {
				for(int second = 0; second < 60; second++) {
					System.out.println("Time: " + hour + ":" + minute + ":" + second);
				}
			}
		}
		
		System.out.println("---------------------");

	}

}
