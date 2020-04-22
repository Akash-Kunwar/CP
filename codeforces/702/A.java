import java.util.*;
import java.lang.*;
public class force{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] =new int[n];
        int dp[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.fill(dp,1);
        int max=1;
        for(int i=1 ;i<n;i++){
            if (arr[i-1]<arr[i]){
                dp[i]=dp[i-1]+1;
                if (max<dp[i]){
                    max=dp[i];
                }
            }
        }
        System.out.println(max);



    }
}

