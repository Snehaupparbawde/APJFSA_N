package java_programs;

public class Address {

	private String street;
	private String city;
	private String state;
	private String zipCode;

	// Constructor with default values
	public Address() {
		this("", "", "", "");
	}

	// Parameterized constructor
	public Address(String street, String city, String state, String zipCode) {
		this.street = street;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
	}

	// Getters and Setters
	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	// Method to print the full address
	public void displayAddress() {
		System.out.println("Address: " + street + ", " + city + ", " + state + " - " + zipCode);
	}

	public static void main(String[] args) {
		// Test the Address class
		Address address1 = new Address("123 Main St", "Springfield", "IL", "62701");
		address1.displayAddress();

		Address address2 = new Address();
		address2.setStreet("456 Elm St");
		address2.setCity("Chicago");
		address2.setState("IL");
		address2.setZipCode("60601");
		address2.displayAddress();
	}
}
    /* Output
       Address: 123 Main St, Springfield, IL - 62701
       Address: 456 Elm St, Chicago, IL - 60601 */
