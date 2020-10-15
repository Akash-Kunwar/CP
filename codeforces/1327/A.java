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
        int t=nextInt();
        while(t-->0){
            long a=nextLong(),b=nextLong();
            long sum=((b)*(2+(b-1)*2))/2;
            if(a%2!=b%2){
                out.println("NO");
            }
            else if(sum>a){
                out.println("NO");
            }
            else{
                out.println("YES");
            }
        }
        out.close();
    }
}
