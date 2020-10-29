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
        int n=nextInt(),t=nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n-1;i++) arr[i]=nextInt();
        boolean res[] =new boolean[n];
        res[0]=true;
        for(int i=0;i<n;i++){
            if(i+arr[i]<n && res[i]) res[i+arr[i]]=true;
        }

        out.println(res[t-1]?"YES":"NO");
        out.close();
    }
}
