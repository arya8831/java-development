package conditional_statements;

import java.util.Scanner;

public class Odd_even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		System.out.print("enter 1st number");
		int a=sc.nextInt();
		
		if(a%2==0) {
			System.out.println("even");
		}
		else {
			System.out.println("odd");
		}
		
	}

}
