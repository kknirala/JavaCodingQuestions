import java.awt.List;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MonkMonster {
	 public static void main(String[] args) throws IOException {
	       Scanner sc=new Scanner(System.in);
	       int n=sc.nextInt(); // no of test cases
	       int i,ele,j,k,len;
	       String str,s;
	       for(i=0;i<n;i++)
	       {//14 12 11 10 9 6 3 2 1
	            str=sc.next(); // p MONK
	            len=str.length();
	           s=sc.next(); //Q Monster
	           ele=sc.nextInt(); // N array size
	           int arr[]=new int[ele]; // coin array
	           ArrayList<Integer> li=new ArrayList<Integer>();
	           for(j=0;j<ele;j++)
	                arr[j]=sc.nextInt(); // coins values
	            int index=str.indexOf(s); 
	         //  System.out.println(index);
	            if(index>=0)
	            {
	            li.add(arr[index]);
	         for(k=index+1;k<len;k+=index+(s.length()-1))
	            {
	                index=str.indexOf(s,k);
	              //  System.out.println("k= "+k+"index= "+index);
	                li.add(arr[index]);
	            }
	           
	           
	            Collections.sort(li);
	            System.out.println(li.get(li.size()-1)+li.get(li.size()-2));
	            }
	       else
	            System.out.println("0");
	            li.clear();
	            index=0;

	           
	       }
	    }
}
