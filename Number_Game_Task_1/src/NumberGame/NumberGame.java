package NumberGame;

import java.util.Random;
import java.util.Scanner;

public class NumberGame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int totalScore = 0;

		while (true) {
			int score = PlayRound(sc);

			System.out.println("Your Score is " + score);

			System.out.print("Do you want to play again? (YES/NO) : ");
			String playAgain = sc.next().toUpperCase();
			if (playAgain.equals("NO")) {

				System.out.println();
				System.out.println("Thank you for playing! :)" + "\n" + "Your Totale Score is " + totalScore);
				break;
			}
		}

	}

	public static int PlayRound(Scanner sc) {
		int maxAttempts = 10;
		int attempt = 1;
		int score = 0;
		Random random = new Random();
		int number = random.nextInt(100) + 1;
		while (attempt <= maxAttempts) {
			try {
				System.out.println("Attempt " + attempt + "/" + maxAttempts);

				System.out.print("Guess the Number between 1 to 100 : ");

				int num = sc.nextInt();
				if (num == number) {
					System.out.println("Congratulations! Your guess is right");
					score = maxAttempts - attempt + 1;

					break;
				} else if (num > number) {
					System.out.println("Your guess is too High, the Number was ");
				} else {
					System.out.println("Your guess is too Low, the Number was ");
				}
				attempt++;
				System.out.println();
			} catch (Exception e) {
				System.out.println();
				System.out.println("Invalid input. Please Enter a valid Number");
				System.out.println();
				sc.nextLine();
			}

		}
		if (attempt > maxAttempts) {
			System.out.println("You have Reached the maximum Attempts. The Number was " + number);
		}
		return score;

	}
}
