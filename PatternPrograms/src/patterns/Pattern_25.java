package patterns;

import java.util.Scanner;

public class Pattern_25 {

	public static void main(String[] args) {
//		     1
//		   2 3
//		 4 5 6
//	   7 8 9 10
		
		System.out.println("Enter row no: ");
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		int count=1;
		
		for(int i=1;i<=n;i++) {
			
			//spaces
			for(int j=1;j<=(n-i);j++) {
				System.out.print(" ");
			}
			//nums
			for(int j=1;j<=i;j++) {
				System.out.print(count);
				count++;
			}
			System.out.println();
		}

	}

}
