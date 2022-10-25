 package java_assignment1;

public class Assignment1_question3_code {

	public static void main(String[] args) {
		int n = 14;
		int mid = n/2;
		for(int row = 1 ; row <= n ; row++) {
			for(int col = 1 ; col <= n; col++) {
				if(col < mid || col > mid || row > n/2 || row == 1 || row == n) {
					System.out.print("*");
				}else if(col >= mid){
					System.out.print(" ");
					mid++;
				}
			}
			System.out.println();
		}
	}

}
