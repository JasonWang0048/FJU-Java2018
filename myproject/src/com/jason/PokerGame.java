package com.jason;

import java.util.Random;

public class PokerGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		int number = random.nextInt(12) + 1;
		System.out.print(number);
		int color = random.nextInt(3);
		switch(color) {
		case 0:
			System.out.print("S");
			break;
		case 1:
			System.out.print("H");
			break;
		case 2:
			System.out.print("D");
			break;
		case 3:
			System.out.print("C");
			break;
		}
	}

}