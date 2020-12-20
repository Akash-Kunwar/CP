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
        int t=1; 
        t = nextInt();
        for(int tt=0;tt<t;tt++){
            int n=nextInt();
            char arr[]=next().toCharArray();
            int cnt=0;
            for(int i=n-1;i>=0;i--){
                if(arr[i]==')') cnt++;
                else break;
            }
            if(cnt>(n-cnt))out.println("YES");
            else{
                out.println("NO");
            }
        }
        out.close();
    }
}
