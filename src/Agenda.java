
/**
 * 
 */
import java.util.ArrayList;

/**
 * @author ik013043z1
 *
 */
public class Agenda {


	private ArrayList<Contact> contacts = new ArrayList<Contact>();
	
	private int findIndex(String toFind) {

		boolean notFound = true;

		int cnt = 0;
		int index = 0;

			while ((notFound) && (cnt < contacts.size())) {

				if (contacts.get(cnt).getPerson().getName().matches(toFind)) {

					index = cnt;

					notFound = false;
				}

				cnt++;
			}
			
			if (notFound)
				
				index = -1;
	
		return index;
	}

	public void setContacts(ArrayList<Contact> contacts) {

		this.contacts = contacts;

	}
	
	public ArrayList<Contact> getContacts() {

		return contacts;

	}
	
	
	/**@author ik013043z1
	 * 
	 * This method returns a specific contact of the agenda
	 * 
	 * @param index the index of the agenda
	 * @return A Contact type object that matches with the entered name
	 */

	public Contact getContact(int index) {
		
		if(index < 0) {
		 
		return contacts.get(index);
		
		}

	}
	
	/**@author ik013043z1
	 * 
	 * @param name
	 * @return An int with the value of the index
	 */
	
	
	public int findContact(String name) {
		
		return findIndex(name);
		
	
	}
	
	
	/**@author ik013043z1
	 * 
	 * This method will add a new contact to the agenda
	 * 
	 * @param contact1 A Contact type object that will be added to the ArrayList
	 */
	
	public void setContact(Contact contact1) {

		
		this.contacts.add(contact1);
		
	}

	/**
	 * @author ik013043z1 This method will delete a contact entering a the name of
	 *         it
	 * @param name The name of the contact we want to delete
	 */

	public void deleteContact(String name) {

		contacts.remove(findIndex(name));

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

	
	public void modifyContact(Contact _contact, int _index) {

	}
	
	public void modifyContact(Contact _contact) {

	}

	/*
	public void modifyInfo(String contactName, String toModify, String newData) {
		
		toModify = toModify.trim();

		switch (toModify) {

		case "name":

			contacts.get(findIndex(contactName)).getPerson().setName(newData);
			break;

		case "age":

			contacts.get(findIndex(contactName)).getPerson().setAge(Integer.parseInt(newData));
			break;

		case "weight":

			contacts.get(findIndex(contactName)).getPerson().setWeight(Integer.parseInt(newData));
			break;

		case "dni":

			contacts.get(findIndex(contactName)).getPerson().setDni(newData);
			break;

		case "height":

			contacts.get(findIndex(contactName)).getPerson().setHeight(Integer.parseInt(newData));
			
			break;

		case "number":

			contacts.get(findIndex(contactName)).setNumber(newData);

			
			break;

		case "address":

			contacts.get(findIndex(contactName)).setAddress(newData);
			
			break;

		}
	}
	*/
	
	/**@author ik013043z1
	 * 
	 * This method returns the number of contacts
	 * 
	 * @return An int  type variable, the number of contacts
	 */
	
	public int agendaSize() {
		
		return contacts.size();
		
	}
	
	/**@author ik013043z1
	 * 
	 * This method will delete all the information stored in the ArrayList contacts
	 */
	
	public void deleteAll() {
		
		contacts.clear();
		
	}

}
