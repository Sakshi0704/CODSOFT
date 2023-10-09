package com.CodSoft.Task1;

import java.util.Random;
import java.util.Scanner;

public class FindCorrectGuess {
	public static void main(String[] args) {

//		System.out.println(number);

		while (true) {
			Random random = new Random();
			int number = random.nextInt(100) + 1;
			System.out.print("Guess the Number between 1 to 100 : ");
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			if (num == number) {
				System.out.println("Congratulations! Your guess is right");
				break;
			} else if (num > number) {
				System.out.println("Your guess is too High, the Number was " + number);
			} else {
				System.out.println("Your guess is too Low, the Number was " + number);
			}
		}
	}

}
