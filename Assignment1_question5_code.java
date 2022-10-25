package java_assignment1;

public class Assignment1_question5_code {

	public static void main(String[] args) {
		int n = 14 , i = 1;
		 while(i <= n){
			if(i == 1 || i == n) {
				for(int j = 1 ; j <= n ; j++) {
					System.out.print("*");
				}
				System.out.println();
				i += 1;
				continue;
			}
			else if(i > 1 && i <= n / 2) {
				for(int k = 6 ; k >= 2 ; k--) {
					for(int l = 1 ; l <= k ; l++) {
						System.out.print("*");
					}
					System.out.println();
				}
				i = (n/2)+1;
				continue;
			}
			else if(i > n/2) {
				for(int m  = 1 ; m <= 7 ; m++) {
					for(int g = 1 ; g <= m ; g++) {
						System.out.print("*");
					}
					System.out.println();
				}
				i  = n;
			}
		}
	}

}
