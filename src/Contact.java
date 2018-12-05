/**
 * 
 */

/**
 * @author ik013043z1
			

			
	 *
 */
public class Contact{

		
		private Person person1= new Person("");
		private String number = "";
		private String address = "";
		
		
		public Contact(Person person1, String number, String address) {
			
			this.person1 = person1;
			this.number = number;
			this.address = address;
			
		}
		
		public void setPerson(Person person1) {
			
			this.person1 = person1;
	}
		
		public Person getPerson() {
			
			return person1;
				
		}
		
		public void setNumber(String number) {
			
			this.number = number;
			
		}
		
		public String getNumber() {
			
			return number;
			
		}
		
		public void setAddress(String address) {
			
			this.address = address;
			
		}
		
		public String getAddress() {
			
			return address;
			
		}
		
		/**@author ik013043z1
		 * 
		 * This method converts all the info of a contact to a string
		 * 
		 * @return String 
		 */
		
		public String contactToString() {
			
			return person1.toString() + " Number: " + number + " Address: " + address;
			
		}
		
		
		
		
}
