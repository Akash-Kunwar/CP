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
            int n=nextInt();
            long m=nextLong();
            long arr[]=new long[n],s=0;;
            for(int i=0;i<n;i++){
                arr[i]=nextLong();
                s+=arr[i];
            }
            if(s==m){
                out.println("YES");
            }
            else{
                out.println("NO");
            }
        }
        out.close();
    }
}
