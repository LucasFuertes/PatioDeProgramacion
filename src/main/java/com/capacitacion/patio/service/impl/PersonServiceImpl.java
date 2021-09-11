package com.capacitacion.patio.service.impl;

import com.capacitacion.patio.dao.Person;
import com.capacitacion.patio.service.PersonService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class PersonServiceImpl implements PersonService {
	private Scanner in = new Scanner(System.in);
	private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

	@Override
	public Person create(Person person) {
		System.out.println("Escriba su Dni:");
		person.setDni(in.nextLong());
		in.nextLine();
		System.out.println("Escriba su nombre:");
		person.setName(in.nextLine());
		System.out.println("Escriba su apellido:");
		person.setLastName(in.nextLine());
		Date date = new Date();

		System.out.println("Escriba su fecha de nacimiento:");
		System.out.println("DIA:");
		String dateInsert = in.nextLine();
		System.out.println("MES:");
		String monthInsert = in.nextLine();
		System.out.println("ANIO:");
		String yearInsert = in.nextLine();

		String fechaReal = dateInsert + "/" + monthInsert + "/" + yearInsert;

		try {
			date = simpleDateFormat.parse(fechaReal);
		} catch (ParseException e) {
			System.out.println("Error de parseo");
		}
		person.setDateOfBirth(date);
		System.out.println("Escriba su altura:");
		person.setHeight(in.nextFloat());
		return person;
	}

	@Override
	public void read(Person person) {

		if (person.equals(null) || person.getHeight() == 0) {
			System.out.println("No hay nada que leer");
		} else {

			System.out.println("Sus datos: [dni=" + person.getDni() + ", name=" + person.getName() + ", lastName="
					+ person.getLastName() + ", dateOfBirth=" + simpleDateFormat.format(person.getDateOfBirth())
					+ ", height=" + person.getHeight() + "]");
		}
	}

	@Override
	public Person update(Person person, Person personToExtract) {

		person = personToExtract;
		return person;
	}

	@Override
	public Person delete(Person person) {
		person.setDni(null);
		person.setName(null);
		person.setLastName(null);
		person.setDateOfBirth(null);
		person.setHeight(0);
		return person;
	}

}
