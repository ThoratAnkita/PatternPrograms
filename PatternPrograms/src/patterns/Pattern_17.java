package patterns;

import java.util.Scanner;

public class Pattern_17 {

	public static void main(String[] args) {
		
//		A
//		B C
//		C D E
//		D E F G
		
		System.out.println("Enter row no: ");
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		
		System.out.println("Enter character: ");
		Scanner sc= new Scanner(System.in);
		char ch= sc.next().charAt(0);
		
		for(int i=1;i<=n;i++) {
			char star=(char)(ch+i-1);
			for(int j=1;j<=i;j++) {
				System.out.print(star+" ");
				star++;
			}
			System.out.println();
		}

	}

}
