
class CondtionControl_ifelseExample {
public static void main(String[] args) {
	// Scenario 
	// Participant > 10
	// Result -> Java Session
	// Participant <10 and >=5
	// Result -> Oracle Session
	// Participant <5 and >=2
	// Result -> ML Session
	// Other wise
	// Result - No Session
	int participant=1;
	boolean flag=participant>10;
	if(flag)
		System.out.println("Java Session");
	flag=participant<=10 & participant>5;
	if(flag)
		System.out.println("Oracle Session");
	
	flag=participant<=5 & participant>=2;
	if(flag)
		System.out.println("ML Session");
	flag=participant<2;
	if(flag)
		System.out.println("No Session");
//
	System.out.println("  Use of if -- else  ");
	ifEleseIfUse();
	NestedIf();
	}
public static void ifEleseIfUse() {
	int participant=3;
	
	if(participant>10)
		System.out.println("Java Session");
	else if(participant<=10 & participant>5)
		System.out.println("Oracle Session");
	//flag=participant<=5 & participant>=2;
	else if(participant<=5 & participant>=2)
		System.out.println("ML Session");
	//flag=participant<2;
	else
		System.out.println("No Session");
	
}

public static void NestedIf() {
	System.out.println("---- Nested If ---");
	// Example 
	// Take three number 
	// check which one is greater
	int x,y,z;
	x=300;y=200;z=100;
	if(x>y) {
		if(x>z) {
			System.out.println("X is greater");
		}
		else {
			System.out.println("Z is greater");
		}
		
	}
	else {
		if(y>z) {
			System.out.println("Y is greater");
		}
		else {
			System.out.println("Z is greater");
		}
	}
	
}

}
