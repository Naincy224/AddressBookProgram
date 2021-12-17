package com.bridgeit;

import java.util.ArrayList;
import java.util.Scanner;

public class MultipleAddresssBook {
	
	static int input;
	
	public static void main(String[] args) {
		ContactFunction contactFunction = ContactFunction.getInstance();
		AddressBook addressBook = AddressBook.getInstance();
		ContactDetail contactDetail = ContactDetail.getInstance();
			do {
				Scanner sc = new Scanner(System.in);
				System.out.println("What do you want to do:\n1. Create AddressBook\n2. View AddressBook\n3. Exit");
				input = sc.nextInt();
				switch (input) {
				case 1: {
					contactDetail.contactList = new ArrayList<>();
					Scanner sc1 = new Scanner(System.in);
					System.out.println("Enter the Address Book Name you want to create");
					String addressBookName = sc1.nextLine();
					addressBook.addressBookOperations();
					contactDetail.addressBookMap.put(addressBookName, contactFunction.getList());
					break;
				}
			
				case 2: {
					System.out.println(contactDetail.addressBookMap.keySet());
					Scanner sc2 = new Scanner(System.in);
					System.out.println("Enter the Address Book Name you want to view");
					String addressBookName = sc2.nextLine();
					for (int i = 0; i < contactDetail.addressBookMap.get(addressBookName).size(); i++) {
						System.out.println(contactDetail.addressBookMap.get(addressBookName).get(i));
					}
					break;
				}
				}
		}while(input != 3);
	}

}
