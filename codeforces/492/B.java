import java.util.*;
import java.io.*;
import java.lang.*;
public class Main{ 
    public static void main(String[] args) {
        FastScanner in =new FastScanner();
        PrintWriter out=new PrintWriter(System.out);
        int n=in.nI();
        long dist=in.nL();  
        long arr[]=new long[n];
        for(int i=0;i<n;i++) arr[i]=in.nL();
        Arrays.sort(arr);
        double res=arr[0];
        for(int i=1;i<n;i++){
            res=Math.max(res,(double)(arr[i]-arr[i-1])/2);
        }
        out.println(Math.max(res,dist-arr[n-1]));

        out.close();
    }
}

class FastScanner{
    BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
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
    int nI(){
        return Integer.parseInt(next());
    }
    long nL(){
        return Long.parseLong(next());
    }
}