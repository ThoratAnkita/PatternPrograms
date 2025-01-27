package patterns;

import java.util.Scanner;

public class Pattern_10 {

	public static void main(String[] args) {
		
//		1
//		2 1
//		3 2 1
//		4 3 2 1
		
		System.out.println("Enter row no: ");
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print((i-j+1)+" ");
			}
			System.out.println();
		}
		
//		ANOTHER WAY using var value
		
//		for(int i=1;i<=n;i++) {
//			int value=i;
//			for(int j=1;j<=i;j++) {
//				System.out.print(value+" ");
//				value--;
//			}
//			System.out.println();
//		}
		

	}

}
