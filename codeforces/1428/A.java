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
    public static void main(String[] args) {
        new Codeforces().solve();
    }
    void solve(){
        int t=nextInt();
        while(t-->0){
            int a=nextInt(),b=nextInt(),c=nextInt(),d=nextInt();
            if(a==c){
                out.println(Math.abs(b-d));
            }
            else if(b==d){
                out.println(Math.abs(a-c));
            }
            else{
                out.println(Math.abs(a-c)+Math.abs(b-d)+2);
            }
        }
        out.close();
    }
}
