package com.bridgeit;

import java.util.Scanner;

public class AddressBook {
	static int input;

	
		
private static AddressBook instance;
	
	private AddressBook() {}
	
	public static AddressBook getInstance() {
		if(instance == null) {
			instance = new AddressBook();
		}
		return instance;
	}
	
	public void addressBookOperations() {

		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the option you want :\n1. Add Contact\n2. View Contact\n3. Edit Contact\n4. Remove Contact\n5. Exit");
			input = sc.nextInt();
		
		
				switch (input) {
					case 1: {
						ContactFunction contactOperations = ContactFunction.getInstance();
						contactOperations.addNewContact();
						break;
					}
		
					case 2: {
						ContactFunction contactOperations = ContactFunction.getInstance();
						contactOperations.printAllContacts();
						break;
					}
					case 3: {
						ContactFunction contactOperations = ContactFunction.getInstance();
						contactOperations.editContact();
						break;
					}
					case 4: {
						ContactFunction contactOperations = ContactFunction.getInstance();
						contactOperations.removeContactByName();
						break;
					}
				}
			}while(input != 5);
	}

	}


