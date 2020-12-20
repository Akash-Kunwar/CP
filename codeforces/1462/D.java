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
            int n =nextInt(); 
            int arr[]=new int[n];
            for(int i=0;i<n;i++) arr[i]=nextInt();
            long sum=0;
            int res=1,op=n;
            for(int i=0;i<n;i++)
            {
                sum+=arr[i];
                int cnt=1;
                long csum=0;
                int cop=i;
                boolean flag=true;
                for(int j=i+1;j<n;j++){
                    csum+=arr[j];
                    if(csum==sum){
                        csum=0;
                        cnt++;
                    }
                    else if(csum>sum){
                        flag=false;
                        break;
                    }
                    else if(j==n-1){
                        if(csum!=sum) flag=false;
                    }else{
                        cop++;
                    }
                }
                if(flag) {
                    // out.println(sum);
                    res=Math.max(res,cnt);
                    op=Math.min(op,cop);
                }
            }   
            
            out.println(op);
        }
        out.close();
    }
}

