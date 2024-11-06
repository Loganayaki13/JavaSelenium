package javaProgramming;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Number  : ");

		int a = input.nextInt(), b=1;
		
		for (int i=1;i<=a;i++) {
			for (int j=1;j<=i;j++) {
				System.out.print(b+" ");
				b++;
			}
			System.out.println("");
		}
	}

}
