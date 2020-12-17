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
    boolean ok(String str,int n){
        if(n<4) return false;
        if(str.substring(0,4).equals("2020")) return true;
        String temp=str.substring(0,1)+str.substring(n-3,n);
        if(temp.equals("2020")) return true;
        temp=str.substring(0,2)+str.substring(n-2,n);
        if(temp.equals("2020")) return true;
        temp=str.substring(0,3)+str.substring(n-1,n);
        if(temp.equals("2020")) return true;
        temp=str.substring(0,4);
        if(temp.equals("2020")) return true;
        temp=str.substring(n-4,n);
        if(temp.equals("2020")) return true;
        return false;
    }
    void solve(){ 
        int t = nextInt();
        while(t-->0){
            int n = nextInt();
            String str =next();
            out.println(ok(str,n)?"YES":"NO");
        }
        out.close();
    }
}

