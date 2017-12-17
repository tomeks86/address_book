package com.tseidler.addressbook;

import com.tseidler.addressbook.domain.AddressBook;
import com.tseidler.addressbook.domain.User;
import com.tseidler.addressbook.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AddressbookApplication implements CommandLineRunner {
	@Autowired
    UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(AddressbookApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {

	    User stefan_beton = new User("Stefan", "Beton", "Jesionowa 5", "Bydgoszcz", "56-323", "5325235235");
	    userService.addUser(stefan_beton);
	    User franek_smietana = new User("Franek", "Śmietana", "Bukowa 10", "Radom", "66-321", "234234232");
        userService.addUser(franek_smietana);
        User jerzy_zyleta = new User("Jerzy", "Żyleta", "Bukowa 15", "Radom", "66-321", "1561384681");
        userService.addUser(jerzy_zyleta);

        AddressBook addressBook = new AddressBook();
        addressBook.setOwner(stefan_beton);
    }
}
