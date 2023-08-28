package variables;
	import java.util.*;
public class Type_casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("enter a no :");
		int e=(int)sc.nextFloat();
		System.out.println(e);
		byte b=4;
		char c='a';
		short s=512;
		int i=1000;
		float f=3.14f;
		double d=99.9954;
		
		double result = (f*b)+(i%c)-(d*s);
		System.out.println(result);
		int $=24;
		System.out.println($);
		
	}

}
