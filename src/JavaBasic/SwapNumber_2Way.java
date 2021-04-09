package JavaBasic;

import java.util.Scanner;

public class SwapNumber_2Way {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		int num1,num2;
		System.out.println("Enter first number");
		num1=sc.nextInt();
		System.out.println("Enter second number");
		num2=sc.nextInt();
		System.out.println("Before swapping the number");
		System.out.println("Num1\t"+num1);
		System.out.println("Num2\t"+num2);
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		System.out.println("After swapping the number");
		System.out.println("Num1\t"+num1);
		System.out.println("Num2\t"+num2);
	}

}
