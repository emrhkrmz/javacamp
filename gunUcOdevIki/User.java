package gunUcOdevIki;

public class User {
	public User() {
		// TODO Auto-generated constructor stub
	}
	private int id;
	private String name;
	private String lastName;
	private String email;
	private String password;
	
	public User(int id, String name, String lastName, String email, String password) {
		this.setId(id);
		this.setName(name);
		this.setLastName(lastName);
		this.setEmail(email);
		this.setPassword(password);
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}	
	

}
