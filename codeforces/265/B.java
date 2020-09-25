import java.util.*;
import java.io.*;
import java.lang.*;
public class Main{ 
    public static void main(String[] args) throws Exception{
        FastScanner sc =new FastScanner();
        PrintWriter out=new PrintWriter(System.out);
        int n=sc.nextInt(),prev=sc.nextInt();
        long res=prev+1;
        for(int i=0;i<n-1;i++){
            int curr=sc.nextInt();
            if(prev>curr){
                res+=prev-curr+1;
            }
            else{
                res+=curr-prev+1;
            }
            prev=curr;
            res++;
        }
        out.println(res);
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