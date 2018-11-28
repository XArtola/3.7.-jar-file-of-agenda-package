/**
 * 
 */

/**
 * @author ik013043z1
 *
 */
public class Person {

	private String name = "";
	private int age = 0;
	private int weight = 0;
	private String dni = "";
private int height = 0;

	public Person(String name, int age, int weight, int height, String dni) {

		this.name = name;
		this.age = age;
		this.weight = weight;
		this.dni = dni;

	}

	public Person(String name, int age, int weight, int height) {

		this.name = name;
		this.age = age;
		this.weight = weight;
	}

	public Person(int age, int weight, int height) {

		this.age = age;
		this.weight = weight;

	}
	
	public void setName(String name) {

		this.name = name;

	}

	public String getName() {

		return name;

	}

	public void setAge(int age) {

		if (age > 0 && age < 130) {

			this.age = age;

		}

	}

	public int getAge() {

		return age;

	}

	public void setWeight(int weight) {

		this.weight = weight;

	}

	public int getweight() {

		return weight;

	}

	public void setDni(String dni) {

		if (dni.length() == 9) {

			this.dni = dni;

		}

	}
	
	public String getDni() {

		return dni;

	}
	
	public void setheight(int height) {
		
		if (height > 30 && height < 220) {

		this.height = height;
		}

	}

	public int getheight() {

		return weight;

	}
	
	/**
	 * This method will return true if the weight is ideal and false if it is not.
	 * To calculate this i use the formula weight(Kg)/height^2(m) were each value
	 * between 18 and 24 will be considered a good one
	 **/
	public boolean idealWeight(int weight) {

		if (18 < weight / (height / 100) ^ 2 < 24)
			return true;
		else
			return false;

	}
	
	/** This method will print all the info about the person object**/
	public String  toString() {
		
		return "Name: " +name+ " Age: "+ Integer.toString(age) + " Weight: " + Integer.toString(weight)+ " DNI: " +dni+ " Height: " + Integer.toString(height);
		
	}
	
	/**
	 **/
	
	public String toStringData() {
		
		if (dni.matches("")) {
			
			for(int i =0; i<7; i++) {
				
				this.dni= dni+Integer.toString(Math.random() * (9 - 0) + 0)
				
			}
			
		}
		
	}
	 

}
