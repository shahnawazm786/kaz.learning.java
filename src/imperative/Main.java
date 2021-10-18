package imperative;

import java.util.ArrayList;
import java.util.List;

import imperative.Main.Person.Gender;

public class Main {
	public static void main(String[] args) {
		List<Person> person=List.of(
			new Person("John",Gender.MALE),
			new Person("Maria",Gender.FEMALE),
			new Person("Raj",Gender.MALE),
			new Person("Sanjay",Gender.MALE)
				);
	}
	// Imperative example
	List<Person> female=new ArrayList<Person>();
	
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