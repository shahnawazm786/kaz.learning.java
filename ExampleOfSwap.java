
public class ExampleOfSwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		swapNumberWithoutTemporaryVariable(100,200);
		swapNumberWithoutTemporaryVariableXOR(300,500);
	}
	static public void swapNumberWithoutTemporaryVariable(int x, int y) {
		System.out.println("------- Before Swapping -------");
		System.out.println("Value of X => "+x +" Value of Y =>"+y);
		x=x+y; // x+y => 100 + 200 => x=300
		y=x-y; // 300 -200 y=100
		x=x-y; // 300-100 // x=200
		System.out.println("------- After Swapping -------");
		System.out.println("Value of X => "+x +" Value of Y =>"+y);
	}
	
	static public void swapNumberWithoutTemporaryVariableXOR(int x,int y) {
		System.out.println("------- Before Swapping in XOR Operation -------");
		System.out.println("Value of X => "+x +" Value of Y =>"+y);
		x=x^y; // x+y => 100 + 200 => x=300  
		y=x^y; // 300 -200 y=100
		x=x^y; // 300-100 // x=200
		System.out.println("------- After Swapping in XOR Operation -------");
		System.out.println("Value of X => "+x +" Value of Y =>"+y);	
	}
	
	
	

}
