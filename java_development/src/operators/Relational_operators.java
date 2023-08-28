package operators;
	import java.util.*;
public class Relational_operators {

	public Relational_operators() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		System.out.print("enter 1st number");
		int a=sc.nextInt();
		
		
		System.out.print("enter 2nd number");
		int b=sc.nextInt();

		System.out.println(a==b);
		System.out.println(a!=b);
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a>=b);
		System.out.println(a<=b);
	}

}
