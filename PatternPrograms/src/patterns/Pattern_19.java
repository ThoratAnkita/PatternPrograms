package patterns;

import java.util.Scanner;

public class Pattern_19 {

	public static void main(String[] args) {
		
//		   *
//		  **
//		 ***
//		****
		
		System.out.println("Enter row no: ");
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		
		
		for(int i=1;i<=n;i++) {
			//spaces
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
