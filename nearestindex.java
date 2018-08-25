/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;
*/

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class TestClass {
    public static void main(String args[] ) throws Exception {
        
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String arraySizeAndQuery = br.readLine();                // Reading input from STDIN
     
        String elements = br.readLine();                // Reading input from STDIN
        String str=arraySizeAndQuery.replaceAll("\\s","");
        String str1=elements.replaceAll("\\s","");
        int arrayLength = str1.length();
        int lastRight=0, leftIndex=0, rightIndex=0;
        char testCases= str.charAt(1);
        for(int i=0;i<Character.getNumericValue(testCases);i++){
            String elt = br.readLine();
            String elt1 = elt.replaceAll("\\s","");
            char val = elt1.charAt(0);
            int index=Character.getNumericValue(elt1.charAt(1));
            if(val=='0'){
                leftIndex= (str1.substring(0, index)).lastIndexOf('1');
                rightIndex=(str1.substring(index, arrayLength)).indexOf('1');
                System.out.println("ok: "+leftIndex + " "+ (rightIndex+index));
            }
        }
        
        // Write your code here

    }
}
