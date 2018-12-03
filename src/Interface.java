/**
 * 
 */
import java.util.Scanner;
/**
 * @author ik013043z1
 *
 */
public class Interface {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		boolean finish = false;
		
		int option = 0;
		
		while(!finish) {
			
			System.out.println("Hello, welcome to the digital agenda. This is what you are able to do:"
					+"\n\t 1- See all your contacts"
					+"\n\t 2- See an specific contact"
					+"\n\t 3- How many contacts do i have?"
					+"\n\t 4- Delete a contact"
					+"\n\t 5- Delete all the contacts"
					+"\n\t 6- Modify a contact"
					+"\n\t 7- Add a new contact"
					+"\n Choose an option by its number [1-7]");
			
			option = sc.nextInt();
			
			
			
		}

	}

}
