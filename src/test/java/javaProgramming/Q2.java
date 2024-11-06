package javaProgramming;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the String  : ");
		String s = input.nextLine(), reverse = "";
		int i = s.length() - 1;
		while (i >= 0) {
			reverse += s.charAt(i);
			i--;
		}
		System.out.println("Reversed string: " + reverse);
	}

}
