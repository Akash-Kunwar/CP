import java.util.*;
import java.io.*;
import java.lang.*;
public class Solution{
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
        new Solution().solve();
    }
    void solve(){ 
        int t = nextInt();
        while(t-->0){
            int n = nextInt();
            long arr[]=new long[n];
            for(int i=0;i<n;i++){
                arr[i]=nextLong();
            }
            int i=0,j=n-1;
            while(i<j){
                out.print(arr[i++]+" ");
                out.print(arr[j--]+" ");
            }
            if(i==j) out.print(arr[j]+" ");
            out.println();
        }
        out.close();
    }
}
