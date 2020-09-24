import java.util.*;
import java.io.*;
import java.lang.*;
public class Main{ 
    public static void main(String[] args) {
        FastScanner in =new FastScanner();
        PrintWriter out=new PrintWriter(System.out);
        int t=in.nI();
        while(t-->0){
            int n=in.nI();
            long arr[]=new long[n];
            int flag=0;
            for(int i=0;i<n;i++) arr[i]=in.nI();
            for(int i=0;i<n-1;i++){
                if(arr[i]<=arr[i+1]){
                    flag=1;
                    break;
                }
            }
            if(n==1) out.println("YES");
            else if(flag==1) out.println("YES");
            else out.println("NO");


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
    int nI(){
        return Integer.parseInt(next());
    }
    long nL(){
        return Long.parseLong(next());
    }
}    

