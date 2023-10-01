package ca3;

public class Method_overloading {
	String name;
	int age; 
	
	Method_overloading(String name ,int age){
		this.name=name;
		this.age=age;
	}

	
	public void info(String name) {
		System.out.println("name is "+this.name);

	}
	public void info(int age) {

		System.out.println("age is "+this.age);
	}
	public void info(String name , int age) {
		System.out.println("name is "+this.name);
		System.out.println("age is "+this.age);
	}
}
