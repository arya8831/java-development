package conditional_statements;
	import java.util.*;
public class Largest_of_2_numbers {
	

	 public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	
	System.out.println("enter 1st number");
	int a=sc.nextInt();
	
	
	System.out.print("enter 2nd number");
	int b=sc.nextInt();
	
	if(a>b) {
		System.out.println("a is greater than b");
		}
	else {
		System.out.println("b is greater than a");
		}

	}
}