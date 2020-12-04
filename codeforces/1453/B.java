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
        int t=nextInt();
        while(t-->0){
            ok();
        }
        out.close();
    }
    void ok(){
        int n = nextInt();
        long arr[]=new long[n];
        for(int i=0;i<n;i++)arr[i]=nextLong();
        for(int i=0;i<n/2;i++){
            long temp=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;
        }
        long sum=0;
        for(int i=1;i<n;i++){
            sum+=Math.abs(arr[i]-arr[i-1]);
        }
        long res=Long.MAX_VALUE;
        for(int i=0;i<n;i++){
            long prev=-1,next=-1;
            if(i==0) prev=arr[i];
            else prev=arr[i-1];
            if(i==n-1) next =arr[i];
            else next=arr[i+1];
            long t= sum-Math.abs(arr[i]-prev)-Math.abs(arr[i]-next);
            if(i!=0 && i!=n-1) t+=Math.abs(prev-next);
            res=Math.min(res,t);
        }
        out.println(res);
    }
}
