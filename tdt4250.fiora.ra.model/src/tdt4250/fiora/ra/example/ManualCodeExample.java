package tdt4250.fiora.ra.example;

import tdt4250.fiora.ra.Person;
import tdt4250.fiora.ra.RaFactory;

public class ManualCodeExample {
	public static void main(String[] args) {
		Person person = RaFactory.eINSTANCE.createPerson();
		System.out.println(person.getName() + " == " + person.getGivenName() + " + " + person.getFamilyName());
		person.setName("Tan");
		System.out.println(person.getName() + " == " + person.getGivenName() + " + " + person.getFamilyName());
		person.setName("Fiora Tan");
		System.out.println(person.getName() + " == " + person.getGivenName() + " + " + person.getFamilyName());
	}
}
