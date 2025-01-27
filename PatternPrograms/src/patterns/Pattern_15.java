package patterns;

import java.util.Scanner;

public class Pattern_15 {

	public static void main(String[] args) {
		
//		A
//		B B
//		C C C
		
		System.out.println("Enter row no: ");
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		
		System.out.println("Enter character: ");
		Scanner sc= new Scanner(System.in);
		char ch= sc.next().charAt(0);
		
		for(int i=1;i<=n;i++) {
			char start=ch;
			ch++;
			for(int j=1;j<=i;j++) {
				System.out.print(start+" ");
			}
			System.out.println();
		}
		
//		ANOTHER WAY W/O using var start
		
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print((char)(ch+i-1)+" ");
//			}
//			System.out.println();
//		}

	}

}
