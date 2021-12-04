package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<String> fruits=new ArrayList<>();
		fruits.add("banana");
		fruits.add("apple");
		fruits.add("mango");
		fruits.add("pear");
		System.out.println(fruits);
		fruits.remove("banana");
		System.out.println(fruits);
		fruits.remove("orange"); //object not found but exception is not raised
		System.out.println(fruits);
		boolean isContains=fruits.contains("mango");
		System.out.println(isContains);
		fruits.forEach((element) -> {
			System.out.println(element);
		});
		
		List<String> course=new ArrayList<>();
		course.add("Java");
		course.add("C++");
		course.add("Oracle");
		course.add("C Language");
		course.add("SQL Server");
		course.forEach((elem)->{
			System.out.println(elem);
		});
	}

}
