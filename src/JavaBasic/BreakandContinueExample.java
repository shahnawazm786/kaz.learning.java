
public class BreakandContinueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	//breakExample();
		//continueExample();
		continueExample1();
		
	}
	static void breakExample() {
		/*Boolean flag=true;
		int cnt=1;
		while(true) {
			if(cnt>5) {
				break;
			}
			
			System.out.println("Hello Program");
			System.out.println("Value of cnt ->"+cnt);
			cnt++;
		}
		System.out.println("Value of cnt ->"+cnt);
		*/
		int i=1;
		while(i<=100) {
			if(i>10)
				break;
			System.out.println("Count of i ->" +i);
			i++;
		}
	}
	
	static void continueExample() {
		int j=1;
		while(j<20) {
			j++;
			if(j<=10)
				continue;
			System.out.println("Count of j ->" + j);
			
		}
	}
	static void continueExample1() {
		int k=1;
		while(k<=20) {
			k++;
			if(k%2==1)
				continue;
			System.out.println("Even number from 1- 20 =>"+k);
		}
	}
	

}
