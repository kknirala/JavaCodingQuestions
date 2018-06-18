import java.util.Arrays;
public class RearrangeArray{

     public static void main(String []args){
      int A[] = {1, 3, 2, 2, 5};
      Arrays.sort(A);
      int n = A.length;
      int p=0, q=n-1;
      int result[] = new int[n]; 
      for(int i=0;i<n;i++){
          if((i+1)%2 ==0){
            result[i] = A[q--];
          }else
            result[i] = A[p++];
      }
      for(int j=0;j<n;j++){
          System.out.print(" "+ result[j]);
      }
     }
}
