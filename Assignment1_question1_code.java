package java_assignment1;


public class Assignment1_question1_code {

	public static void main(String[] args) {
		
		int n = 5 , flag = 1;
		
		//I
		for(int  i = 1 ; i <= n ; i++) {
			System.out.println("*");
		}
		System.out.println();
		//N
		for(int row = 1; row <= n ; row++) {
			for(int coln = 1 ; coln <= n ; coln++) {
				if(coln == 1 || coln == n || row == coln) {
					System.out.print("*");	
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		//E
		for(int row = 1 ; row <= n ; row++) {
			for(int col = 1 ; col <= n ; col++) {
				if(row == 1 || col == 1 || row == n || row == n / 2 + 1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();	
		}
		System.out.println();
		//U
		for(int row = 1 ; row <= n ; row++) {
			for(int col = 1 ; col <= n ; col++) {
				if(col == 1 || col == n || row == n) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		//R
		for(int row = 1 ; row <= n ; row++) {
			for(int col = 1 ; col <= n-1 ;col++) {
				if(col == 1 || row == 1 || row == 3 || col == n-1 && row <= 2 || row + col == flag) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
			flag += 2;
		}
		System.out.println();
		//O
		for(int row = 1 ; row <= n ; row++) {
			for(int col = 1 ; col <= n ; col++) {
				if(col == 1 || col == n ||  row == 1 || row == n) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		//N
		for(int row = 1; row <= n ; row++) {
			for(int coln = 1 ; coln <= n ; coln++) {
				if(coln == 1 || coln == n || row == coln) {
					System.out.print("*");	
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
