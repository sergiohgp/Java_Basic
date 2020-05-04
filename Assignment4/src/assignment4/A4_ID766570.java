/**
 * 
 */
package assignment4;

import javax.swing.JOptionPane;

//1. Create a program called “A4-ID#” of your choice you must use the following in one program.
//Bob has been promoted to a new role in his company. This role requires that Bob been on a strict schedule
//
//Create a program that will help Bob to track his meetings based upon the day of the week. 
//
//When Bob enters the day of the week it will display a meeting time slot.
//
//Monday: 8-10am Tuesday 2-4pm Wednesday: 1-3pm Thursday: no meeting Friday: 8to10am then 5 to 6pm
//
//a.	You must use if else-if else in the second method 
//b.	You must use switch case in the third method 
//c. 	- 
//d. 	All results must be passed onto the last method for the ouput to be displayed
//e.	All inputs must be through dialog boxes; all output must be through show Message dialog box.
//f.	Print your names by using a method
//g.	Take one snip of your output
//h.	Upload your one snip and the “A4-ID#”.java file

/**
 * This program is to keep Bob aware of his schedule.
 * It will ask the user to enter a day of the week and it will show the meetings slots for that day. 
 * If the entered day is wrong it will display an error and will ask to enter again.
 * 
 * @author Sergio Pereira
 * @version 1.0
 * @since   2020-03-01
 */

public class A4_ID766570 {

	/**
	 * The main method will call all the other methods to run the program
	 * @param args 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String weekDay, dayMeeting, anwser;
		
		printer("Welcome to the schedule program, Bob!");
		
		do {
			weekDay = inputDWeekDay("Please enter the day you want to check yours meetings:");
			
			dayMeeting = possibleMeetings(weekDay);
			
			schedule(weekDay,  dayMeeting);
			
			anwser = JOptionPane.showInputDialog("Do you want to check another day? (yes or no)");
			
		} while(anwser.equalsIgnoreCase("yes"));
		
		printAuthorName();
	}
	
	/**
	 * This is a void method to print on the screen
	 * a the result of the meetings on the specified
	 * day of the week.
	 * 
	 * @param weekDay This is the day of the week.
	 * @param dayMeetings This are the meeting slots.
	 */
	public static void schedule(String weekDay, String dayMeeting) {
		JOptionPane.showMessageDialog(null, "Schedule on \n"
				 + weekDay.toLowerCase() + ": " + dayMeeting);
	}
	
	/**
	 * This method is to get the slots of the meeting
	 * according to the day of the week.
	 * 
	 * @param weekDay Day of the week to pass into the method.
	 * @return String return the slots of meetings.
	 */
	public static String possibleMeetings(String weekDay) {
		String scheduled = "";
		switch (weekDay.toLowerCase()) 
		{
			case "monday":
				scheduled = "8 to 10 am";
				break;
			case "tuesday":
				scheduled = "2 to 4 pm";
				break;
			case "wednesday":
				scheduled = "1 to 3 pm";
				break;
			case "thursday":
				scheduled = "No meeting";
				break;
			case "friday":
				scheduled = "8 to 10 am then 5 to 6 pm";
				break;
		}
		return scheduled;
	}
	
	/**
	 * This is a method that take the input of a day of the week.
	 * 
	 * @param message This is to pass the message to print on the screen.
	 * @return int This return a number greater than 0.
	 */
	public static String inputDWeekDay(String message) {
		
		String inputDay;
		do {
			inputDay = "";
			
			inputDay = JOptionPane.showInputDialog(message);

			if (!validateWeekDay(inputDay)) {
				printer("Please, enter a week day!");
			}
			
		} while (!validateWeekDay(inputDay)); 
		
		return inputDay;
	}
	
	/**
	 * This is a method is to check is the input from the user 
	 * is a week day or not.
	 * 
	 * @param day This is the String passed to be checked.
	 * @return boolean This return a boolean checking if it is a weekday.
	 */
	public static boolean validateWeekDay(String day) {
		boolean weekDay;
		
		if ( day.equalsIgnoreCase("monday") ) 
			weekDay = true;
		else if ( day.equalsIgnoreCase("tuesday") ) 
			weekDay = true;
		else if ( day.equalsIgnoreCase("wednesday") ) 
			weekDay = true;
		else if ( day.equalsIgnoreCase("thursday") ) 
			weekDay = true;
		else if ( day.equalsIgnoreCase("friday") ) 
			weekDay = true;
		else
			weekDay = false;
			
		return weekDay;
	}
	
	/**
	 * This method prints the authors' name.
	 */
	public static void printAuthorName(){
		JOptionPane.showMessageDialog(null, "Program made by Sergio Pereira. \n"
				+ "Thanks for using it.");	
	}
	
	/**
	 * This is a void method to display the message passed as an argument
	 * 
	 * @param message This is the string to print
	 */
	public static void printer(String message) {
		JOptionPane.showMessageDialog(null, message);
	}

}
