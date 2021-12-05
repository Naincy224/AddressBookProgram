package com.bridgeit;

import java.util.List;
import java.util.Scanner;

public class ContactFunction {

private static ContactFunction instance;
	
	private ContactFunction() {}
	
	public static ContactFunction getInstance() {
		if(instance == null) {
			instance = new ContactFunction();
		}
		return instance;
	}
	
	ContactDetail contactDetail = new ContactDetail();
	
	public void addNewContact() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the details to Add :");
		System.out.println("Enter Firstname");
		String firstName = sc.nextLine();
		System.out.println("Enter Lastname");
		String lastName = sc.nextLine();
		System.out.println("Enter Address");
		String address = sc.nextLine();
		System.out.println("Enter City");
		String city = sc.nextLine();
		System.out.println("Enter State");
		String state = sc.nextLine();
		System.out.println("Enter Email");
		String email = sc.nextLine();
		System.out.println("Enter Zip");
		String zip = sc.nextLine();
		System.out.println("Enter Phone");
		String phone = sc.nextLine();
	
		Contact contacts = new Contact(firstName, lastName, address, city, state, email, zip, phone);
		contactDetail.contactList.add(contacts);
	}
	
	public List<Contact> getList() {
		return contactDetail.contactList;
	}
	
	public void printAllContacts() {
		for (int i = 0; i < contactDetail.contactList.size(); i++) {
			System.out.println("Contact" + (i+1) + " " + contactDetail.contactList.get(i));		
		
		}
	}
}
