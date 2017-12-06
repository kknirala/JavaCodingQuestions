import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class XorArray {

	public static void main(String[] args) {
		Random ran = new Random();
		Scanner sc=new Scanner(System.in);  
		System.out.println("Enter Size of array");
		int N = sc.nextInt();
		System.out.println("Enter M");
		int M = sc.nextInt();
		System.out.println("Enter P");
		int P = sc.nextInt();
		int l,r,f1 = 1,f2 =1,f3 =1;
		int arr[] = new int[N];
		int arr_S[] = new int[M];
		int arr_L[] = new int[P];
		for(int i=1;i<N;i++){
			arr[i] = i;
		}

		r = 4;// ran.nextInt(N)+ 1;
		l = 2;// ran.nextInt(r) + 1;
		arr_S = Arrays.copyOfRange(arr, l, r);
		arr_L = Arrays.copyOfRange(arr, l, r);
		for(int i = 0;i<arr_S.length-1;i++){
			System.out.println(arr_S[i]);
			f1 = arr_S[i]^arr_S[i+1];
			System.out.println(f1);
		}
		
	}
}
