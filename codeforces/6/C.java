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
    void solve(){
        int n=nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++) arr[i]=nextInt();
        long sum[]=new long[n];
        sum[0]=arr[0];
        for(int i=1;i<n;i++) sum[i]=sum[i-1]+arr[i];
        long rsum=0;
        int a=0,b=0;
        for(int i=n-1;i>=0;i--){
            rsum+=arr[i];
            if(rsum>=sum[i]){
                break;
            }
            else{
                b++;
            }
        }
        out.println((n-b)+" "+b);
        out.close();
    }
}
