package Person;

public class Person {
	
	private String name;
	private String surname;
	private String birthday;
	
	public Person(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}
	
	/*public void setName(String name) {
		this.name = name;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}*/
	
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	
	public String getName()  {
		return this.name;
	}
	
	public String getSurname() {
		return this.surname;
	}
	
	public String getBirthday() {
		return this.birthday;
	}
	
}