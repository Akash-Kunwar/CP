import java.util.*;
import java.io.*;
import java.lang.*;
public class Main{ 
    public static void main(String[] args) {
        FastScanner sc =new FastScanner();
        PrintWriter out=new PrintWriter(System.out);
        int t=sc.nextInt();
        while(t-->0){
            long arr[]=new long[3];
            for(int i=0;i<3;i++) arr[i]=sc.nextLong();
            Arrays.sort(arr);
            long h=Math.abs(arr[0]-arr[2]),b=arr[1];
            out.println((long)Math.ceil(Math.sqrt(h*h+b*b)));
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