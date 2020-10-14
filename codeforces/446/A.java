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
        int n=nextInt();
        long arr[]=new long[n];
        for(int i=0;i<n;i++){
            arr[i]=nextLong();
        }
        int left[]=new int[n];
        int right[] =new int[n];
        left[0]=1;
        int res=1;
        for(int i=1;i<n;i++){
            if(arr[i]>arr[i-1]){
                left[i]=left[i-1]+1;
                res=Math.max(res,left[i]);
            }
            else{
                left[i]=1;
            }
        }
        if(res!=n) res++;
        right[n-1]=1;
        for(int i=n-2;i>=0;i--){
            if(arr[i+1]>arr[i]){
                right[i]=right[i+1]+1;
            }
            else{
                right[i]=1;
            }
        }
        
        for(int i=1;i<n-1;i++){
            if(arr[i+1]-arr[i-1]>1){
                res=Math.max(res,left[i-1]+right[i+1]+1);
            }
        }
        // out.println(Arrays.toString(left)+Arrays.toString(right));
        out.println(res);
        out.close();
    }
}
