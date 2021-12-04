
public class ExampleOfWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//WhileLoop1();	
		//WhileLoop2();
		EvenNumberPrint();
	}
	
	public static void WhileLoop1() {
		int x=1;
		System.out.println("Value of X => "+x);
		while(x<10) {
			System.out.println("Expression(x<10) => " +x + "<10"+"=>"+(x<10));
			System.out.println("Message => Hello!!! Testing");
			x++;
			System.out.println("Value of X => "+x);
		}
		System.out.println("Expression(x<10) => " +x + "<10"+"=>"+(x<10));
	}
	public static void EvenNumberPrint() {
		int even=2;
		while(even<=20) {
			System.out.print(even +"\t");
			even+=2;
		}
	}
	
	public static void WhileLoop2() {
		int x=100;
		System.out.println("Value of X => "+x);	
		while(x>=0) {
			System.out.println("Expression(x>=0) => " +x + ">=0"+"  =>  "+(x>=0));
			System.out.println("Message => Hello!!! Testing");
			System.out.println("Decrement Operations (x-=10)");
			x-=10;
			System.out.println("Value of X => "+x);
		
		}
		System.out.println("Expression(x>=1) => " +x + ">=0"+"  =>  "+(x>=0));	
	}
	
	
	
	public static void whileLoop() {
		// Hello!!! Testing - 10 time show
				int x=1; 
				while(x<10) {
					System.out.println("Hello!!! Testing");
					x++;
				}
				
				int y=1;
				//boolean flag=true;
				while(true) {
					System.out.println("Hello!!!");
					y++;
					if(y>10)
						break;
					
				}
	}

}
