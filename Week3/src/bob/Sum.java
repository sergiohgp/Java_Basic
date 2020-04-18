package bob;
import javax.swing.JOptionPane;
import java.util.Scanner;


/**
 * @author sergiohgp
 *
 */
public class Sum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Declare variables
		String payRate; 
		double bobPayRate; 
		double hours; 
		double totalPay;
		char number = 64;
		
		// Input
		payRate = JOptionPane.showInputDialog("Enter your pay rate: ");
		bobPayRate = Double.parseDouble(payRate);
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter worked hours: ");
		hours = in.nextDouble(); // Read the input as a Double
		
		// Calculation
		totalPay = bobPayRate * hours;
		
		// Output dialog box
		JOptionPane.showMessageDialog(null, "Your total pay is $" + totalPay);
		System.out.println("The ascii is " + number + ""
				+ ""
				+ ""
				+ "and the unicode is \u0040"); // \u0040 is used for @

	}

}
