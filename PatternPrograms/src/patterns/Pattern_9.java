package patterns;

import java.util.Scanner;

public class Pattern_9 {

	public static void main(String[] args) {
		
//		1
//		2 3
//		3 4 5
//		4 5 6 7
		
		System.out.println("Enter row no:");
		Scanner s = new Scanner(System.in);
		int n= s.nextInt();
		
		for(int i=1;i<=n;i++) {
			int value=i;
			for(int j=1;j<=i;j++) {
				System.out.print(value+" ");
				value++;
			}
			System.out.println();
		}
		
//		ANOTHER WAY W/O using var value
		
//		for(int i=1;i<=n;i++) {
//			
//			for(int j=1;j<=i;j++) {
//				System.out.print(i+j-1+" ");           //use (i+j-1)	
//			}
//			System.out.println();
//		}

	}

}
