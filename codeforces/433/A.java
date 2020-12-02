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
    public static void main(String[] args) {
        new Codeforces().solve();
    }
    boolean ok(int arr[],int total){
        int n = arr.length;
        boolean dp[][] = new boolean [n+1][total+1];
        for(int i=0;i<n+1;i++){
            for(int j=0;j<total+1;j++){
                if(j==0) dp[i][j]=true;
                else dp[i][j]=false;
            }
        }
        for(int i=1;i<n+1;i++){
            for(int j=1;j<total+1;j++){
                if(arr[i-1]>j){
                    dp[i][j]=dp[i-1][j];
                }
                else{
                    dp[i][j]=dp[i-1][j-arr[i-1]];
                }
            }
        }
        return dp[n][total];
    }
    void solve(){ 
        int n = nextInt();
        int arr[]=new int[n],sum=0;
        for(int i=0;i<n;i++) {arr[i]=nextInt();sum+=arr[i];}
        out.println(ok(arr,sum/2)?"YES":"NO"); 
        out.close();
    }
}
