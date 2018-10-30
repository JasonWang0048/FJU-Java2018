package com.jason;

import java.util.Random;
import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int start = 1;
//		Random random = new Random();
//		System.out.println("Please guess a number:");
//		Scanner num = new Scanner(System.in);
//		while(random != num) {
			
//		}
		
		
		System.out.print("Please enter temperature(Celsius):");
		Scanner scanner = new Scanner(System.in);
		double c = scanner.nextDouble();
		Temperature temp = new Temperature(c);
		System.out.printf("%.1f C = %.1f F\nKelvin: %.1f K\n", c, temp.fahreheit(), temp.kelvin());
		
//		Exercise 3.2
//		System.out.println("Please enter a Celsius:");
//		Scanner scanner = new Scanner(System.in);
//		double c = scanner.nextDouble();
//		double f = (c * (9 / 5.0)) + 32;
//		System.out.printf("%.1f C = %.1f F", c, f);
		
		int n = 3 / 5;
		System.out.println(n);
		float m = 3 / 5.0f;
		System.out.println(m);
		int x = 7 / 3;
		System.out.println(x);
		float y = 7.0f / 3;
		System.out.println(y);
		float z = 87.878787f;
		System.out.printf("Welcome, %s. Your grade: %.2f\n", "Jason", z);
		
//		Scanner scanner = new Scanner(System.in);
//		String x = scanner.nextLine();
//		System.out.println(x);
		
		Student stu = new Student("Hank", 70, 90);
		stu.print();
		
		System.out.println(5 >= 9);
		String s1 = new String("abc");
		String s2 = new String("abc");
		System.out.println(s1 == s2);
		
//		String s1 = "abc";
//		String s2 = "abc";
//		System.out.println(s1 == s2);
		
		Person  p = new Person(49.5f, 1.7f);
//		p.weight = 49.5f;
//		p.height = 1.7f;
		System.out.println(p.bmi());
		p.hello();
//		Person jason = new Person();
//		Person jack = null;
//		jack.hello();
		
		
		/*System.out.println("Hello World!");
		int age = 19;
		String name = "Jason";
		float height = 169.5f;
		float weight = 49.5f;
		int schoolYear = 107;
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(height);
		System.out.println(weight);
		System.out.println(schoolYear);*/
	}

}
