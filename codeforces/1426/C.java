import java.util.*;
import java.io.*;
import java.lang.*;
public class Main{ 
    static boolean ok(long n,long t){
        long res=0;
        if(n%2==0){
            res=(n/2+1)*(n/2+1);
        }
        else{
            res=(n/2+1)*(n/2+2);
        }
        return res>=t;
    }
    public static void main(String[] args) {
        FastScanner sc =new FastScanner();
        PrintWriter out=new PrintWriter(System.out);
        int t=sc.nextInt();
        while(t-->0){
            long n=sc.nextLong();
            long low=1,high=n-1,res=high;
            while(low<=high){
                long mid=(low+high)/2;
                if(ok(mid,n)){
                    res=mid;
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            out.println(res);

        }
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
    int nextInt(){
        return Integer.parseInt(next());
    }
    long nextLong(){
        return Long.parseLong(next());
    }
}