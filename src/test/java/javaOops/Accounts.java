package javaOops;

import java.util.Scanner;

public class Accounts {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the total amount : ");
		Accounts acc = new Accounts(input.nextInt());
		System.out.println("Enter the withdraw amount : ");
		Accounts.withdraw(input.nextInt());
		System.out.println("Enter the deposit amount : ");
		Accounts.deposit(input.nextInt());
		System.out.println("Checking the balance : Enter the withdraw & deposit amount ");
		Accounts.balance(input.nextInt(), input.nextInt());
	}

	static int a, b;

	public Accounts() {
		this.a = 30000;
	}

	public Accounts(int a) {
		this.a = a;
	}

	// withdraw
	public static void withdraw(int b) {
		System.out.println("Withdraw amount : " + b);
		int a = -b;
	}

	// deposit
	public static void deposit(int c) {
		System.out.println("Deposit amount : " + c);
		int a = +c;
	}

	// balance
	public static void balance(int b, int c) {
		System.out.println("Balance : " + (a - b + c));
	}
}
