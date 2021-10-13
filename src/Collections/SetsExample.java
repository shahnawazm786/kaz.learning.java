package Collections;

import java.util.HashMap;

public class SetsExample {

	public static void main(String[] args) {
		HashMap<String,Integer> map=new HashMap<>();
		map.put("browser", 20);
		map.put("Version", 94);
		map.put("SSL", 0);
		System.out.println("Map data  | "+map);
		System.out.println("Map key set | "+map.keySet());
		System.out.println("Map key value | "+map.get("Version"));
		System.out.println();
		

	}

}
