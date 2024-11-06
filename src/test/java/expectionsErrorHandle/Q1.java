package expectionsErrorHandle;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the two numbers: ");
		int a=input.nextInt(),b=input.nextInt();
		try
		{
			System.out.println("a/2 :"+(a/2));
			System.out.println((b/0));
		}
		catch(Exception e)
		{
			System.out.println("Exception :"+e);
		}
		
		

	}

}
