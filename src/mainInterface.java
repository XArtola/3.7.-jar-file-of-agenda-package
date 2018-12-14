/**
 * 
 */
import com.zubiri.agenda.*;
import java.util.Scanner;
/**
 * @author ik013043z1
 *
 */
public class mainInterface {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		boolean finish = false;

		Agenda myAgenda = new Agenda();

		int option = 0;

		while (!finish) {

			System.out.println("Hello, welcome to the digital agenda. This is what you are able to do:"
					+ "\n\t 1- See an specific contact" + "\n\t 2- How many contacts do i have?"
					+ "\n\t 3- Delete a contact" + "\n\t 4- Modify a contact" + "\n\t 5- Add a new contact"
					+ "\n\t 6- Delete all the information" + "\n\t 7- Close the agenda"
					+ "\n Choose an option by its number [1-7]");

			option = sc.nextInt();
			sc.nextLine();

			switch (option) {

			case 1:

				System.out.println("Enter the name of the contact you want to see:");
				System.out.println(myAgenda.readContact(sc.next()));
				break;

			case 2:

				System.out.println("You have " + myAgenda.getKontaktuak().size() + " contacts.\n");
				break;
				

			case 3:

				System.out.println("Enter the name of the contact you want to delete");
				String toDelete = sc.next();
				sc.nextLine();
				System.out.println("Are you sure you want to delete it? [y/n]");
				switch (sc.next().charAt(0)) {

				case 'y':

					myAgenda.deleteContact(toDelete);

					break;

				default:

					System.out.println("The contact has not been deleted");
					break;

				}

				break;

			case 4:

				 System.out.println("Enter the info you want to change in the next order contact name, variable of the contact you want to change, new value"
				 		+ "\n Ex: Xabier dni 99999999");
				 myAgenda.modifyContact(sc.next(), sc.next(), sc.next());
				 break;
				 

			case 5:

				System.out.println("Enter the new contact info in the next way: Name Number Address"
						+ "\n Ex. Xabier 99999999 Lasarte");

				String[] collectedData = sc.nextLine().split(" ");
				Person person1 = new Person(collectedData[0]);
				Contact contact1 = new Contact(person1, Integer.parseInt(collectedData[1]), collectedData[2]);

				myAgenda.addContact(contact1);
				break;

			case 6:

				//myAgenda.deleteAll();
				break;
				
				//I don´t have a method to delete all clear the agenda
				//I don´t have a method to delete contacts one by one

			case 7:

				finish = true;
				break;

			default:

				System.out.println("This is not a correct option please enter another one. [1-7]");

				option = sc.nextInt();

			}

		}

	}

}