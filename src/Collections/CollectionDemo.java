package Collections;

import java.util.ArrayList;
import java.util.Collection;

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
		
	}

}
