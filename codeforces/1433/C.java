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
            long arr[]=new long[n];
            long max=Integer.MIN_VALUE;
            int idx=-1;
            boolean flag=false;
            for(int i=0;i<n;i++){
                arr[i]=nextLong();
                if(max<arr[i]){
                    max=arr[i];
                }
                if(i>0 && arr[i]!=arr[i-1]){
                    flag=true;
                }
            }
            
            if(n==1){
                out.println(1);
            }
            else if(!flag){
                out.println(-1);
            }
            else{
                for(int i=0;i<n;i++){
                    if(arr[i]==max){
                        if(i+1<n && arr[i]!=arr[i+1]){
                            idx=i+1;
                        }
                        if(i-1>=0 && arr[i]!=arr[i-1]){
                            idx=i+1;
                        }
                    }
                }
                if(idx==-1){
                    out.println(-1);
                }
                else{
                    out.println(idx);
                }
            }
            
        }
        out.close();
    }
}