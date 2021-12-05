package com.bridgeit;

import java.util.Scanner;

public class AddressBookMain {
	static int input;

	public static void main(String[] args) {
		
		System.out.println("Welcome to address book program");

		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the option you want :\n1. Add Contact\n2. View Contact\n3. Exit");
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
				}
			}while(input != 3);
	}

	}


