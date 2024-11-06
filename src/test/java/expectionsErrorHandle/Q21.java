package expectionsErrorHandle;

import java.util.Arrays;
import java.util.Scanner;

public class Q21 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int arr[] = new int[5];
		System.out.println("Enter the integer array values :");
		for (int i = 0; i < 5; i++) {
			arr[i] = input.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		// ArrayIndexOutBoundsException
		System.out.println(arr[5]);
	}

}
