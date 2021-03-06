package inheritance2_odev;

import java.sql.Date;

public class User {

	private int id;
	private String name;
	private String surname;
	private String nationalIdentity;
	private String birthDay;
	
	
	public User() {
		
	}
	
	public User(int id, String name, String surname, String nationalIdentity, String birthDay) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.nationalIdentity = nationalIdentity;
		this.birthDay = birthDay;
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

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getNationalIdentity() {
		return nationalIdentity;
	}

	public void setNationalIdentity(String nationalIdentity) {
		this.nationalIdentity = nationalIdentity;
	}

	public String getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}
	
	
	public void whoAmI() {
		System.out.println("Watashi wa yuzadesu");
	}
}
