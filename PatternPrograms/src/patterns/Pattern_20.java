package patterns;

import java.util.Scanner;

public class Pattern_20 {

	public static void main(String[] args) {
		
//		*
//		**
//		***
//		****
		
		System.out.println("Enter row no: ");
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		
		
		for(int i=1;i<=n;i++) {
			
			//stars
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			//spaces
			for(int j=1;j<=n;j++) {
				System.out.print(" ");
			}
			System.out.println();
			
		}

	}

}
