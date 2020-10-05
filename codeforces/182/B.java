import java.util.*;
import java.io.*;
import java.lang.*;
public class Main{ 
    public static void main(String[] args) {
        FastScanner sc =new FastScanner();
        PrintWriter out=new PrintWriter(System.out);
        int d=sc.nextInt();
        int n=sc.nextInt();
        int res=0;
        for(int i=0;i<n-1;i++){
            res+=d-sc.nextInt();
        }
        sc.nextInt();
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
}