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
            int n=nextInt(),q=nextInt();
            char arr[]=next().toCharArray();
            for(int x=0;x<q;x++){
                int a=nextInt()-1;
                int b=nextInt()-1;
                boolean flag=false;
                for(int i=0;i<a;i++){
                    if(arr[a]==arr[i]){
                        flag=true;
                    }
                }
                for(int i=b+1;i<n;i++){
                    if(arr[b]==arr[i]){
                        flag=true;
                    }
                }
                out.println(flag?"YES":"NO");

            }
        }
        out.close();
    }
}
