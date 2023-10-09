package com.codesoft;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		double balance = 1000;

		ATM_System atm= new ATM_System(balance);
		Scanner sc = new Scanner(System.in);

		while (true) {
			atm.displayMenu();
			System.out.print("Enter your option: ");
			int option = sc.nextInt();
			atm.processOption(option);
			System.out.println();
		}
	}
}
