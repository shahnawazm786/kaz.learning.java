package functional;

import java.util.*;
public class Example_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> number=Arrays.asList(15,20,50,60,30,20,11,-9,5,6);
		int factor=2;
		System.out.println(number.stream().filter(num->num%2==0)
				.mapToInt(e->e*factor).sum()
				);
	for(Integer a:number) {
		System.out.println(a);
	}
	}

}
