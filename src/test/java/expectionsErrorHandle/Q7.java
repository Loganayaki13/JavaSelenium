package expectionsErrorHandle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		List<Integer> a = new ArrayList<>();

		// add values
		System.out.println("Enter the values : ");
		for (int i = 0; i < 5; i++) {
			a.add(input.nextInt());

		}
		System.out.println("List the Elements : " + a);

		// list to array
		Integer arr[] = a.toArray(new Integer[0]);
		System.out.println("Array values : " + Arrays.toString(arr));

	}

}
