//Hierarchical inheritance

package ca3;
	import java.util.*;
class Shape2{
	String color;
	public void color() {
		System.out.println("the color is" +color);
	}
	
}
class Circle2 extends Shape2{
	float  r;

	public void area() {
		System.out.println("the area is"+(3.14*r*r));
	}
	
}

class Triangle2  extends Shape1{
	float l ,h;

	public void area() {
		System.out.println("the area is"+(0.5*l*h));
	}
}

public class Hierarchical_inheritance{
	
	public static void main(String args[]) {
		
		Scanner sc= new Scanner(System.in);
		Circle2 c1=new Circle2();
		
		System.out.print("radius is");
		c1.r=sc.nextFloat();
		System.out.print("color is");
		c1.color=sc.next();
		c1.color();
		c1.area();
		
		
		Triangle2 t1= new Triangle2();
		System.out.print("length is");
		t1.l=sc.nextFloat();
		
		System.out.print("height is");
		t1.h=sc.nextFloat();
		System.out.print("color is");
		t1.color=sc.next();

		t1.area();
		t1.color();		
	}
}