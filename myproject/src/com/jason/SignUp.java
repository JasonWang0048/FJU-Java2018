package com.jason;

import java.util.Scanner;

public class SignUp {

	public static void main(String[] args) {
		System.out.println("Are you above 18? (y/n)");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		boolean adult = line.toUpperCase().equals("Y");
//		boolean adult = line.equalsIgnoreCase(line);
		
		if (adult) {
			System.out.print("Please enter your age:");
			int age = scanner.nextInt();
			scanner.nextLine();
			System.out.print("Please enter your name:");
			String name = scanner.nextLine();
			System.out.print("Please enter your nickname:");
			String nickname = scanner.nextLine();
			System.out.println(age + "/" + name + "/" + nickname);
		}
		else {
			System.out.println("xxxxxx, bye!");
		}
	}
}
