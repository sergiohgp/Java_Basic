/**
 * 
 */
package assignment3;

import java.io.*;
import javax.swing.JOptionPane;
import java.util.Scanner;

//Assignment 3.
//1.	Create a program called “A3-ID#” of your choice you must use the following in one program.
//Create a program that will create a list of things, open it, add the numbers then print the numbers.
//
//a.	You must use five methods each method must do something different 
//b.	All inputs must be through dialog boxes; all output must be through show Message dialog box.
//c.	Create a file, the file must have a list of numbers, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100. 
//d.	Validate that the file name is correct after the user enters the name.
//e.	Your output from assignment 7 must be total of the numbers, avg of the numbers, print each number from the file.
//f.	Print your names by using a method
//g.	Take one snip for each output
//h.	Upload your snips and the “A3-ID#”.java file


/**
* This program will create a file (if it does not exists) with a list of numbers from 10
* to 100 with a step of 10. Then, it will ask to the user to enter the file name until it is correct. Then, it will read all the numbers,
* their sum and the average among them. Lastly, it will print the authors name and thank for using the program.
* 
* @author Sergio Pereira
* @version 1.0
* @since   2020-03-01
*/
public class A3_ID766570 {

	/**
	 * The main method will call all the other methods 
	 * in order to run the program correctly.
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		// Message to welcome the user
		printer("Welcome. This program will create a file with number in it and then will"
				+ "show these numbers and their sum and average. "); 
		String fileName = "numbers", anwser; // Variable to store the user input for the file 
		
		// If condition to verify if the file exists 
		if (!fileExists(fileName)) 
				createFile(fileName);
		
		// Do-while loop to validate and display the calculation
		do {
			String userFileName = validateInput(fileName); // Validates the user input for the file name
			
			// Asks the user to display the calculation
			anwser = JOptionPane.showInputDialog("Do you want to see the sum and average of the " + userFileName + " file? (yes or no)");
			if (anwser.equalsIgnoreCase("yes")) {
				readFile(userFileName);
			}
			anwser = JOptionPane.showInputDialog("Do you want to exit the program? (yes or no)");
			
		} while(anwser.equalsIgnoreCase("no")); // Loop to run the program 1 time and then asks if they want to keep running
		
		printAuthorName(); // Prints author's name
	}
	/**
	 * This method double checks if the file already exists
	 * @param filename Passes the file name
	 * @return returns a boolean true for exist and false for don't exist
	 */
	public static boolean fileExists(String fileName) throws IOException{
		boolean exists;
		
		File file = new File(fileName.toLowerCase() + ".txt");
		exists = file.exists();
				
			
		return exists;
		
	}
	
	/**
	 * This method creates a file and print the numbers in it
	 * @param fileName Passes the file name 
	 */
	public static void createFile(String fileName) throws IOException{
		PrintWriter file = new PrintWriter("numbers.txt");
		
		for(int i = 10; i <=100; i+=10) {
			file.println(i);
		}
		file.close();
		printer("The file was created successfuly!");
	}
	
	/**
	 * This method reads the file and displays the numbers and the calculations like sum and average
	 * @param fileName Passes the file name
	 */
	public static void readFile(String fileName) throws IOException{
		int number, sum = 0, counter = 0;	// initialize sum and counter in 0;
		String message;
		File nameOfFile = new File(fileName + ".txt");	// Instantiate the object File
		
		message = "File Content:\n";
		
		Scanner inFile = new Scanner(nameOfFile);
		do {
			if (inFile.hasNext()) {		// if the file has more numbers keep adding.
				number = inFile.nextInt();	// reading the next integer number from the file
				sum += number;			// adding the numbers into total
				counter++;				// counting the numbers
				message += number + "\n";	// adding numbers to the display message
			}
		} while (inFile.hasNext());
		inFile.close();
		
		message += "The total sum is " + sum + "\n";		// Adding the total sum to the display message
		message += "The average is " + getAverage(sum, counter) + "\n";	// adding the average to the display message
		
		printer(message);	 // print the message in JOptionPane
			
	}
	
	/**
	 * This method is used to input the name of the file from the user
	 * @return String Return the user input for the file name
	 */
	public static String inputFileName() {
		String fileName;
		fileName = JOptionPane.showInputDialog("Enter the file's name: ");
		return fileName;
	}
	
	/**
	 * This method is to calculate the average of the numbers in the file
	 * @param sum Is the sum of all numbers in the file
	 * @param counter Is the number of numbers that are in the file
	 * @return double Returns the average 
	 */
	public static double getAverage(double sum, double counter) {
		return sum/counter;
	}
	
	/**
	 * This method is used to print a message using JOptionPane class.
	 * @param message Passes the message to be displayed
	 */
	public static void printer(String message) {
		JOptionPane.showMessageDialog(null, message);
	}
	
	/**
	 * This method prints the authors' name and thanks the user.
	 */
	public static void printAuthorName() {
		String authorName = "Sergio Pereira";
		printer("Program created by " + authorName + ".\n" 
				+ "Thanks for using this program.");
	}

	/**
	 * This method validates the user input for the file name
	 * @param fileName Passes the file name
	 * @return String Returns the variable with the user input validated 
	 */
	public static String validateInput(String fileName) {
		String userFileName;
		do {
			userFileName = inputFileName();
			if(!userFileName.equalsIgnoreCase(fileName))
				printer("Incorrect! The file name is numbers. "
						+ "Please, try again.");
		} while (!userFileName.equals(fileName));
		printer("You are in " + userFileName + " now.");
		return userFileName;
	}
}
