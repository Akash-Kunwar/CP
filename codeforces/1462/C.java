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
    Set<Integer> set ;
    int res=Integer.MAX_VALUE;
    void ok(int curr,int sum,int t,int pos){
        if(sum==t){
            res=Math.min(res,curr);
        }
        for(int i=pos;i<=9 && i+sum<=t;i++){
            ok(curr*10+i,sum+i,t, i+1);
        }
    }
    void solve(){ 
        int t = nextInt();
        while(t-->0)
        {   set =new HashSet<>();
            int n = nextInt();
            res=Integer.MAX_VALUE;
            if(n>45) out.println("-1");
            else{
                ok(0,0,n,1);
                out.println(res);
            }
        }
        out.close();
    }
}
