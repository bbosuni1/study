package workshop2.test1;

public class Test01 {

	public static void main(String[] args) {

		
		for (int inx = 0 ; inx <= 6; inx++) {
			
			for ( int jnx = 0 ; jnx <= inx ; jnx++ ) {
				System.out.print("*");
			}
			System.out.print("@");
		}
	
	System.out.println();
	System.out.println("======== 원본과 비교========");	
	
		int inx = 0; while (inx <= 6) {
			int jnx = 0;
			while (jnx <= inx) {
			                    System.out.print("*");
			jnx++; }
			             System.out.print("@");
			inx++; }
		
		
	} // method

} // class
