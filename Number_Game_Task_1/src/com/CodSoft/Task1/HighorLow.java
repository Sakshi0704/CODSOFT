package com.CodSoft.Task1;

import java.util.Random;
import java.util.*;

public class HighorLow {
	public static void main(String[] args) {
		Random random= new Random();
		int number=random.nextInt(100)+1;
//		System.out.println(number);
		
		System.out.print("Guess the Number between 1 to 100 : ");
		Scanner sc= new Scanner(System.in);
		int num= sc.nextInt();
		if(num==number) {
			System.out.println("Congratulations! Your guess is right");
		}
		else if(num>number) {
			System.out.println("Your guess is too High, the Number was "+number);
		}
		else {
			System.out.println("Your guess is too Low, the Number was "+number);
		}
	}

}
