package patterns;

import java.util.Scanner;

public class Pattern_24 {

	public static void main(String[] args) {
		
//		1234
//		 234
//		  34
//		   4
		
		System.out.println("Enter row no: ");
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		
		for(int i=1;i<=n;i++) {
			int count=i;
			//spaces
			for(int j=1;j<=(i-1);j++) {
				System.out.print(" ");
			}
			//nums
			for(int j=i;j<=n;j++) {
				System.out.print(count);
				count++;
			}
			System.out.println();
		}

	}

}
