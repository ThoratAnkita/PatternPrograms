package patterns;

import java.util.Scanner;

public class Pattern_28 {

	public static void main(String[] args) {
//		A
//	   B C
//	  D E F
//	 G H I J
//	K L M N O
//	 P Q R S
//	  T U V
//	   W X
//	    Y
//	    Z
		char ch='A';
		int rows=5;
		for(int i=1;i<=rows;i++) {
			
			for(int j=i;j<=rows;j++) {
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++) {
				if(ch>'Z') break;
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
			
		}
		
		for(int i=rows-1;i>=1;i--) {
			for(int j=rows;j>=i;j--) {
				System.out.print(" ");
			}
			for(int j=1;j<=(2*i-1);j+=2) {
				if(ch>'Z') break;
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
		}
		if(ch=='Z') {
			System.out.println(" ".repeat(rows)+ch);
		}

	}

}
