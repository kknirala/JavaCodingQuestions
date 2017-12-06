import java.io.*;
import java.util.*;
import java.util.Arrays;

public class TestClass1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        for(int t_i=0; t_i<T; t_i++)
        {
            String P = br.readLine();
            String Q = br.readLine();
            int cost_size = Integer.parseInt(br.readLine().trim());
            String[] arr_cost = br.readLine().split(" ");
            int[] cost = new int[cost_size];
            for(int i_cost=0; i_cost<arr_cost.length; i_cost++)
            {
            	cost[i_cost] = Integer.parseInt(arr_cost[i_cost]);
            }

            int out_ = amount_to_pay(Q, P, cost);
            System.out.println(out_);
         }

         wr.close();
         br.close();
    }
    static int amount_to_pay(String Q, String P, int[] cost){
        boolean meet = false;
        int k = 0, costInd = 0, to_pay = 0;
		char trav[] =  P.toCharArray();
		int i = 0;
		while(i<trav.length){
		    meet = false;
		    k = 0;
		    if(Q.charAt(k) == trav[i]){
		        int cin = i;
		        k++; cin++;
		        for(;k<Q.length();k++){
		            if(Q.charAt(k) == trav[cin]){
		                cin++;
		                meet = true;
		            }
		            else{
		                meet = false;
		                break;
		            }
		        }
		    }
		    if(meet){
		    	System.out.println(i);
		        to_pay = to_pay + cost[i+1];
		        i = i + Q.length();
		    }
		   i++;
		    
		}
		return to_pay;
    }
    
}