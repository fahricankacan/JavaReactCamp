package oopIntro_odev;

public class User implements Entity {
	
	public int id;
	public String name;
	public String surname;
	public String mail;
	public String password;
	public String Authority;
	
	
	public User() {
		
	}
	
	public User(int id,String name,String mail,String password,String Authority) {
		this.id=id;
		this.name=name;
		this.mail=mail;
		this.password=password;
		this.Authority=Authority;
	}
}
