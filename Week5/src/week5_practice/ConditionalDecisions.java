package week5_practice;
import javax.swing.JOptionPane;
import java.util.Scanner;


/**
 * @author sergiohgp
 *
 */
public class ConditionalDecisions {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Examples of if, if-else, if-else-if, nested if.
		
		//If
		int number1 = 30;
		int number2 = 20;
		
		if (number1 > number2)
			System.out.printf("%d is greater then %d", number1, number2);
		
		System.out.println("");
		System.out.println("-------------------------");
		System.out.println("");
		//------------------
		
		//If-else
		String username = "bob";
		
		if (username.equals("bob")) {
			System.out.println("Your username is correct!");
		}
		else {
			System.out.println("Your username is incorrect!");
		}
		
		System.out.println("");
		System.out.println("-------------------------");
		System.out.println("");
		//------------------
		
		
		//If-else-if
		// Variable declaration
		int grade;
		
		// Input
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter your grade: ");
		grade = keyboard.nextInt();
		
		// Conditional Statements
		if (grade < 0) 
			System.out.println("Input not valid. Please enter a number between 0 and 100.");
		 
		if (grade > 100) 
			System.out.println("Input not valid. Please enter a number between 0 and 100.");
		
		if (grade > 90) {
			System.out.println("You got A");
		}
		else if (grade > 80) {
			System.out.println("You got B");
		}
		else if (grade > 70) {
			System.out.println("You got C");
		}
		else if (grade > 60) {
			System.out.println("You got D");
		}
		else {
			System.out.println("You got F");
		}
		
		System.out.println("");
		System.out.println("-------------------------");
		System.out.println("");
		//------------------
		
		// Nested if
		String name = "Sergio Pereira", course = "CPCT";
		int age = 28;
		
		if (name.equals("Sergio Pereira")) {
			if (age == 28) {
				if ( course.equals("CPCT")) {
					System.out.printf("Hi " + name + ", you are " + age + " years old and your course is " + course);
				}
				else {
					System.out.printf("Hi " + name + ", you are " + age + " years old, but I do not know your course.");
				}
			}
			else {
				System.out.printf("Hi " + name + ", I don't konw your age neither your course.");
			}
		}
		else {
			System.out.printf("Who are you?");
		}
		
		System.out.println("");
		System.out.println("-------------------------");
		System.out.println("");
		//------------------
		
		// Switch
		String weekday = "wednesday";
		
		switch (weekday) 
		{
		case "sunday": System.out.printf("Relax, today is sunday."); break;
		case "monday": System.out.printf("Oh no, we began the week again."); break;
		case "tuesday": System.out.printf("Tuesday, still far from weekend."); break;
		case "wednesday": System.out.printf("Middle of the week, wednesday."); break;
		case "thursday": System.out.printf("Not friday, but closer."); break;
		case "friday": System.out.printf("Uhuuul, friday, almost weekend."); break;
		case "saturday": System.out.printf("Enjoy a beer, today is saturday."); break;
		}
		
		//------------------
		
			
		

	}

}
