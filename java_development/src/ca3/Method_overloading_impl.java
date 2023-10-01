package ca3;

import java.util.Scanner;

public class Method_overloading_impl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("enter name :");
		 String name=sc.next();
		System.out.print("enter age :");
		 int age=sc.nextInt();
		 Method_overloading s1= new Method_overloading(name ,age);
			s1.name=name;
			s1.age=age;
			//s1.info(name , age);
			System.out.println("age is "+s1.age);
			
	}
	
	

}
