import java.util.*;
import java.io.*;
import java.lang.*;
public class Main{ 
    static int setBitNumber(long n) 
    { 
        if (n == 0) 
            return 0; 
  
        int msb = 0; 
        n = n / 2; 
  
        while (n != 0) { 
            n = n / 2; 
            msb++; 
        } 
  
        return msb; 
    } 
    public static void main(String[] args) {
        FastScanner in =new FastScanner();
        PrintWriter out=new PrintWriter(System.out);
        int n=in.nI();
        int t=in.nI();
        int x=1;
        long sum=0;
        while(t-->0){
            int to=in.nI();
            sum+=(to-x+n)%n;
            x=to;
        }        
        out.println(sum);
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