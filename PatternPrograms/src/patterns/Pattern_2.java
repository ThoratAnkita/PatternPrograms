package patterns;

import java.util.Scanner;

public class Pattern_2 {

	public static void main(String[] args) {
//		1 1 1
//		2 2 2
//		3 3 3
		
		System.out.println("Enter no: ");
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}

	}

}
