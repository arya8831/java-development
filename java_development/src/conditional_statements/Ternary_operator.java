package conditional_statements;

import java.util.Scanner;

public class Ternary_operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter 1st number");
		int a=sc.nextInt();
		
		
		System.out.print("enter 2nd number");
		int b=sc.nextInt();
		
		int larger=(a>b)?a:b;
		System.out.println(larger);
		
	}

}
