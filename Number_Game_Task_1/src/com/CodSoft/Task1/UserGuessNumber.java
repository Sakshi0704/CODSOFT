package com.CodSoft.Task1;

import java.util.Random;
import java.util.Scanner;

public class UserGuessNumber {

	public static void main(String[] args) {
		Random random= new Random();
		int randomNumber=random.nextInt(100)+1;
		
		System.out.print("Enter your Guess Number between 1 to 100 : ");
		Scanner sc= new Scanner(System.in);
		
		int num=sc.nextInt();
		
		if(num==randomNumber) {
			System.out.println("Congratulation! Your guess is correct.");
		}
		else {
			System.out.println("Oops! Your guess is incorrect, the Random Value is "+randomNumber);
		}
		
	}
}
