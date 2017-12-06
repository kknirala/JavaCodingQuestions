import java.util.Arrays;
import java.util.Scanner;

public class MonkMonsterPuzzle {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int testcases = sc.nextInt(); 
		for(int tc =0;tc<testcases;tc++){
			boolean meet = false;
			int k = 0,costInd = 0,gain = 0;
			String monk = sc.next();
			String mons = sc.next();
			int asize = sc.nextInt();
			int cost[] = new int[asize];
			for(int c = 0;c<asize;c++){
				cost[c] = sc.nextInt();
			}
			Arrays.sort(cost);
			for(int c=0;c<asize/2;c++){
				int temp = cost[c];
				cost[c] = cost[asize-c-1];
				cost[asize-c-1] = temp;
			}
			char trav[] =  monk.toCharArray();
			int i = 0;
			while(i<trav.length) {
				meet = false;
				k = 0;
				if(mons.charAt(k) == trav[i]){
					int cin = i;
					k++; cin++;
					for(;k<mons.length();k++){
						if(mons.charAt(k) == trav[cin]){
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
					gain = gain + cost[costInd];
					costInd++;
					i = i + mons.length();
				}
				i++;
			}
			System.out.println("total gain:"+ gain);
		}
	}
}
