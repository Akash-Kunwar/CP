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
    // abba
    void solve(){
        int n=nextInt(),k=nextInt(),res=0;
        char arr[]=next().toCharArray(),loop[]={'a','b'};
        for(char c:loop){
            int chg=k;
            for(int i=0,j=0;i<n;i++){
                while(j<n && chg>=0){
                    if(arr[j]!=c){
                        if(chg==0) break;
                        chg--;
                    }
                    j++;
                }
                res=Math.max(res,j-i);
                if(arr[i]!=c){
                    chg++;
                }
            }
        }
        out.println(res);
        out.close();
    }
}
