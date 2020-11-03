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
    int limit =(int)1e9;
    List<Integer> adj =new ArrayList<>();
    void solve(){ 
        int n = nextInt();
        int dp[] =new int[n+1];
        int use[] =new int[n+1];
        Arrays.fill(use,-1);
        Arrays.fill(dp,limit);
        dp[0]=0;
        findAll(1);
        for(int i:adj){
            for(int j=i;j<=n;j++){
                if(dp[j]>dp[j-i]+1){
                    dp[j]=dp[j-i]+1;
                    use[j]=i;
                }
            }
        }
        List<Integer> ans =new ArrayList<>();
        while(use[n]>-1){
            ans.add(use[n]);
            n-=use[n];
        }
        out.println(ans.size());
        // out.println(Arrays.toString(use));
        // out.println(Arrays.toString(dp);
        for(int i:ans){
            out.print(i+" ");
        }
        out.close();
    }
    void findAll(int n)
    {   
        if(n>limit) return;
        adj.add(n);
        findAll(n*10);
        findAll(n*10+1);
    }
}
