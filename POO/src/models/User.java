package models;

import java.util.ArrayList;

public class User {
	private String username;
	private int id;
	private ArrayList<Book> rentedBooks= new ArrayList<>();
	
	public User(String username, int id) {
		super();
		this.username = username;
		this.id = id;
	}
	

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ArrayList<Book> getRentedBooks() {
		return rentedBooks;
	}

	public void setRentedBooks(ArrayList<Book> rentedBooks) {
		this.rentedBooks = rentedBooks;
	}


	public void listRentedBooks() {
		System.out.println(username + " has rented the following books: ");
		for(Book book : rentedBooks) {
			System.out.println(book.getTitle());
		}
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", id=" + id + "]";
	}

	
}
