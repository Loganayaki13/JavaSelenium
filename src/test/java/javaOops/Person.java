package javaOops;

import java.util.Scanner;

public class Person {
	
	
	public Person (String name) {
		System.out.println("Name:"+name);
		
	}
	public Person (int age) {
		System.out.println("Age:"+age);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the name :");
		
		Person p1=new Person(input.nextLine());
		
        System.out.println("Enter the age :");
		
		Person p2=new Person(input.nextInt());
	}
	
	
	
}


