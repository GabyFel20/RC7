package models;

public class User {
	private String username;
	private String email;
	
	public User(String username, String email) {
		super();
		this.username = username;
		this.email= email;	
	}
	
	public void login() {
		System.out.println("User "+ this.getUsername() + "logged in");
	}
	
	public void logout() {
		System.out.println("User "+ this.getUsername() + "logged out" );
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", email=" + email + "]";
	}
	
	
	
}
