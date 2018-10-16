package com.jason;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu = new Student("Hank", 70, 90);
		stu.print();
		
		System.out.println(5 >= 9);
		String s1 = new String("abc");
		String s2 = new String("abc");
		System.out.println(s1 == s2);
		
		String s1 = "abc";
		String s2 = "abc";
		System.out.println(s1 == s2);
		
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
