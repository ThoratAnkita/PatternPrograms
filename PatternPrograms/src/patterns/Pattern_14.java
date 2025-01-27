package patterns;

import java.util.Scanner;

public class Pattern_14 {

	public static void main(String[] args) {
		
//		A B C
//		B C D
//		C D E
		
		System.out.println("Enter row no: ");
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		
		System.out.println("Enter character: ");
		Scanner sc= new Scanner(System.in);
		char ch= sc.next().charAt(0);
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print((char)(ch+i+j-2)+" ");
			}
			System.out.println();
		}
		
//		ANOTHER WAY using variable start.
//		for(int i=1;i<=n;i++) {
//			int j=1;
//			
//			char start=(char)(ch+i-j);
//			
//			while(j<=n) {
//				System.out.print(start+" ");
//				start++;
//				j++;
//			}
//			System.out.println();
//		}

	}

}
