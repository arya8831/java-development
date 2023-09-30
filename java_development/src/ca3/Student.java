package ca3;

public class Student {
	String name;
	int age;
	public void info() {
		System.out.println("name is "+this.name);
		System.out.println("age is "+this.age);

	}
	Student(){
		//default constructor
	}
	
	Student(String name1, int age1){
		//paramiterized constructors
		this.name=name1;
		this.age=age1;
	}
	Student(Student s3){
		// copy constructor
		this.name=s3.name;
		this.age=s3.age;
	}
}
