import java.util.*;
import java.io.*;
import java.lang.*;
public class Main{ 
    public static void main(String[] args) {
        FastScanner in =new FastScanner();
        PrintWriter out=new PrintWriter(System.out);
        long n=in.nL(),m=in.nL();
        long maxi=(n-m+1)*(n-m)/2;
        long sz=n/m,rem=n%m;
        long mini = rem*(sz+1)*sz/2+(m-rem)*sz*(sz-1)/2;
        out.println(mini+" "+maxi);
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