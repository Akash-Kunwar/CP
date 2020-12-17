import java.util.*;
import java.io.*;
import java.lang.*;
public class Solution{
    BufferedReader br =new BufferedReader(new InputStreamReader(System.in)); 
    PrintWriter out =new PrintWriter(System.out);
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
    public static void main(String[] args) {
        new Solution().solve();
    }
    void solve(){ 
        int t=1; 
        t = nextInt();
        for(int tt=0;tt<t;tt++){
            long t1 =nextLong(),t2=nextLong(),t3=nextLong();
            long min = Math.min(Math.min(t1,t2),t3);
            t1=t1+t2+t3;
            boolean temp=false;
            if(t1%9==0 && min>=t1/9) temp=true;
            System.out.println(temp?"YES":"NO");
        }
        out.close();
    }
}
