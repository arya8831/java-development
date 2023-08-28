package operators;
	import java.util.*;
public class Logica_operatorsl {

	public Logica_operatorsl() {
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
		System.out.println((a>b) && (b<c));// && logical and operator
		System.out.println((a>b) || (b<c));// || logical or operator
		System.out.println(!(a>b));// || logical not operator
	}

}
