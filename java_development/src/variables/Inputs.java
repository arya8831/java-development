package variables;
 import java.util.*;

public class Inputs {

	public Inputs() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello world");
		Scanner sc = new Scanner(System.in);
		String name =sc.nextLine();
		System.out.println(name);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int sum=a+b;
		int prod=a*b;
		System.out.println(sum);
		System.out.println(prod);

	}

}