package ca3;
	import java.util.*;
public class Pen_impl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pen pen1=new Pen();
		//Pen pen2=new Pen();
		Scanner sc= new Scanner(System.in);
		System.out.print("enter colour of pen");
		String a=sc.next();
		System.out.print("enter type of pen");
		String b=sc.next();
		pen1.colour= a;
		pen1.type=b;
		pen1.info();
	}

}
