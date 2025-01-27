package patterns;

import java.util.Scanner;

public class Pattern_13 {

	public static void main(String[] args) {
		
//		A B C
//		D E F 
//		G H I
		
		System.out.println("Enter row no: ");
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		
		System.out.println("Enter character: ");
		Scanner sc= new Scanner(System.in);
		char ch= sc.next().charAt(0);
		
		char start=ch;
		
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=n;j++) {
				System.out.print(start+" ");
				start++;
			}
			System.out.println();
		}

	}

}
