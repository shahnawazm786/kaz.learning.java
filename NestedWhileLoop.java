
public class NestedWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern1();
		Pattern2();
		Pattern3();
	}
	
	public static void Pattern1() {
		// Loop inside Loop
				// 1111
				// 2222
				// 3333
				// 4444
				int row=1;
				while(row<=4) {
					int column=1;
					while(column<=4) {
						System.out.print(row);
						column++;
					}
					System.out.println();
					row++;
				}

	}
	
	public static void Pattern2() {
		// Loop inside Loop
				// 1234
				// 1234
				// 1234
				// 1234
				int row=1;
				while(row<=4) {
					int column=1;
					while(column<=4) {
						System.out.print(column);
						column++;
					}
					System.out.println();
					row++;
				}

	}
	
	public static void Pattern3() {
		// Loop inside Loop
				// 1
				// 12
				// 123
				// 1234
				int row=1;
				while(row<=4) {
					int column=1;
					while(column<=row) {
						System.out.print(column);
						column++;
					}
					System.out.println();
					row++;
				}

	}
	

}
