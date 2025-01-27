package patterns;

import java.util.Scanner;

public class Pattern_22 {

	public static void main(String[] args) {
//		1111
//		 222
//		  33
//		   4
		System.out.println("Enter row no: ");
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		
		for(int i=1;i<=n;i++) {
			
			//spaces
			for(int j=1;j<=(i-1);j++) {
				System.out.print(" ");
			}
			//nums
			for(int j=1;j<=(n-i+1);j++) {
				System.out.print(i);
			}
			System.out.println();
		}

	}

}
