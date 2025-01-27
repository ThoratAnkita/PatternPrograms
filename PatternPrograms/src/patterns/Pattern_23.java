package patterns;

import java.util.Scanner;

public class Pattern_23 {

	public static void main(String[] args) {
		
//		1
//	   22
//	  333
//	 4444
		
	System.out.println("Enter row no: ");
	Scanner s= new Scanner(System.in);
	int n= s.nextInt();
	
	for(int i=1;i<=n;i++) {
		
		//spaces
		for(int j=1;j<=(n-i);j++) {
			System.out.print(" ");
		}
		//nums
		for(int j=1;j<=i;j++) {
			System.out.print(i);
		}
		System.out.println();
	}

	}

}
