package javaProgramming;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the Month Number  : ");
		int month_num = input.nextInt();

		System.out.println("Enter the room rent: ");
		float rent_per_day = input.nextFloat();

		System.out.println("Enter the No of Days  : ");
		int no_of_days = input.nextInt();

		float amount;
		switch (month_num) {
		case 1:
			amount = (rent_per_day * no_of_days);
			System.out.print("Amount: " + amount);
			break;
		case 2:
			amount = (rent_per_day * no_of_days);
			System.out.print("Amount: " + amount);
			break;
		case 3:
			amount = (rent_per_day * no_of_days);
			System.out.print("Amount: " + amount);
			break;
		case 4:
			amount = (float) (((rent_per_day * 0.20) + (rent_per_day)) * (no_of_days));
			System.out.print("Amount: " + amount);
			break;
		case 5:
			amount = (float) (((rent_per_day * 0.20) + (rent_per_day)) * (no_of_days));
			System.out.print("Amount: " + amount);
			break;
		case 6:
			amount = (float) (((rent_per_day * 0.20) + (rent_per_day)) * (no_of_days));
			System.out.print("Amount: " + amount);
			break;
		case 7:
			amount = (rent_per_day * no_of_days);
			System.out.print("Amount: " + amount);
			break;
		case 8:
			amount = (rent_per_day * no_of_days);
			System.out.print("Amount: " + amount);
			break;
		case 9:
			amount = (rent_per_day * no_of_days);
			System.out.print("Amount: " + amount);
			break;
		case 10:
			amount = (rent_per_day * no_of_days);
			System.out.print("Amount: " + amount);
			break;
		case 11:
			amount = (float) (((rent_per_day * 0.20) + (rent_per_day)) * (no_of_days));
			System.out.print("Amount: " + amount);
			break;
		case 12:
			amount = (float) (((rent_per_day * 0.20) + (rent_per_day)) * (no_of_days));
			System.out.print("Amount: " + amount);
			break;
		default:
			System.out.println("Month number is invalid" + no_of_days);
			break;

		}
	}

}
