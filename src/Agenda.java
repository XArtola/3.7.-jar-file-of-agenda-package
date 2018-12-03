
/**
 * 
 */
import java.util.ArrayList;

/**
 * @author ik013043z1
 *
 */
public class Agenda {

	/**
	 * @param args
	 */

	private ArrayList<Person> contacts = new ArrayList<Person>();
	private ArrayList<String> numbers = new ArrayList<String>();
	private ArrayList<String> addresses = new ArrayList<String>();

	private int findIndex(String toFind) {

		boolean notFound = true;

		int cnt = 0;
		int index = 0;

		while (notFound) {

			if (contacts.get(cnt).getName().matches(toFind)) {

				index = cnt;

				notFound = false;
			}
		}
		return index;
	}

	public void setNUmber(String number) {

	}

	public void setContact(Person contact, String number, String address) {

		contacts.add(contact);
		numbers.add(number);
		addresses.add(address);

	}

	public String getContact(String name) {

		return contacts.get(findIndex(name)).toString() + "Number: " + numbers.get(findIndex(name)) + "Address: "
				+ addresses.get(findIndex(name));

	}

	/**
	 * @author ik013043z1 This method will delete a contact entering a the name of
	 *         it
	 * @param name The name of the contact we want to delete
	 */

	public void deleteContact(String name) {

		contacts.remove(findIndex(name));
		numbers.remove(findIndex(name));
		addresses.remove(findIndex(name));

	}

	/**
	 * @author ik013043z1
	 * 
	 *         This method modifies the information of the user
	 * 
	 * @param contactName The name of the contact we want to modify
	 * @param toModify    the kind of information the user wants to change
	 * @param newData     the new information the user wants to save
	 */

	public void modifyInfo(String contactName, String toModify, String newData) {

		switch (toModify) {

		case "name":

			contacts.get(findIndex(contactName)).setName(newData);
			break;

		case "age":

			contacts.get(findIndex(contactName)).setAge(Integer.parseInt(newData));
			break;

		case "weight":

			contacts.get(findIndex(contactName)).setWeight(Integer.parseInt(newData));
			break;

		case "dni":

			contacts.get(findIndex(contactName)).setDni(newData);
			break;

		case "height":

			contacts.get(findIndex(contactName)).setHeight(Integer.parseInt(newData));
			;
			break;

		case "number":

			int position = findIndex(contactName);

			numbers.remove(findIndex(contactName));
			numbers.add(position, newData);
			break;

		case "address":

			int position2 = findIndex(contactName);

			addresses.remove(findIndex(contactName));
			addresses.add(position2, newData);
			break;

		}
	}

}
