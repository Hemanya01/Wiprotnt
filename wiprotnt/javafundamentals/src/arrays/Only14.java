package arrays;
import java.util.Scanner;
public class Only14 {
	 public static void main(String[] args) 
	 {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int[] arr = new int[n];
	        System.out.println("Enter Array Elements:");
	        for (int i=0;i<n;i++) 
	        {
	            arr[i]=sc.nextInt();
	        }
	        boolean f=true;
	        for (int i=0;i<n;i++) 
	        {
	            if (arr[i]!=1 && arr[i]!=4) 
	            {
	                f=false;
	                break;
	            }
	        }
	        System.out.println(f);
	        sc.close();
	    }
}
