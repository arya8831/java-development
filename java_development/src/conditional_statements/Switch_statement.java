package conditional_statements;

import java.util.Scanner;

public class Switch_statement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		System.out.print("enter choice between 1 to 4");
		int a=sc.nextInt();
		
		switch(a) {
		case 1:
			System.out.println("choice 1");
			break;
		case 2:
			System.out.println("choice 2");
			break;
		case 3:
			System.out.println("choice 3");
			break;
		case 4:
			System.out.println("choice 4");
			break;
		default :
			System.out.println("enter correcr choice");
		}
	}

}
