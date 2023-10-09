package com.CodSoft.Task1;

import java.util.Random;

public class RandomCodeGenerate {
public static void main(String[] args) {
	Random random= new Random();
	int randomValue=random.nextInt(100)+1;
	System.out.println("Your Random Value is : "+randomValue);
}
	
}
