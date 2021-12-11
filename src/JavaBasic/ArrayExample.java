
public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Array is contineous allocation of memory
		// start indexing from 0
		// elements of an array is accessible by index
		// Array can be created for primitive and non-primitive data type
		int a[]= {10,20,30,40,50};
		int[] b= {12,14,16};
		char[] c= {'a','e','i','o','u'};
		System.out.println(c);
		//System.out.println(a);
		//System.out.println(b);
		for(int i=0;i<a.length;i++) { // static variable length
			System.out.println(a[i]);
		}
		for(int j=0;j<b.length;j++) {
			System.out.println(b[j]);
		}
		
	}

}
