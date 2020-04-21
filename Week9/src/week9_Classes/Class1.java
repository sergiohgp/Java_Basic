/**
 * 
 */
package week9_Classes;

/**
 * @author sergiohgp
 *
 */
public class Class1 extends Class2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Create two instance methods, print your name
		// 1st void
		// 2nd teturn sum of two numbers, two param
		
		// 1#
		// Created an object to access the Class2
		Class2 one = new Class2();
		
		// Assign values
		one.name = "Sergio Pereira";
		one.age = 28;
		one.money = 0.0;
		one.grade = 'A';

		// declare new variables
		String a = one.name;
		int b = one.age;
		double c = one.money;
		char d = one.grade;
		
		// print
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		// Call methods
		one.method1();
		int number = one.method2(one.age, one.age);
		
		System.out.println(number);
		
		Class2.method1();
		Class2.method2(2, 2);
	}

}
