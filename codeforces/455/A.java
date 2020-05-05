/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static long calc(long[] arr,long[] dp,int n){
        dp[0]=0;
        dp[1]=arr[1];
        for(int i=2;i<100001;i++){
            dp[i]=Math.max(dp[i-1],dp[i-2]+arr[i]*i);
        }
        return dp[100000];
        
    }
	public static void main (String[] args) {
	    Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long arr[]=new long[100001];
        long dp[]=new long[100001];
        for(int i=0;i<n;i++){
            long x=sc.nextLong();
            arr[(int)x]++;
        }
        long ans=calc(arr,dp,100001);
        System.out.println(ans);
        // System.out.println(Arrays.toString(dp));

	}
}