package bca.gui;

public class Person {
	private long PersonID;
	private String LastName;
	private String FirstName;
	private String Address;
	private String City;
	public long getPersonID() {
		return PersonID;
	}
	public void setPersonID(long personID) {
		PersonID = personID;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	
	public String toString() {
		String str = String.format("[%d, %s, %s, %s, %s]", this.getPersonID(), this.getLastName(), this.getFirstName(), this.getAddress(), this.getCity());
		return str;
	}
}
