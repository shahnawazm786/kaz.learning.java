
public class CountCharacterExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="I am java programmer";
		int len=str.length(); // method
		System.out.println("Length of the String -> "+len);
		// Index - 0 and length-1
		countCharacter(str,'a');
		countCharacterWithoutUsingLoop(str,"a");
		countCharacterWithoutUsingLoop1(str,"a");
	}
	public static void countCharacter(String s,char c) {
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(c==s.charAt(i)) {
				count++;
			}
	}
	System.out.println("character ->"+c +"  Occcured -> "+count+" times ");
}

	public static void countCharacterWithoutUsingLoop(String s,String c) {
		
		int count=s.length() - s.replace(c,"").length();
		System.out.println("character ->"+c +"  Occcured -> "+count+" times ");
	}
	
public static void countCharacterWithoutUsingLoop1(String s,String c) {
		
		int count=s.length();
		String s1=s.replace(c, "");
		System.out.println("After replace string is");
		System.out.println(s1);
		int count1=s1.length();
		int occurance=count-count1;
		System.out.println("character ->"+c +"  Occcured -> "+occurance+" times ");
	}
}

