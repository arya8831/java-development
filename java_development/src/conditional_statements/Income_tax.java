package conditional_statements;

	import java.util.*;
public class Income_tax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		float tax;
		System.out.print("enter your income");
		int income=sc.nextInt();
		
		if(income<=500000) {
			tax=0;
		
		}
		else if((income >500000)&& (income<=1000000)) {
			tax=income*0.2f;
			
		}
		else {
			tax=income*0.3f;
			
		}
		System.out.println("tax is "+tax);
	}

}
