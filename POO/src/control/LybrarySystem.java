package control;

import java.util.ArrayList;

import exceptions.BookNotAvailableException;
import exceptions.UserNotFoundException;
import models.Book;
import models.User;

public class LybrarySystem {
	private ArrayList<Book> books = new ArrayList<>();
	private ArrayList<User> users = new ArrayList<>();
	
	
	public ArrayList<Book> getBooks() {
		return books;
	}

	public void setBooks(ArrayList<Book> books) {
		this.books = books;
	}

	public ArrayList<User> getUsers() {
		return users;
	}

	public void setUsers(ArrayList<User> users) {
		this.users = users;
	}

	public void addUser(User user) {
		users.add(user);
		System.out.println(user.getUsername() + " added to the DB");
		
	}
	
	public void addBook(Book book) {
		books.add(book);
		System.out.println(book.getTitle() + "added to the collection");
	}
	
	
	
	public void rentBook(Book book, User user) throws BookNotAvailableException, UserNotFoundException {
		User loanerUser = findUser(user.getId());
		book.rentToUser(loanerUser);
		
	}
	
	public User findUser(Integer userid) throws UserNotFoundException {
		for(User user: users) {
			if(userid.equals(user.getId())) {
				return user;
				
			}
		}
		
		throw new UserNotFoundException("User with id: "+ userid + "is not in our db");
	}
	
	
	
	
}
