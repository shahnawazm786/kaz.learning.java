
public class DoWhileLoopExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.out.println("While Statement");
		Boolean flag=false;
		while(flag) {
			System.out.println("Value will not print");
		}
		
		System.out.println("Do while statement");
		do {
			System.out.println("Value printed first time only even the flag value is false ->" + false);
		}while(flag);
		
		/*
		int x=1;
		while(x<100) {
			System.out.println(x);
			
		}
		for(int i=0; i<100;i++) {
			System.out.println(i);
		}
	
		String s="I am learning java";
		for(int i=0; i<s.length(); i++) {
			System.out.println(s.charAt(i));
		}
		*/
		String name="Java";
		System.out.println(name.charAt(2));
		
		
		
	}
	
	
	
}
