package com.codesoft;

import java.util.Scanner;

public class ATM_System {
	private double balance;

	public ATM_System(Double balance) {
		super();
		this.balance = balance;
	}

	public void displayMenu() {
		System.out.println("Choode one option : ");
		System.out.println("1. For Checke balance");
		System.out.println("2. For Withdraw");
		System.out.println("3. For Deposit");
		System.out.println("4. For Exit");
	}

	public void processOption(int option) {
		switch (option) {
		case 1:
			checkBalance();
			break;
		case 2:
			withdraw();
			break;
		case 3:
			deposit();
			break;
		case 4:
			System.out.println("=-=-=-=-=-=-=-=-=-=-= Thank you for using our Services! =-=-=-=-=-=-=-=-=-=-=");
			System.exit(0);
			break;
		default:
			System.out.println("---------------- Invalid option! Choose a valid option ----------------");
		}
	}

	private void checkBalance() {
		System.out.println("************* Available balance: " + balance+"/- *************");
	}

	private void withdraw() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the amount to withdraw: ");
		double amount = sc.nextDouble();
		if (amount < balance) {
			balance = balance - amount;
			System.out.println("*********** Withdrawal successful! Available balance: " + balance+"/- *************");

		} else {
			System.out.println("*********** Insufficient balance ****************");
		}
	}

	private void deposit() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the amount to deposit: ");
		double amount = sc.nextDouble();
		balance += amount;
		System.out.println("************Deposit successful! Current balance is: " + balance+" *****************");

	}

}
