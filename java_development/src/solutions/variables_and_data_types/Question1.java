//In a program,input 3 numbers:A,B and C.You have to output the average of these 3 numbers

package solutions.variables_and_data_types;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
		
		System.out.print("enter 1st number");
		int a=sc.nextInt();
		
		
		System.out.print("enter 2nd number");
		int b=sc.nextInt();
		
		System.out.print("enter 3rd number");
		int c=sc.nextInt();
		
		int d=(a+b+c)/3;
		System.out.println("the average is"+d);
	}

}
