package bca.jain.jdbc;

public class Person {
	long PersonID;
    String LastName;
    String FirstName;
    String Address;
    String City;
    
    
    
	public Person(long personID, String lastName, String firstName, String address, String city) {
		super();
		PersonID = personID;
		LastName = lastName;
		FirstName = firstName;
		Address = address;
		City = city;
	}
	
	public Person() {
		
	}
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
    	String str = String.format("Person ID: %d\nFirst Name: %s\nLast Name: %s\nAddress: %s\nCity: %s\n", this.getPersonID(), this.getFirstName(), this.getLastName(), this.getAddress(), this.getCity()) ;
    	return str;
    }

}
