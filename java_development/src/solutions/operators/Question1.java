//

package solutions.operators;
import java.util.*;
import java.lang.*;
public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        int[][]arr = new int [4][];
	        arr[0]=new int [4];
	        arr[1]=new int [2];
	        arr[2]=new int [5];
	        arr[3]=new int [4];
	        for(int i=0;i<4;i++)
	        {
	            for(int j=0;j<arr[i].length;j++)
	            {
	                arr[i][j]=sc.nextInt();
	            }
	        }
	        for(int i=0;i<4;i++)
	        {
	            for(int j=0;j<arr[i].length;j++)
	            {
	                System.out.print(arr[i][j]+" ");
	            }
	            System.out.println();
	        }

	}

}

