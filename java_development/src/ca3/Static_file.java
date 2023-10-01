//implementation of static

package ca3;
import java.util.*;
class Student1{
	String name;
	static String school;
	Student1(String name){
		this.name=name;
		this.school=school;	
	}
	public void info() {
		System.out.println("name is "+this.name);
		System.out.println("school "+this.school);

	}
}

public class Static_file{
	
	public static void main(String arge[]) {
		String name,name2;
		Student1.school="ndp";
		Scanner sc=new Scanner(System.in);
		System.out.print("enter name");
		name=sc.next();
		Student1 s1=new Student1(name);
		s1.info();

		System.out.print("enter name");
		name2=sc.next();
		Student1 s2=new Student1(name2);
		s2.info();
		
	}
}