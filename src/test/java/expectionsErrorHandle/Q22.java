package expectionsErrorHandle;

import java.util.Arrays;
import java.util.Scanner;

public class Q22 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the String values :");
		String arr = input.nextLine();
		System.out.println(arr);
		
		// StringIndexOutBoundsException
		System.out.println(arr.charAt(5));

	}

}
