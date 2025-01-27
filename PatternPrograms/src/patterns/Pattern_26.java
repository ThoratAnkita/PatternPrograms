package patterns;

import java.util.Scanner;

public class Pattern_26 {

	public static void main(String[] args) {
//		   1   
//		  121
//		 12321
//		1234321
		
		System.out.println("Enter row no: ");
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		
		for(int i=1;i<=n;i++) {
			
			//space
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			//nums1
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			//nums2
			for(int j=i-1;j>=1;j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		

	}

}
