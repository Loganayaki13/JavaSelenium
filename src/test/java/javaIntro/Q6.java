package javaIntro;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number :");
		int a=input.nextInt();
		
		//factorial
		long fact=1;
		for(int i=1;i<=a;i++)
		{
			fact*=i;
			
		}
		System.out.println("Fctorial of "+a+" is "+fact);

	}

}
