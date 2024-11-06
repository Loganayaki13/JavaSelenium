package javaIntro;

import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the integer number : ");
		int num = input.nextInt(), count = 0;

		while (num > 0) {
			num /= 10;
			count++;

		}
		System.out.println("Ineger number count :" + count);
	}

}
