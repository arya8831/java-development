//Hybrid inheritance

package ca3;
	import java.util.*;
class Shape3{
	String color;
	public void color() {
		System.out.println("the color is" +color);
	}
	
}
class Circle3 extends Shape3{
	float  r;

	public void area() {
		System.out.println("the area is"+(3.14*r*r));
	}
	
}

class Triangle3  extends Shape3{
	float l ,h;

	public void area() {
		System.out.println("the area is"+(0.5*l*h));
	}
}

class Type3 extends Triangle3{
	String type;
	public void type() {
		System.out.println("the type is " +type);
	}
	
}

public class Hybrid_inheritance{
	
	public static void main(String args[]) {
		
		Scanner sc= new Scanner(System.in);
		Circle3 c1=new Circle3();
		
		System.out.print("radius is");
		c1.r=sc.nextFloat();
		System.out.print("color is");
		c1.color=sc.next();
		
		c1.color();
		c1.area();
		
		
		Triangle3 t1= new Triangle3();
		System.out.print("length is");
		t1.l=sc.nextFloat();
		
		System.out.print("height is");
		t1.h=sc.nextFloat();
		System.out.print("color is");
		t1.color=sc.next();
		
		t1.area();
		t1.color();
		
		Type3 t2 =new Type3();
		System.out.println("type3 is child of triangle3 , which is child of shape3");
		System.out.print("length is");
		t2.l=sc.nextFloat();
		System.out.print("height is");
		t2.h=sc.nextFloat();
		System.out.print("color is");
		t2.color=sc.next();
		System.out.print("type is ");
		t2.type=sc.next();
		
		t2.area();
		t2.color();
		t2.type();
		
	}
}