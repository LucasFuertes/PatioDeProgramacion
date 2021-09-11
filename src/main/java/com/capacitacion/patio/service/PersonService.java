package com.capacitacion.patio.service;

import com.capacitacion.patio.dao.Person;

public interface PersonService {
	
	public Person create(Person person);
	public void read(Person person);
	public Person update(Person person, Person personToExtract);
	public Person delete(Person person);
}
