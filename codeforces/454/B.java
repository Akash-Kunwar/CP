import java.util.*;
import java.io.*;
import java.lang.*;
public class Main{ 
    public static void main(String[] args) throws Exception{
        FastScanner sc =new FastScanner();
        PrintWriter out=new PrintWriter(System.out);
        int n=sc.nextInt();
        long arr[] =new long[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextLong();
        int idx=0,count=1;
        for(int i=1;i<n;i++){
            if(arr[i]>=arr[i-1]){
                count++;
            }
            else{
                idx++;
                count=1;
            }
        }
        if(count==n){
            out.println("0");
        }
        else{
            if(idx>=2){
                out.println("-1");
            }
            else if(arr[n-1]<=arr[0]){
                out.println(count);
            }
            else{
                out.println(-1);
            }
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