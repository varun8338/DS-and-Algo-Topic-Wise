package main.java;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ContactManagerTest {

	@BeforeAll
	public static void setupAll() {
		System.out.println("Should print before all tests");
	}
	
	
	@Test
	public void shouldCreateContact() {
		ContactManager cm=new ContactManager();
		cm.addContact("John", "Doe", "0123456789");
		Assertions.assertFalse(cm.getAllContacts().isEmpty());
		Assertions.assertEquals(1, cm.getAllContacts().size());
	}
	
	@Test
	@DisplayName("Should not create contact list when first name is null")
	public void shouldThrowRuntimeExceptionWhenFirstNameIsNull() {
		ContactManager cm=new ContactManager();
		Assertions.assertThrows(RuntimeException.class, () -> {
			cm.addContact(null, "Doe", "0123456789");
		});
	}
	
	@Test
	@DisplayName("Should not create contact when last name is null")
	public void shouldThrowRuntimeExceptionWhenLastNameIsNull() {
		ContactManager cm=new ContactManager();
		Assertions.assertThrows(RuntimeException.class, () -> {
			cm.addContact("John", null, "0123456789");
		});
	}
	
	@Test
	@DisplayName("Should not create contact when phone number is null")
	public void shouldThrowRuntimeExceptionWhenPhoneNumberIsNull() {
		ContactManager cm=new ContactManager();
		Assertions.assertThrows(RuntimeException.class, () -> {
			cm.addContact("John", "Doe", null);
		});
	}

}
