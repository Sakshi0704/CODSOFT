package com.CodSoft.Task1;

import java.util.Random;
import java.util.Scanner;

public class LimitAttempts {
	public static void main(String[] args) {

//		System.out.println(number);
		int maxAttempts =10;
		int attempt=1;
		Random random = new Random();
		int number = random.nextInt(100) + 1;
		while (attempt<=maxAttempts) {
			System.out.println("Attempt "+attempt+"/"+maxAttempts);
			
			
			System.out.print("Guess the Number between 1 to 100 : ");
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			if (num == number) {
				System.out.println("Congratulations! Your guess is right");
				break;
			} else if (num > number) {
				System.out.println("Your guess is too High, the Number was ");
			} else {
				System.out.println("Your guess is too Low, the Number was ");
			}
			attempt++;
			System.out.println();
		}
		if(attempt>maxAttempts)
			System.out.println("You have Reached the maximum Attempts. The Number was "+number);
		
	}
}
