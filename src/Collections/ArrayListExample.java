import java.util.ArrayList;

class ArrayListExample {
	public static void main(String[] args) 
	{
		//Creating Object Of ArrayList containing Primitive Datatype 
		//Here as Integer
		ArrayList<Integer> list = new ArrayList<Integer>();

		//We can create it polymorphically also
		// List list = new ArrayList();

		//Adding Integers in ArrayList from 0-9
		for(int i=0;i<10;i++){
			list.add(i);
		}

		//Printing ArrayList(Using toString())
		System.out.println(list);

		//Printing ArrayList Index Values
		for(int i=0;i<10;i++){
			System.out.println(i+"~"+list.get(i));
		}
	}
}
