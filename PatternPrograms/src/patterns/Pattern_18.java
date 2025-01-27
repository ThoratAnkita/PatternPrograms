package patterns;

import java.util.Scanner;

public class Pattern_18 {

	public static void main(String[] args) {
		
//		D
//		C D
//		B C D
//		A B C D
		
		System.out.println("Enter row no: ");
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		
		System.out.println("Enter character: ");
		Scanner sc= new Scanner(System.in);
		char ch= sc.next().charAt(0);
		
		for(int i=1;i<=n;i++) {
			char start= (char)(ch+n-i);
			for(int j=1;j<=i;j++) {
				System.out.print(start+" ");
				start++;
			}
			System.out.println();
		}

	}

}
