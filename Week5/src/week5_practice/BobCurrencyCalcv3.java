/**
 * 
 */
package week5_practice;
import javax.swing.JOptionPane;

/**
 * @author sergiohgp
 *
 */
public class BobCurrencyCalcv3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// This program will calculate the currency for Bob with limited access
		
		// Declare variables
		double USD = 0.75, CAD = 1.33, amount, value;
		String username = "admin", getUsername, password = "admin", getPassword, currency, getAmount; 
		
		// Get the username and password then check both
		getUsername = JOptionPane.showInputDialog("Enter the username: ");
		
		if (getUsername.equals(username)) {
			getPassword = JOptionPane.showInputDialog("Enter the password: ");
			
			if (getPassword.equals(password)) {
				currency = JOptionPane.showInputDialog("Choose the currency (1 for CAD and 2 for USD): ");
				
				if (currency.equals("1")) {
					getAmount = JOptionPane.showInputDialog("CAD$ ");
					amount = Double.parseDouble(getAmount);
					value = amount * USD;
					JOptionPane.showMessageDialog(null, "CAD$" + amount + " is equal to USD$" + value);
					
				}
				else if (currency.equals("2")) {
					getAmount = JOptionPane.showInputDialog("USD$ ");
					amount = Double.parseDouble(getAmount);
					value = amount * CAD;
					JOptionPane.showMessageDialog(null, "USD$" + amount + " is equal to CAD$" + value);
				}
			
			}
			else {
				JOptionPane.showMessageDialog(null, "Incorret password");
				System.out.println("Incorret password");
			}
		}
		else {
			JOptionPane.showMessageDialog(null, "Incorret username");
			System.out.println("Incorret username");
		}

	}

}
