
/**
 * 
 */
import java.util.ArrayList;
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

		Agenda myAgenda = new Agenda();

		int option = 0;

		while (!finish) {

			System.out.println("Hello, welcome to the digital agenda. This is what you are able to do:"
					+ "\n\t 1- See an specific contact" + "\n\t 2- How many contacts do i have?"
					+ "\n\t 3- Delete a contact" + "\n\t 4- Modify a contact" + "\n\t 5- Add a new contact"
					+ "\n\t 6- Close the agenda" + "\n Choose an option by its number [1-6]");

			option = sc.nextInt();
			sc.nextLine();

			switch (option) {

			case 1:

				System.out.println("Enter the name of the contact you want to see:");
				System.out.println(myAgenda.getContact(sc.next()));
				break;

			case 2:

				System.out.println("You have " + myAgenda.agendaSize() + " contacts.\n");
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

				System.out.println(
						"Enter the name of the contact you want to modify, the specific value you want to cahnge and the new value: \n Ex. Xabier name Xabi");
				myAgenda.modifyInfo(sc.next(), sc.next(), sc.next());
				sc.nextLine();
				break;

			case 5:

				System.out.println("Enter the new contact info in the next way: Name Number Address"
						+ "\n Ex. Xabier 99999999 Lasarte");

				String[] collectedData = sc.nextLine().split(" ");
				Person person1 = new Person(collectedData[0]);
				
				myAgenda.setContact(person1, collectedData[1], collectedData[2]);
				break;

			case 6:

				finish = true;
				break;

			default:

				System.out.println("This is not a correct option please enter another one. [1-6]");

				option = sc.nextInt();

			}

		}

	}

}
