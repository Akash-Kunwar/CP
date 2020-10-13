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
        int n=nextInt(),d=nextInt(),l=nextInt();
        int codd=n/2+n%2,ceven=n/2 ,max_odd=codd*l,min_odd=codd,max_even=ceven*l,min_even=ceven;
        boolean flag=false;
        int sum_even=-1,sum_odd=-1;
        for(int i=min_even;i<=max_even;i++){
            if(i+d>=min_odd && i+d<=max_odd){
                flag=true;
                sum_even=i;
                sum_odd=i+d;
            }
        }
        if(!flag){
            out.println(-1);
            out.close();
            return;
        }
        int res[]=new int[n+1];
        for(int i=1;i<=n;i++){
            res[i]=1;
            if(i%2!=0) sum_odd--;
            else sum_even--;
        }
        for(int i=1;i<=n;i++){
            if(i%2==0 && sum_even>0){
                int rem=Math.min(l-1,sum_even);
                res[i]+=rem;
                sum_even=sum_even-rem;
            }
            if(i%2!=0 && sum_odd>0){
                int rem=Math.min(l-1,sum_odd);
                res[i]+=rem;
                sum_odd=sum_odd-rem;
            }
        }
        for(int i=1;i<=n;i++){
            out.print(res[i]+" ");
        }
        out.close();
    }
}
