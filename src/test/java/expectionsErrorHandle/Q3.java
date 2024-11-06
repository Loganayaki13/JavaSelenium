package expectionsErrorHandle;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) throws Exception {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the AGE :");
		int age = input.nextInt();

		if (age < 18) {
			throw new Exception("InvalidAgeException");
		} else {
			System.out.println("Age is valid");
		}

	}

}
