//abstraction using abstract class

package ca3;

import java.util.Scanner;

abstract class Animal{
	Animal(){
		System.out.println("you are using constructor of animal");
	}
	abstract void walk();
	public void eats() {
		System.out.println("animal eats");
	}
}

class Horse extends Animal{
	
	Horse(){
		System.out.println("you created a horse");

	}
	public void walk() {
		System.out.println("walks on 4 legs");
		
	}
	
}

class Human extends Animal{
	
	Human(){
		System.out.println("you created a human");

	}
	public void walk() {
		System.out.println("walks on 2 legs");
		
	}
	
}
public class Abstract_file{
	
	public static void main(String args[]) {
		
		Horse h1= new Horse();
		h1.walk();
		
		Human hu1=new Human();
		hu1.walk();
	}
}