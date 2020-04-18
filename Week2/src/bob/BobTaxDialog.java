
package bob;
import javax.swing.JOptionPane;

/**
 * @author sergiohgp
 *
 */
public class BobTaxDialog {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// This program will calculate Bob taxes
		// Declare variables
		String salary;
		double bobSalary, taxRate = .26, taxPercentage = taxRate * 100;
		
		// Take the input as string
		salary = JOptionPane.showInputDialog("Please enter your salary: ");
		bobSalary = Double.parseDouble(salary); // Convert string to double
		
		double taxOwned = taxRate * bobSalary, finalSalary = bobSalary - taxOwned;
		
		// Used for output
		JOptionPane.showMessageDialog(null, "Your salary is $" + bobSalary + ""
				+ "at the tax rate of " + taxPercentage + "% the final salary "
				+ "is $" + finalSalary);

	}

}
