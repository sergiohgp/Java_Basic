/**
 * 
 */
package week5_practice;
import javax.swing.JOptionPane;

/**
 * @author sergiohgp
 *
 */
public class BobCurrencyCalcv2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// This program will calculate the currency for Bob with password
		
		// Declare and initialize variables
		double USD = 1, CAD = 1.33, value = USD* CAD;
		String password = "admin", getPassword;
		
		// Get the password and check it
		getPassword = JOptionPane.showInputDialog("Enter the password: ");
		
		if (getPassword.equals(password)) {
			System.out.println("Access granted");
			System.out.println("USD$" + USD + " is equal to CAD$" + value);
		}
		else {
			System.out.println("Access denied");
		}
		


	}

}
