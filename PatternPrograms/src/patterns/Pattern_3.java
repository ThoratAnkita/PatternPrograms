package patterns;

import java.util.Scanner;

public class Pattern_3 {

	public static void main(String[] args) {
//		1 2 3 4
//		1 2 3 4
//		1 2 3 4
//		1 2 3 4
		
		System.out.println("Enter no: ");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}

}
