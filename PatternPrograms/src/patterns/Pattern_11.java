package patterns;

import java.util.Scanner;

public class Pattern_11 {

	public static void main(String[] args) {
//		A A A
//		B B B
//		C C C
		
		System.out.println("Enter row no: ");
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		
		System.out.println("Enter character: ");
		Scanner s = new Scanner(System.in);
		char ch= s.next().charAt(0);
		
		for(int i=1;i<=n;i++) {
//			char ch='A';
			for(int j=1;j<=n;j++) {
				System.out.print((char)(ch+i-1)+" ");
			}
			System.out.println();
		}

	}

}
