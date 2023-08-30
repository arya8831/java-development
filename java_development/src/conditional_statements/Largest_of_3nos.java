package conditional_statements;

import java.util.Scanner;

public class Largest_of_3nos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter 1st number");
		int a=sc.nextInt();
		
		
		System.out.print("enter 2nd number");
		int b=sc.nextInt();
		
		System.out.print("enter 3rd number");
		int c=sc.nextInt();
		
		if(a>b &&a>c) {
			System.out.println("a is greatest");
			}
		else if(b>c &&b>a){
			System.out.println("b is greatest");
			}
		else {
			System.out.println("c is greatest");

		}
	}

}
