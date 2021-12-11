
public class StringArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//stringExample();
		String general="I am indian indian is brave indian is positive we are proud to be indian";
		String cnt="is";
		//int count=general.length() - general.replace(cnt, "").length();
		//System.out.println("count is ->"+count);
		countTheRepeatedWord(general,cnt);
	}

static void stringExample() {
	String str="We are indian";
	String[] splitString=str.split(" ");
	// for each
	for(String s :splitString) {
		System.out.println(s);
	}
	System.out.println("Count of word "+splitString.length);

}

static void countTheRepeatedWord(String str,String repeatedString) {
String[] s=str.split(" ");
int occurance=0;
for(String word:s) {
	if(word.equals(repeatedString)) {
		occurance++;
	}
}
System.out.println("Occurance is "+occurance);
}
	
}
// Find the duplicate word into the String