
public class OperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArithmeticOperator();
		 BooleanOperator();
		 LogicalOperator();
		 AssignmentOperator();
	}
	public static void ArithmeticOperator() {
		int a,b;
		a=100;
		b=200;
		System.out.println("Addition of A and B"+(a+b));
		System.out.println("Substraction of A and B"+(a -b));
		System.out.println("Multiply of A and B"+(a*b));
		System.out.println("Division of A and B"+(a/b));
		System.out.println("Remainder of A and B"+(a%b));
	}
	
	public static void BooleanOperator() {
		// Result - True or False
		System.out.println("Operation of Boolean Operator");
		System.out.println(100>200); // False
		System.out.println(200<100); // False
		System.out.println(100>=50); // 100>50 or 100==50  => True or False => True 
		System.out.println(300<=900); // 300<900 or 300==900 => True or False => True
		System.out.println(100==100); // True
		System.out.println(200!=100); // 200==100 => !False => True
		
	}
	
	public static void LogicalOperator() {
		
		System.out.println("Logical Opeation");
		// AND 
		 // 100>50  AND  200>100 AND   400>300
		System.out.println(100>50 & 200>100 & 400>300);
		// OR
		// 100>200  OR  200<100 OR   400>300
		System.out.println(100>200  |  200<100 |   400>300);
		
		System.out.println(100>50 & 200>100 & 400<300);
		System.out.println(100>200  |  200<100 |   400<300);
		// Output
		System.out.println((100>200  |  200<100 |   400<300)|700>300);
		System.out.println(!((100>200  |  200<100 |   400<300)|700>300));
		System.out.println(!true);
		System.out.println(!false);
		
	}
	public static void AssignmentOperator() {
		System.out.println("Assignment Operator");
		int a=100;
		a+=200; // a=a+200 => 100 + 200 => 300
		System.out.println("Value of A "+a); //300
		a-=100; // a=a-100 =>300-100 => 200
		System.out.println("Value of A "+a);
		a*=100; // a=a*100 => 200* 100 => 20000
		System.out.println("Value of A "+a);
		a/=500; // a=a/500 =>20000/500 => 40
		System.out.println("Value of A "+a);
		a%=7; // a=a%7 => 40%7 => 5
		System.out.println("Value of A "+a);
	}

}
