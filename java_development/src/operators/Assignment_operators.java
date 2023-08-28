package operators;
	import java.util.*;
public class Assignment_operators {

	public Assignment_operators() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.print("enter 1st number");
		int a=sc.nextInt();
		
		
		System.out.print("enter 2nd number");
		int b=sc.nextInt();

		System.out.print("enter 3rd number");
		int c=sc.nextInt();
		
		System.out.print("enter 4th number");
		int d=sc.nextInt();
		
		a+=10;//a=a+10
		b-=10;//b=b-10
		c*=10;//c=c*10
		d/=5;//d=d/5
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}

}
