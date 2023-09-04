
//In a program,input the side of a square.You have to output the area of the square.

package solutions.variables_and_data_types;

	import java.util.*;
public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.print("enter the side of square");
		int a=sc.nextInt();
		
		int area= a*a;
		System.out.println("the area is "+area);

	}

}
