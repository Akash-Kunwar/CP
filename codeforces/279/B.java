import java.util.*;
import java.io.*;
import java.lang.*;
public class Main{ 
    public static void main(String[] args) {
        FastScanner sc =new FastScanner();
        PrintWriter out=new PrintWriter(System.out);
        int n=sc.nextInt(),j=0,max=0;
        long k=sc.nextLong();
        int arr[] =new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        long temp=0;

        for(int i=0;i<n;i++){
            while(j<n && temp+arr[j]<=k){
                temp+=arr[j];
                j++;
            }
            // out.println(j+" "+i);
            max=Math.max(j-i,max);
            temp-=arr[i];
        }
        out.println(max);
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