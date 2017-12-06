
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;

public class StarGame {

	static boolean is_valid(int x,int y,int n1){
	    if(x<0||y<0||x>=n1||y>=n1){
	        return false;
	    }
	    return true;
	}
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);  
	   // System.out.println("Enter Size of Array:");  
	    int n1 = sc.nextInt(); 
	    char fire_Array[][] = new char[n1][n1];
	    char fire2[][] =  new char[n1][n1];
	  //  System.out.println("Enter '*' or '.'");
	    for(int i =0;i<n1;i++){
	    	for(int j = 0; j<n1;j++){
	    		Random ran = new Random();
	    		String spcl_char = ".*";
	    		fire_Array[i][j] = spcl_char.charAt(ran.nextInt(spcl_char.length())); 
	    	}
	    }
	    for(int i =0;i<n1;i++){
	    	for(int j = 0; j<n1;j++){
	    		 System.out.print(fire_Array[i][j]); 
	    	}
	    	System.out.println();
	    }
	   
	    fire2 = Arrays.copyOf(fire_Array,fire_Array.length);
	    int i,j;
	         
	    if(n1 == 1){
	        System.out.println("0");
	        return ;
	    }
	    int tot_count = 0;
	        for(i=0;i<n1;i++){
	            for(j=0;j<n1;j++){
	                if(fire_Array[i][j] == '*'){
	                	tot_count += cal_(i,j,fire2,n1);
	                }
	            }
	        }
	    System.out.println(tot_count);
	}
  static int cal_(int i,int j,char arr[][],int n1){
	    Pair p=new Pair();
	    p.setFirst(i);
	    p.setSecond(j);
	    Queue<Pair > q=new LinkedList<>();
	    q.add(p);
	    int tot_count = 0;
	    int  visited[][] = new int[n1][n1];
	    int diff[][] =new int[][]{{-1,0},{0,1},{1,0},{0,-1}};
	    while(!q.isEmpty()){
	        Pair curr = q.poll();
	        int x = curr.first;
	        int y = curr.second;
	        visited[x][y] = 1;
	        for(int k=0;k< 4;k++){
	            int newx = x + diff[k][0];
	            int newy = y + diff[k][1];
	            if(is_valid(newx,newy,n1)){
	                    if( arr[newx][newy] == '.' && visited[newx][newy] == 0){
	                        visited[newx][newy] = 1;
	                        tot_count++;
	                        Pair p1=new Pair();
	                        p1.setFirst(newx);
	                        p1.setSecond(newy);
	                        q.add(p1);
	                    }
	            }
	        }
	    }
	        return tot_count+1;
	}
	
}
class Pair{
	int first;
	public int getFirst() {
		return first;
	}
	public void setFirst(int first) {
		this.first = first;
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		this.second = second;
	}
	int second;
	
}
