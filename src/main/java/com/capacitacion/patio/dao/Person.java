package com.capacitacion.patio.dao;

import java.util.Date;
import java.util.Objects;

public class Person {

	private Long dni;
	private String name;
	private String lastName;
	private Date dateOfBirth;
	private float height;

	public Person(Long dni, String name, String lastName, Date dateOfBirth, float height) {
		super();
		this.dni = dni;
		this.name = name;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.height = height;
	}

	public Person() {
		super();
	}

	public Long getDni() {
		return dni;
	}

	public void setDni(Long dni) {
		this.dni = dni;
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

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dateOfBirth, dni, height, lastName, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(dateOfBirth, other.dateOfBirth) && Objects.equals(dni, other.dni)
				&& Float.floatToIntBits(height) == Float.floatToIntBits(other.height)
				&& Objects.equals(lastName, other.lastName) && Objects.equals(name, other.name);
	}

}
