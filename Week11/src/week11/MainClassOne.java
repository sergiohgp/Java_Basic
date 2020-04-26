/**
 * 
 */
package week11;

/**
 * @author sergiohgp
 *
 */
public class MainClassOne {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassOne obj1 = new ClassOne();
		
		obj1.name = "Sergio Pereira";
		obj1.age = 28;
		obj1.money = 0.0;
		obj1.grade = 'A';
		obj1.married = true;
		
		String name = obj1.name;
		int age = obj1.age;
		double money = obj1.money;
		char grade = obj1.grade;
		boolean married = obj1.married;
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(money);
		System.out.println(grade);
		System.out.println(married);
		
		

	}

}
