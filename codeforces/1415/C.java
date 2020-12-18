import java.util.*;
import java.io.*;
import java.lang.*;
public class C_Bouncing_Ball{
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
        new C_Bouncing_Ball().solve();
    }
    void solve(){ 
        int t=1; 
        t = nextInt();
        for(int tt=0;tt<t;tt++){
            int n = nextInt(),p=nextInt(),k=nextInt();
            char arr[]=next().toCharArray();
            int x = nextInt(),y=nextInt();
            Pair dp[]=new Pair[n];
            for(int i=0;i<n;i++) dp[i]=new Pair(0,0);
            for(int i=n-1;i>=p-1;i--)
            {   
                if(arr[i]=='1'){
                    if(i+k>=n) dp[i].a=0;
                    else{
                        dp[i].a=dp[i+k].a;
                    }
                }
                else{
                    if(i+k>=n) dp[i].a=1;
                    else{
                        dp[i].a=1+dp[i+k].a;
                    }
                }

                dp[i].b=i-p+1;
            }
            int res=Integer.MAX_VALUE;
            for(int i=p-1;i<n;i++){

                res=Math.min(res,dp[i].a*x+dp[i].b*y);

            }
            out.println(res);
        }
        out.close();
    }
}
class Pair{
    int a,b;
    Pair(int a,int b){
        this.a=a;
        this.b=b;
    }
}
