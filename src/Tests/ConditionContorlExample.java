
public class ConditionContorlExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Output 
		// Java Programmer
		// Criteria participant >5
		int participant=5;
		if(participant>5)
			System.out.println("Java Programmer");
	
		
		// Output
		// participant > 5 
		// show the result -> Java Programmer
		// show the result -> C# Programmer
		
		participant=2;
		if(participant>5) //2>5 => False
			System.out.println("Java Programmer");
		else
			System.out.println("C# Programmer");
		
	
		/*if(true) {}
		else {} */
		System.out.println("-- String Matching ---");
		 MatchString();
		 System.out.println("-- Contains String ---");
		 ContainsString();
		}
	public static void MatchString() {
		String str="Java";
		String str1="Java";
		if(str.equals(str1)) {
			System.out.println("Both Strings are equal");
		}
		else
		{
			System.out.println("Both String are not equal");
		}
	}
	public static void ContainsString() {
		String str="Java is programming language";
		String str1="Oracle";
		if(str.contains(str1)) {
			System.out.println("String contains");
		}
		else
		{
			System.out.println("String not contains");
		}
	}
	
	
	}


