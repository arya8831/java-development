//implementation of abstraction by interface and multiple inheritance

package ca3;

import java.util.Scanner;

interface Animal1{

	abstract void walk();
	
}

interface Herbivore{
	public void eats();
}
interface Carnivore{
	public void eats();
}
class Horse1 implements Animal1,Herbivore{
	
	Horse1(){
		System.out.println("you created a horse");

	}
	public void walk() {
		System.out.println("walks on 4 legs");
		
	}
	public void eats() {
		System.out.println(" eats grass");
	}
	
}

class Human1 implements Animal1 , Carnivore{
	
	Human1(){
		System.out.println("you created a human");

	}
	public void walk() {
		System.out.println("walks on 2 legs");
		
	}
	public void eats() {
		System.out.println("eats meat");
	}
	
}
public class Interface_file{
	
	public static void main(String args[]) {
		
		Horse1 h1= new Horse1();
		h1.walk();
		h1.eats();
		
		Human1 hu1=new Human1();
		hu1.walk();
		hu1.eats();
	}
}