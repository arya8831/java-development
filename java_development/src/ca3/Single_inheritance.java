// single inheritance

package ca3;
	import java.util.*;
class Shape{
	public void area() {
		System.out.print("the area is");
	}
	
}

class Triangle extends Shape{
	float l ,h;

	public void area() {
		

		System.out.print("the area is"+(0.5*l*h));
	}
}

public class Single_inheritance{
	
	public static void main(String args[]) {
		
		Triangle t1= new Triangle();
		Scanner sc= new Scanner(System.in);
		System.out.print("length is");
		t1.l=sc.nextFloat();
		
		System.out.print("height is");
		t1.h=sc.nextFloat();
		t1.area();
		
	}
}