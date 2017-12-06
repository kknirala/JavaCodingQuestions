import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class MaxSumBldSpeed {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int workers[] = new int[n*2]; 
		for(int i = 0;i<n*2;i++){
			workers[i] = sc.nextInt();
		}
		Arrays.sort(workers);
		int sum = 0;
		for(int i = 0;i<workers.length;i++){
			if(i%2 == 0){
				sum += workers[i];
			}
		}
		System.out.println(sum);
	}
}
