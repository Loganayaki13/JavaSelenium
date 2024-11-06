package expectionsErrorHandle;

import java.util.ArrayList;
import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		ArrayList<String> a=new ArrayList<>();
		
		//add
		System.out.println("Enter the String values : ");
		for(int i=0;i<5;i++)
		{
			a.add(input.nextLine());
			
		}
		// before remove
		System.out.println("Before remove "+a);
		
		//after remove
		a.removeAll(a);
		System.out.println("After remove "+a);
	}

}
