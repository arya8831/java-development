package operators;
	import java.util.*;
public class Arithmatic_operators {

	public Arithmatic_operators() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
	
		//BINARY OPERATOR
		
		System.out.print("enter 1st number");
		int a=sc.nextInt();
		
		
		System.out.print("enter 2nd number");
		int b=sc.nextInt();
		
		int sum= a+b;
		System.out.println("sum is"+sum);
		int sub=a-b;
		System.out.println("subtraction is"+sub);
		int mul=a*b;
		System.out.println("multiplication is "+mul);
		int div=a/b;
		System.out.println("division is"+div);
		int modu=a%b;
		System.out.println("modulo is "+modu);
	
	//UNARY OPERATOR a++, a-- etc
		int c=--a;
		int d=++b;
		System.out.println(c);
		System.out.println(d);
	}

}
