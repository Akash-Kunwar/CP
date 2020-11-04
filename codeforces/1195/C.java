import java.util.*;
import java.io.*;
import java.lang.*;
public class Codeforces{
    BufferedReader br =new BufferedReader(new InputStreamReader(System.in)); 
    PrintWriter out =new PrintWriter(System.out);
    StringTokenizer st =new StringTokenizer("");
    String next(){
        if(!st.hasMoreTokens()){
            try{
                st=new StringTokenizer(br.readLine());
            }
            catch(Exception e){

            }
        }
        return st.nextToken();
    }
    int nextInt(){
        return Integer.parseInt(next());
    }
    long nextLong(){
        return Long.parseLong(next());
    }
    public static void main(String[] args) {
        new Codeforces().solve();
    }
    void solve(){ 
        int n = nextInt();
        long arr[]=new long[n+1],brr[]=new long[n+1],dp[][]=new long[3][n+1];
        
        for(int i=1;i<=n;i++){arr[i]=nextLong();}
        for(int i=1;i<=n;i++) brr[i]=nextLong();
        for(int i=1;i<=n;i++){
            dp[0][i] = Math.max(dp[1][i-1]+arr[i],Math.max(arr[i],dp[2][i-1]+arr[i]));
            dp[1][i] = Math.max(dp[0][i-1]+brr[i],Math.max(brr[i],brr[i]+dp[2][i-1]));    
            dp[2][i] = Math.max(dp[0][i-1],dp[1][i-1]);            
        }

        // for(int i =0;i<3;i++){
        //     out.println(Arrays.toString(dp[i]));
        // }
        out.println(Math.max(dp[0][n],Math.max(dp[1][n],dp[2][n])));
        out.close();
    }
}
