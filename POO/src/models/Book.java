package models;

import exceptions.BookNotAvailableException;

public class Book {
	
	private String title;
	private String author;
	private boolean isAvailable;
	
	//Constructor
	 public Book(String title, String author){
		this.title=title;
		this.author=author;
		this.isAvailable=true;
	}
	
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	
	public void rentToUser(User user) throws BookNotAvailableException {
		if(isAvailable) {
			user.getRentedBooks().add(this);
			isAvailable = false;
			System.out.println(user.getUsername() + " rented: " + title);
			
		}else {
			throw new BookNotAvailableException("Book is currently not available");
			
		}
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + "]";
	}
	
	
	
	}


