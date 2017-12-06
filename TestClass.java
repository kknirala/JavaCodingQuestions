/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;
*/
import java.util.Random;
import java.util.Scanner;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in); 
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0;i<N;i++)
        {
        	Random rand = new Random();
        	int  n = rand.nextInt(10000) + 1;
            arr[i] = n;
        }
       
        int[] estimatedPoint = new int[N-1];
        for(int j=0;j<N-1;j++)
        {
        	Random rand = new Random();
        	int  n = rand.nextInt(10000) + 1;
            int point = n;
            if(point<=arr[j+1])
            {
                 estimatedPoint[j] = point;
            }
        }
        
        int alicePoints = arr[1]+estimatedPoint[0];
        int bobPoints = arr[2]+estimatedPoint[1];
        int maxPoints=0;
        if(alicePoints>=bobPoints)
        {
            maxPoints=alicePoints;
        }
        else
        {
            maxPoints=bobPoints;
        }
        
        int req2win = maxPoints-arr[0];
        if(req2win>=arr[0]*2)
        {
            System.out.println("0");
        }
        else
        {
            System.out.println(req2win);
        }
    }
}
