package patterns;

import java.util.Scanner;

public class Pattern_4 {

	public static void main(String[] args) {
//		4 3 2 1
//		4 3 2 1
//		4 3 2 1
//		4 3 2 1
		
		System.out.println("Enter no: ");
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j=n;j>=1;j--) {                 //another way-> (int j=1;j<=n;j++)
				System.out.print(j+" ");            // System.out.print(n-j+1)
			}
			System.out.println();
		}
		
//Another way if not want to go reverse in for loop of j
		
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=n;j++) {
//				System.out.print((n-j+1)+"");
//			}
//			System.out.println();
//		}

	}
}


