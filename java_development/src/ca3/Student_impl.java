package ca3;
	import java.util.*;
public class Student_impl {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("enter name :");
		 String name=sc.next();
		System.out.print("enter age :");
		 int age=sc.nextInt();
		 //paramiterized constructors
		Student s1=new Student(name, age);
		s1.info();
		
		// copy constructor
		Student s2=new Student();
		s2.name="shantu";
		s2.age=55;
		s2.info();
		Student s3=new Student(s2);
		s3.info();
		

	}

}
