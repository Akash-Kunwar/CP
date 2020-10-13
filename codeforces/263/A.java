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
        int n=0,m=0;
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                int x=nextInt();
                if(x==1){
                    n=i+1;
                    m=j+1;
                }
            }
        }
        out.println(Math.abs(3-n)+Math.abs(3-m));
        out.close();
    }
}
