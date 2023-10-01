// multilevel inheritance

package ca3;
	import java.util.*;
class Shape1{
	String color;
	public void color() {
		System.out.println("the color is" +color);
	}
	
}

class Triangle1  extends Shape1{
	float l ,h;

	public void area() {
		System.out.println("the area is"+(0.5*l*h));
	}
}

class Type extends Triangle1{
	String type;
	public void type() {
		System.out.println("the type is" +type);
	}
	
}

public class Multilevel_inheritance{
	
	public static void main(String args[]) {
		
		Type t1= new Type();
		Scanner sc= new Scanner(System.in);
		System.out.print("length is");
		t1.l=sc.nextFloat();
		
		System.out.print("height is");
		t1.h=sc.nextFloat();
		System.out.print("color is");
		t1.color=sc.next();
		System.out.print("type is");
		t1.type=sc.next();
		t1.area();
		t1.color();
		t1.type();
		
	}
}