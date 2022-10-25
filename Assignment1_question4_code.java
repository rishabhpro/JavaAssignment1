package java_assignment1;

public class Assignment1_question4_code {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 8;
		for(int row = 1 ; row <= n ; row++) {
			for(int col = 1 ; col <= n ; col++) {
				if(col <= row || col >	 (n-row)) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
