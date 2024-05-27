package models;

import java.util.ArrayList;

public class regularUser extends User {
	private String LolRank;
	private ArrayList<User> contacts;
	
	public regularUser(String username, String email, String lolRank, ArrayList<User> contacts) {
		super(username, email);
		LolRank = lolRank;
		this.contacts = contacts;
	}
	
	public void addContacts(regularUser newContact) {
		this.getContacts().add(newContact);
		System.out.println("User: "+ this.getEmail() + "added: " + newContact.getUsername());
	}
	
	public void deleteContact(regularUser oldContact) {
		boolean isRemoved = this.getContacts().remove(oldContact);
		if (isRemoved)
		System.out.println("User: " + oldContact.getEmail() + "is no loger your contact");
	 else {
		System.out.println("User: " + oldContact.getEmail() + "is not your contact");
	}
}
	
	

	public String getLolRank() {
		return LolRank;
	}

	public void setLolRank(String lolRank) {
		LolRank = lolRank;
	}

	public ArrayList<User> getContacts() {
		return contacts;
	}

	public void setContacts(ArrayList<User> contacts) {
		this.contacts = contacts;
	}

	@Override
	public String toString() {
		return "regularUser [LolRank=" + LolRank + ", contacts=" + contacts + "]";
	}
	
	
	
	

}
