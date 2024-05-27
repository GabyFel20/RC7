package com.poo;

import control.LybrarySystem;
import exceptions.BookNotAvailableException;
import exceptions.UserNotFoundException;
import models.Book;
import models.User;

public class Poo {

	public static void main(String[] args) throws UserNotFoundException {
		LybrarySystem system = new LybrarySystem();
		
		Book book1 = new Book("Los Pilares de la Tierra","Ken Follet");
		Book book2 = new Book("Cartas al rey de la Cabina", "Pascetti");
		/*
		book1.displayInfo();
		book2.displayInfo();
		*/
		
		User user1 = new User("GabyF",1);
		User user2 = new User("Mariana", 2);
		
		
		System.out.println(book1);
		System.out.println(user1);
		
		system.addBook(book1);
		system.addBook(book2);
		system.addUser(user1);
		
		user1.listRentedBooks();
		


	}

}
