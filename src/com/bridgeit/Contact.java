package com.bridgeit;

public class Contact {

	String firstName;
	String lastName;
	String address;
	String city;
	String state;
	String zip;
	String mobile;
	String email;

	public Contact(String firstName, String lastName, String address, String city, String state, String zip,
			String mobile, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.mobile = mobile;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Contact [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", city=" + city
				+ ", state=" + state + ", zip=" + zip + ", mobile=" + mobile + ", email=" + email + "]";
	}
	
}
