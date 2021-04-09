package JavaBasic;

import java.util.Scanner;

public class SwapNumber {
	public static void main(String[] args) {
		int x,y;
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number\n");
		x=sc.nextInt();
		System.out.println(x);
		System.out.print("Enter number\n");
		y=sc.nextInt();
		System.out.println(y);
		System.out.println("\nBefore swapping\n");
		System.out.println(x);
		System.out.println(y);
		int temp;
		temp=x;
		x=y;
		y=temp;
		System.out.println("\nAfter swapping");
		System.out.println(x);
		System.out.println(y);
		
	}
}
