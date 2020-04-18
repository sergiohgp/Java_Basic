/**
 * 
 */
package bob;

/**
 * @author sergiohgp
 *
 */
public class DiscountCalculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// This program will give a discount given 20%
		// Declare values
		 double price = 2500;
		 double discountPercent = 0.20;
		 double discount = price * discountPercent;
		 double discountPrice = price - discount;
		 
		 // Output
		 System.out.println("The final price is $"+ price+ " you will receive a discount of $" + discount+
				 " and the total price after discount is $" + discountPrice);

	}

}

