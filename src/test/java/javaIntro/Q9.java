package javaIntro;

import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the age : ");
		int age = input.nextInt();
		if (age >= 60) {
			System.out.println("Senior Citizen");
		} else {
			System.out.println("Not an Senior Citizen");
		}

	}

}
