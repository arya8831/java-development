package conditional_statements;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter 1st number");
		int a=sc.nextInt();
		
		
		System.out.print("enter 2nd number");
		int b=sc.nextInt();
		
		System.out.print("enter choice");
		String ch= sc.next();
		
		switch(ch) {
		
		case "+" :
			System.out.println(a+b);
			break;
		case "-":
			System.out.println(a-b);
			break;
		case "/":
			System.out.println(a/b);
			break;
		case "%":
			System.out.println(a%b);
			break;
		default:
			System.out.println("enter correct choice");
		}
		
	}

}
