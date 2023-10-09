package com.codesoft;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class WordCounter {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        System.out.println("Choose an option:");
        System.out.println("1. Enter text");
        System.out.println("2. Provide file path");

        int choice = scanner.nextInt();
        scanner.nextLine(); 
        
        String inputText = "";
        
        try {
        	switch (choice) {
    		
            case 1:
            	System.out.print("Enter your text: ");
                inputText = scanner.nextLine();
            	break;
            case 2:
            	 System.out.print("Enter the file path: ");
                 String filePath = scanner.nextLine();
                 inputText = readFromFile(filePath);
                 break;
            	
    		default:
    			System.out.println("Invalid option! Choose correct option.");
    		}
        	
        	 int wordCount = countWords(inputText);
             System.out.println("Number of words: " + wordCount);
             
             
		} catch (Exception e) {
			System.out.println("Invalid option! try again");
		}
       
        
	}
	
	public static int countWords(String text) {
        if (text == null || text.trim().isEmpty()) {
            return 0;
        }

        String[] words = text.split("\\s+");
        return words.length;
    }
	   public static String readFromFile(String filePath) {
	        StringBuilder content = new StringBuilder();
	        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
	            String line;
	            while ((line = reader.readLine()) != null) {
	                content.append(line).append("\n");
	            }
	        } catch (IOException e) {
	            System.out.println("Something went wrong while reading the file.");
	            e.printStackTrace();
	        }
	        return content.toString();
	    }

}
