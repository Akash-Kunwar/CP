import java.util.*;
import java.io.*;
import java.lang.*;
public class Main{ 
    public static void main(String[] args) {
        FastScanner sc =new FastScanner();
        PrintWriter out=new PrintWriter(System.out);
        int n=sc.nextInt();
        long arr[]=new long[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        if(n<=2){
            out.println(n);
            out.close();
            return;
        }
        int res=2,max=2;
        for(int i=2;i<n;i++){
            if(arr[i]==arr[i-2]+arr[i-1]){
                res++;
            }
            else{
                max=Math.max(res,max);
                res=2;
            }
        }
        out.println(Math.max(res,max));
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
}