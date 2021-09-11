package com.capacitacion.patio;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.capacitacion.patio.dao.Person;
import com.capacitacion.patio.service.impl.PersonServiceImpl;

public class ManejoFechasController {

	public static void main(String[] args) {

		Person person = new Person();
		PersonServiceImpl personServiceImpl = new PersonServiceImpl();
		person = personServiceImpl.create(person);
		personServiceImpl.read(person);

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();
		try {
			date = simpleDateFormat.parse("10/4/1996");
		} catch (ParseException e) {
			System.out.println("Error de parseo");
		}
		Person personToExtract = new Person(11223344L, "Yair", "Gonzales", date, (float) 1.65);
		
		person = personServiceImpl.update(person, personToExtract);
		personServiceImpl.read(person);
		person = personServiceImpl.delete(person);
		personServiceImpl.read(person);
		
		
		
		
	}

}
