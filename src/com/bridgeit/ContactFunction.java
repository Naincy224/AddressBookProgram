package com.bridgeit;

import java.util.List;
import java.util.Scanner;

public class ContactFunction {

	
private static ContactFunction instance;
	Scanner sc = new Scanner(System.in);
	
	private ContactFunction() {}
	
	public static ContactFunction getInstance() {
		if(instance == null) {
			instance = new ContactFunction();
		}
		return instance;
	}
	
	ContactDetail contactDetail =  ContactDetail.getInstance();
	
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
	
	public Contact editContact() {
		System.out.println("Enter first name of contact to Edit");
		String name = sc.nextLine();
		for(Contact contact :contactDetail.contactList) {
			if(contact.firstName.equals(name)) {
				System.out.println(contact);
				System.out.println("Enter what you want to edit \n1.Firstname \n2.Lastname"
						+ " \n3.Address \n4.City \n5.State \n6.Email \n7.Zip \n8.Phone");
				int choice = sc.nextInt();
				
				switch (choice) {
				case 1:
						System.out.println("Enter the new Firstname");
						String newFirstName = sc.next();
						contact.firstName = newFirstName;
					break;
				
				case 2:
					System.out.println("Enter the new Lastname");
					String newLastName = sc.next();
					contact.lastName = newLastName;	
					break;
					
				case 3:
					System.out.println("Enter the new Address");
					String newAddress = sc.next();
					contact.address = newAddress;
					break;
					
				case 4:
					System.out.println("Enter the new City");
					String newCity = sc.next();
					contact.city = newCity;
					break;
					
				case 5:
					System.out.println("Enter the new State");
					String newState = sc.next();
					contact.state = newState;
					break;
					
				case 6:
					System.out.println("Enter the new Email");
					String newEmail = sc.next();
					contact.email = newEmail;
					break;
					
				case 7:
					System.out.println("Enter the new Zip");
					String newZip = sc.next();
					contact.zip = newZip;
					break;
					
				case 8:
					System.out.println("Enter the new Phone");
					String newPhone = sc.next();
					contact.mobile = newPhone;
					break;

				default:
					break;
				}
			return null;	
			}
		}
		return null;
	}
	
	public Contact removeContactByName() {
		System.out.println("Enter Firstname of Contact to delete");
		String name = sc.nextLine();
			for(Contact contacts :contactDetail.contactList) {
				if(contacts.firstName.equals(name)) {
					contactDetail.contactList.remove(contacts);
					return null;
				}
			}
			System.out.println("Contact Not found");
			return null;
	}
	
	public boolean isDuplicate(String firstName, String lastName) {
		boolean isDuplicate = false;
		for (int i = 0; i < contactDetail.contactList.size(); i++) {
			if(contactDetail.contactList.get(i).firstName.equals(firstName)&&contactDetail.contactList.get(i).lastName.equals(lastName)) {
				isDuplicate = true;
			}
		}
		return isDuplicate;
	}

}

