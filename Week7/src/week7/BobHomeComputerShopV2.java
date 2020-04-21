/**
 * 
 */
package week7;
import javax.swing.JOptionPane;

import java.text.DecimalFormat;
import java.util.Scanner;

import javax.swing.JOptionPane;


/**
 * @author sergiohgp
 *
 */
public class BobHomeComputerShopV2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Declare variables
		double sales, comission, advancePay, totalPay, rate;
		int anwser;
		DecimalFormat formatter = new DecimalFormat("$#00.00");
		DecimalFormat dollar = new DecimalFormat("$#,##0.00");
		DecimalFormat percent = new DecimalFormat("#0%");
		
		// Get the input
		//System.out.println("Enter your sales for the month: ");
		//Scanner keyboard = new Scanner(System.in);
		do
		{
			sales = Double.parseDouble(JOptionPane.showInputDialog("Enter your sales for the month: "));
			//advancePay = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter your advance pay this month: "));
			
			
			//		System.out.println("Enter your advance pay this month: ");
			//		advancePay = keyboard.nextDouble();
			
			// Defensive programming
			do {
				advancePay = Double.parseDouble(JOptionPane.showInputDialog("Enter your advance pay this month: "));
				if (advancePay > 1500)
					JOptionPane.showMessageDialog(null, "The maximum amount of advance pay is " + dollar.format(1500) + ". Try again.");
				
			} while(advancePay > 1500);
			
			// Calculation
			
			if (sales >= 0 && sales < 10000) { 
				comission = sales * 0.05;
				rate = 0.05;
			}
			else if (sales >= 10000 && sales <=14999) {
				comission = sales * 0.1;
				rate = 0.1;
			}
			else if (sales >= 15000 && sales <= 17999) {
				comission = sales * 0.12;
				rate = 0.12;
			}
			else if (sales >= 18000 && sales <= 21999) {
				comission = sales * 0.15;
				rate = 0.15;
			}
			else {
				comission = sales * 0.16;
				rate = 0.16;
			}
			
			totalPay = sales + comission - advancePay;
			
			
			
			// Output
			
			if (totalPay < 0)
				JOptionPane.showMessageDialog(null, ("You sold " + dollar.format(sales) + 
						", so your commision is " + percent.format(rate) + 
						". You got an advance payment of " + dollar.format(advancePay) + 
						", so you have a debit of " + dollar.format(totalPay)));
				//System.out.println("You have a debit of $" + totalPay);
			else
				JOptionPane.showMessageDialog(null, ("You sold " + dollar.format(sales) + 
						", so your commision is " + percent.format(rate) + 
						". You got an advance payment of " + dollar.format(advancePay) + 
						", so you will receive " + dollar.format(totalPay)));
				//System.out.println("You will receive $" + totalPay);
			anwser = Integer.parseInt(JOptionPane.showInputDialog("Do you want to calculate again? (type 1 for yes and 2 for no): "));
		} while (anwser == 1);

	}

}
