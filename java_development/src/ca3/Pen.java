package ca3;

public class Pen {
	public String type;
	public String colour;
	Pen(){
		System.out.println("default constructor");
	}
	
	public void write() {
		System.out.println("write something");
	}
	
	public void info() {
		System.out.println(this.colour);
		System.out.println(this.type);

	}
	

}
