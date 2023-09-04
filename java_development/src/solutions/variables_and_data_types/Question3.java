/* Enter cost of 3 items from the user(using float data type)- a pencil,a pen and an eraser.
 *  You have to output the total cost of the items back to the user as their bill 
 * also add 18% gst tax to the items in the bill */

package solutions.variables_and_data_types;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
		
		System.out.print("cost of pencil");
		int a=sc.nextInt();
		
		
		System.out.print("cost of pen");
		int b=sc.nextInt();
		
		System.out.print("cost of eraser");
		int c=sc.nextInt();
		
		float d=(a+b+c);
		System.out.println("the total is"+d);
		d=d+(d*0.18f);
		System.out.println("the total incl of gst  is"+d);

	}

}
