//'main' method must be in a class 'Rextester'.
//Compiler version 1.8.0_111
// split the sentence based on white space
import java.util.*;
import java.lang.*;
import java.util.ArrayList;

class Rextester
{  
    public static void main(String args[])
    {
        String sen ="Java Program to Remove all occurrences of  char in a string";
        char arr[] = sen.toCharArray();
        List<String> list = new ArrayList<String>(); 
         List<String> rlist = new ArrayList<String>(); 
        int len = arr.length;
        int s =0;
        for(int i=0;i<len;i++){
            if(arr[i] == ' ' || i==len-1){
                list.add(sen.substring(s,i+1));
                rlist.add(rev(sen.substring(s,i+1)));
                s=i+1;
                i++;
                
            }    
        }
        
        for(String str: list){
           System.out.print(str+ " ");
        }
        System.out.println();
        for(String str: rlist){
            System.out.print(str+ " ");
        }
    }
    static String rev(String str){
     
        char arr[] = str.toCharArray();
        int len = arr.length-1;
        for(int i=0;i<=len/2;i++){
            char ch = arr[i];
            arr[i]=arr[len];
            arr[len] =ch;
            len--;
        }
        return String.valueOf(arr);
    }    
}
