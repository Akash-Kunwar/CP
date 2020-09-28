import java.util.*;
import java.io.*;
import java.lang.*;
public class Main{ 
    public static void main(String[] args) {
        FastScanner sc =new FastScanner();
        PrintWriter out=new PrintWriter(System.out);
        int n=sc.nextInt(),m=sc.nextInt();
        boolean dp[]=new boolean[n+1];
        for(int i=0;i<m;i++){
            dp[sc.nextInt()]=true;
            dp[sc.nextInt()]=true;
        }
        int i=1;
        while(dp[i]){
            i++;
        }
        out.println(n-1);
        for(int j=1;j<=n;j++){
            if(i!=j) out.println(i+" "+j);
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
}