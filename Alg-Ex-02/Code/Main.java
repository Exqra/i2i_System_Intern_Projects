package alg2;

import java.util.Scanner;
public class Main {
	
	public static void main(String[] args)
	{
		String inputWord;
		String lowerCaseInputWord;
		int wordSize;
		boolean exit = false;
		
		Scanner sc = new Scanner( System.in);
		
		printMessage( "Please enter a word: ");
		inputWord = sc.next();
		lowerCaseInputWord = inputWord.toLowerCase();
		wordSize = lowerCaseInputWord.length();
		
		int index = 0;
		boolean isPalindrome = true;
		while(!exit && index < (wordSize / 2))
		{
			if( lowerCaseInputWord.charAt(index) != lowerCaseInputWord.charAt( wordSize - 1 - index))
			{
				exit = true;
				isPalindrome = false;
			}
			index ++;
		}
		
		if( isPalindrome)
			printMessage( inputWord + " is a palindrome");
		else
			printMessage( inputWord + " is not a palindrome");

	}
	public static void printMessage( String message)
	{
		System.out.println( message);

	}
}
