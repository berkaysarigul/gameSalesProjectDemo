package gameSalesProjectDemo.Entities;

import gameSalesProjectDemo.Abstract.IEntity;

public class Gamer implements IEntity {
	private int id;
	private String firstName;
	private String lastName;
	private int dateOfBirth;
	private String nationalityId;
	
	public Gamer(int id, String firstName, String lastName, int dateOfBirth, String nationalityId) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.nationalityId = nationalityId;
	}

	public int getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getDateOfBirth() {
		return dateOfBirth;
	}

	public String getNationalityId() {
		return nationalityId;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setDateOfBirth(int dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}
}
