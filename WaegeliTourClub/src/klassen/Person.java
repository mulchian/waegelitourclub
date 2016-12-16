package klassen;

public abstract class Person {

	public String username;
	protected String password;
	
	public Person(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	public void anmelden() {
		
	}
	
	public Person abmelden() {
		return null;
	}
	
}
