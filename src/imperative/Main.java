package imperative;

import java.util.ArrayList;
import java.util.List;

import imperative.Main.Person.Gender;

public class Main {
	public static void main(String[] args) {
		List<Person> people=List.of(
			new Person("John",Gender.MALE),
			new Person("Maria",Gender.FEMALE),
			new Person("Raj",Gender.MALE),
			new Person("Sanjay",Gender.MALE),
			new Person("Sangeeta",Gender.FEMALE),
			new Person("Sanjana",Gender.FEMALE)
				);
		// Imperative example
				List<Person> female=new ArrayList<>();
				for(Person person:people) {
				if(Gender.FEMALE.equals(person.gender))
				{
					female.add(person);
				}
				}
				System.out.println(female);
				
				List<Person> male=new ArrayList<>();
				for(Person person:people) {
					if(Gender.MALE.equals(person.gender)) {
						male.add(person);
					}
				}
				System.out.println(male);
				
	}
			
public static class Person{
	private final String name;
	private final Gender gender;
	enum Gender{
		MALE, FEMALE
	}

	public Person(String name,Gender gender) {
		this.name=name;
		this.gender=gender;
	}
	@Override
	public String toString() {
		return "Person {" + 
				"Name = "+ name +
				"Gender = " +gender +'}'; 
	}
}
}
