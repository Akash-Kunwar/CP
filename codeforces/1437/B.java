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
            char arr[]=next().toCharArray();
            int o=0,z=0;
            for(int i=0;i<n;i++){
                if(arr[i]=='1' && i>0 && arr[i-1]=='1') o++;
                if(arr[i]=='0' && i>0 && arr[i-1]=='0') z++;
            }
            out.println(Math.max(o,z));
        }
        out.close();
    }
}
