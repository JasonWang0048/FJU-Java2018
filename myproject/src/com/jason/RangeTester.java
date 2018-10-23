package com.jason;

import java.util.Scanner;

public class RangeTester {

	public static void main(String[] args) {
		System.out.println("Please enter a integer:");
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		boolean result = -3 <= x && x <= 5;
		System.out.println(result);

	}

}
