import java.io.*;
	import java.util.*;
public class Encrypt {
	
	    public static void main(String[] args) throws IOException {
	        Scanner sc=new Scanner(System.in);
	        int n=sc.nextInt();
	        for(int k=0;k<n;k++)
	        {
	        	String s=sc.next();
	        	int len=s.length();
	        	int mid,i,x=0,c=1;
	        	if(len%2==0)
	        		mid=len/2;
	        	else
	        		mid=len/2+1;
	        	char ch[]=new char[len+1];
	        	if(len%2==0)
	        	{
	        		ch[mid]=s.charAt(0);
	        			for(i=1;i<len;i++)
	        			{
	        				if(i%2==0)
	        					ch[mid-c]=s.charAt(i);
	        				else
	        					ch[mid+c]=s.charAt(i);
	        				x++;
	        				if(x==2)
	        				{
	        					c++;
	        					x=0;
	        				}
	                   
	        			}
	        	}
	        	else
	        	{
	        		ch[mid]=s.charAt(0);
	        		for(i=1;i<len;i++)
	        		{
	        			if(i%2==1)
	        				ch[mid-c]=s.charAt(i);
	        			else
	        				ch[mid+c]=s.charAt(i);
	        				x++;
	        			if(x==2)
	                    {
	                        c++;
	                        x=0;
	                    }
	        		}      
	        	}
	        	String str=new String(ch);
	        	System.out.println(str.trim());
	        }
	      }
	   }
