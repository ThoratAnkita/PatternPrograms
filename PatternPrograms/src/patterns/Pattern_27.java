package patterns;

public class Pattern_27 {

	public static void main(String[] args) {
//		1234554321
//		1234**4321
//		123****321
//		12******21
//		1********1
		
		int n=5;
		for(int i=1;i<=n;i++) {
			
			//nums
			for(int j=1;j<=n-i+1;j++) {
				System.out.print(j);
			}
			
			//stars
			for(int j=1;j<=2*(i-1);j++) {
				System.out.print("*");
			}
			
			//nums
			for(int j=n-i+1;j>=1;j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		

	}

}
