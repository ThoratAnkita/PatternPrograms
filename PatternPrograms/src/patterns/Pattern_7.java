package patterns;

import java.util.Scanner;

public class Pattern_7 {

	public static void main(String[] args) {
//		1
//		2 2
//		3 3 3
//		4 4 4 4
		
		System.out.println("Enter row no: ");
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}

	}

}
