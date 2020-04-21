/**
 * 
 */
package week7;
import java.text.DecimalFormat;

import javax.swing.JOptionPane;

/**
 * @author sergiohgp
 *
 */
public class LoanQualifier {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Variable declaration
		
		int anwser, yearsWorked; 
		double salary, creditScore;
		boolean flag = true;
		DecimalFormat dollar = new DecimalFormat("$#,##0.00");
		DecimalFormat percent = new DecimalFormat("#0.0%");
		
		
		// Loop to continue or exit program
		do {
			// user input
			// Defensive programming
			do {
				salary = Double.parseDouble(JOptionPane.showInputDialog("Enter your salary: "));
				if (salary < 0)
					JOptionPane.showMessageDialog(null, "The salary must be positive. Try again.");
				
			} while(salary < 0);
			
			// Check the salary
			if (salary < 80000) {
				JOptionPane.showMessageDialog(null, ("Your salary is " + dollar.format(salary) + 
						". Sorry, salary must be above " + dollar.format(80000)+ " to be qualifyed."));
			}
			else {
				do {
					yearsWorked = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of years worked: "));
					if (yearsWorked < 0)
						JOptionPane.showMessageDialog(null, "The worked years must be positive. Try again.");
					
				} while(yearsWorked < 0);
				
				// Check years worked
				if (yearsWorked < 5){
					JOptionPane.showMessageDialog(null, ("You worked for only " + yearsWorked +
							" years. Sorry, years worked must be more than 5 to be qualified."));
				}
				else {
					
					do {
						creditScore = Double.parseDouble(JOptionPane.showInputDialog("Enter your credit score: "));
						if (creditScore > 800)
							JOptionPane.showMessageDialog(null, "The maximum credit score is 800. Try again.");
						
					} while(creditScore > 800);
					if (creditScore <= 400) {
						JOptionPane.showMessageDialog(null, "Your credit score is only " + creditScore + 
								". Sorry, you are not qualified to get a loan.");
					}
					else if (creditScore > 400 && creditScore <= 500) {
						JOptionPane.showMessageDialog(null, "Your credit score is " + creditScore + 
								". You are qualified to get a loan of " + percent.format(.035) + ".");
					}
					else {
						JOptionPane.showMessageDialog(null, "Your credit score is " + creditScore + 
								". You are qualified to get a loan of " + percent.format(.025) + ".");
					}
				}
			}
			
			anwser = Integer.parseInt(JOptionPane.showInputDialog("Do you want to calculate again? (type 1 for yes and 2 for no): "));
		}while (anwser == 1);
		
		JOptionPane.showMessageDialog(null, ("Thanks for using this program."));
		
	}

}
