import java.util.*;
import java.lang.*;
import java.io.*;

public class force {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int dp[]=new int[n];
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            for(int i=1;i<n-1;i++){
                if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
                    dp[i]=dp[i-1]+1;
                }
                else{
                    dp[i]=dp[i-1];
                }
            }
            long count=-1,l=0;
            // System.out.println(Arrays.toString(dp));
            for(int i=0;i<n-k+1;i++){
                if(dp[i+k-2]-dp[i]>count){
                    count=dp[i+k-2]-dp[i];
                    l=i+1;
                }
            }



            System.out.println((count+1)+" "+l);

        }
        
        
    }
}