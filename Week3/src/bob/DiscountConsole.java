package bob;
import java.util.Scanner;


/**
 * @author sergiohgp
 *
 */
public class DiscountConsole {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// This program will give a discount given 20%
		// Declare values
		double price;
		double discountPercent = 0.15;
		double discount;
		double discountPrice;
		 
		// input
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the price: ");
		price = in.nextInt(); // Read the input as an integer
		
		// Calculation
		discount = price * discountPercent;
		discountPrice = price - discount;
		 
		// Output
		System.out.println("The price is $"+ price + ", you will receive a discount of $" + discount+
				" and the total price after discount is $" + discountPrice);

	}

}
