import java.util.*;
import java.io.*;
import java.lang.*;
public class Main{ 
    public static void main(String[] args) {
        FastScanner sc =new FastScanner();
        PrintWriter out=new PrintWriter(System.out);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),k=sc.nextInt();
            int arr[]=new int[n],min=Integer.MAX_VALUE,idx=0;
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                if(min>arr[i]){
                    min=arr[i];
                    idx=i;
                }
            }
            int res=0;
            for(int i=0;i<n;i++){
                int x=k-arr[i];
                if(x>=0 && i!=idx){
                    res+=x/min;
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