package main.java;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ContactManager {
	Map<String, Contact> contactList = new ConcurrentHashMap<String, Contact>();

	public void addContact(String firstName, String lastName, String phoneNumber) {
		Contact contact = new Contact(firstName, lastName, phoneNumber);
		validateContact(contact);
		checkIfContactAlreadyExists(contact);
		contactList.put(generateKey(contact), contact);
	}
	
	public Collection<Contact> getAllContacts() { return contactList.values(); }

	private void checkIfContactAlreadyExists(Contact contact) {
		// TODO Auto-generated method stub
		if (contactList.containsKey(generateKey(contact)))
			throw new RuntimeException("Contact already exists");

	}

	private void validateContact(Contact contact) {
		// TODO Auto-generated method stub
		contact.validateFirstName();
		contact.validateLastName();
		contact.validatePhoneNumber();
	}

	private String generateKey(Contact contact) {
		return String.format("%s-%s", contact.getFirstName(), contact.getLastName());
	}
	
	public static void main(String[] args) {
		System.out.println(Math.ceil(7)/2);
	}
}
