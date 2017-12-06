
import java.util.*;
public class CalCalcator {
	
	    public static void main(String[] args) {
	        Scanner sc=new Scanner(System.in);
	        int t = sc.nextInt();
	        for(int i=0;i<t;i++){
	            int sum = 0;
	            int total_sum = 0;
	            int asize = sc.nextInt();
	            int arr[] = new int[asize];
	            for(int j=0;j<asize;j++){
	                arr[j] = sc.nextInt();
	            }
	            int temp = arr[0];
	            arr[0] = arr[1];
	            arr[1] = temp;
	            for(int j=0;j<asize;j++){
	                total_sum += 2*sum+arr[j];
	                sum += arr[j];
	            }
	            System.out.println(total_sum);
	        }
	      }
	   }
