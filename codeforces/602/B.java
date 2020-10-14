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
        int n=nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++) arr[i]=nextInt();
        int i=0,j=0,left=0,res=0,l=0;
        for(i=1;i<n;i++){
            if(arr[i]-arr[i-1]==0){
                continue;
            }
            if(arr[i]-arr[i-1]==left){
                res=Math.max(res,i-j);
                j=l;
            }
            else{
                left=arr[i]-arr[i-1];
            }
            l=i;
        }
        out.println(Math.max(res,i-j));
        out.close();
    }
}
