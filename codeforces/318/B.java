import java.util.*;
import java.io.*;
import java.lang.*;
public class Codeforces{
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
        new Codeforces().solve();
    }
    void solve(){
        String str=next();
        long cnt=0,res=0;
        for(int i=0;i<str.length()-4;i++){
            if(str.substring(i,i+5).equals("heavy")) cnt++;
            else if(str.substring(i,i+5).equals("metal")) res+=cnt;
        }
        out.println(res);
        out.close();
    }
}
