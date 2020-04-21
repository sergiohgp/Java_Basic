/**
 * 
 */
package week9GetSet;

/**
 * @author sergiohgp
 *
 */
public class Class1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Class2 Obj1 = new Class2();
		
		// Output
		Obj1.setName("Sergio Pereira");
		Obj1.setAge(28);
		Obj1.setMoney(0.0);
		Obj1.setGrade('A');
		
		System.out.println(Obj1.getName());
		System.out.println(Obj1.getAge());
		System.out.println(Obj1.getMoney());
		System.out.println(Obj1.getGrade());
		

	}

}
