package com.jason;

import java.util.Random;
import java.util.Scanner;

public class Exam3Review {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		Random random = new Random();
		int number = random.nextInt(9) + 1;
		System.out.println(number);
		System.out.println("Guess a number between 1 to 10.");
		System.out.print("Your guess: ");
		Scanner guess = new Scanner(System.in);
		int num = guess.nextInt();
		int chances = 1;
		while(num != number) {
			if(num < number) {
				System.out.println("higher");
			}
			else {
				System.out.println("lower");
			}
			chances += 1;
			System.out.print("Your guess: ");
			num = guess.nextInt();
		}
		if(chances <= 2) {
			System.out.print("Excellent! The secret number is " + number);
		}
		else {
			System.out.print("Great! The secret number is " + number);
		}
	}
}
