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
        int m=in.nI();
        int k=in.nI();
        int arr[] =new int[m];
        for(int i=0;i<m;i++) arr[i]=in.nI();
        int f=in.nI();
        int count=0;
        for(int i=0;i<m;i++){
            int num1=f,num2=arr[i],d=0;
            for(int j=0;j<=31;j++){
                if(((num1>>j)&1) != ((num2>>j)&1)){
                    d++;
                }
            }
            if(d<=k) count++;
        }
        out.println(count);
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