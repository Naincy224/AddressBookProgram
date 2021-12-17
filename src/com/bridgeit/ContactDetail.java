package com.bridgeit;


	import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

	public class ContactDetail {
		private static ContactDetail instance;
		
		private ContactDetail() {}
		
		public static ContactDetail getInstance() {
			if(instance == null) {
				instance = new ContactDetail();
			}
			return instance;
		}
		
		List<Contact> contactList;
		Map<String, List> addressBookMap = new HashMap<>();
		

}
