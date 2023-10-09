package com.CodSoft.Task1;

import java.util.Random;
import java.util.Scanner;

public class MultipleRounds {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true) {
			PlayRound(sc);
		
			System.out.print("Do you want to play again? (YES/NO) : ");
			String playAgain= sc.next().toUpperCase();
			if(playAgain.equals("NO")) {
				
				System.out.println();
				System.out.println("Thank you for playing! :)");
				break;
			}
		}
		
	
	}
	
	
	public static void PlayRound(Scanner sc) {
		int maxAttempts =10;
		int attempt=1;
		Random random = new Random();
		int number = random.nextInt(100) + 1;
		while (attempt<=maxAttempts) {
			System.out.println("Attempt "+attempt+"/"+maxAttempts);
			
			
			System.out.print("Guess the Number between 1 to 100 : ");
			
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
