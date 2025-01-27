package patterns;

import java.util.Scanner;

public class Pattern_12 {

	public static void main(String[] args) {
		
//		A B C
//		A B C
//		A B C
		
		System.out.println("Enter row no: ");
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		
		System.out.println("Enter char: ");
		Scanner sc= new Scanner(System.in);
		char ch= sc.next().charAt(0);
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print((char)(ch+j-1)+" ");
				
			}
			System.out.println();
			
		}

	}

}
