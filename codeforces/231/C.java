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
        int n = nextInt();
        long k=nextLong();
        long arr[]=new long[n];
        for(int i=0;i<n;i++) arr[i]=nextLong();
        Arrays.sort(arr);
        long sum[]=new long[n+1];
        for(int i=1;i<=n;i++){
            sum[i]=sum[i-1]+arr[i-1];
        }
        long cnt=0,ele=0;
        for(int i=1;i<=n;i++){
            int l=0,r=i;
            while(l<=r){
                int mid=(l+r)/2;
                if(( sum[i]-sum[mid] + k)< arr[i-1] *(i-mid)) l=mid+1;
                else r=mid-1;
            }

            if(i-l>cnt) {
                cnt=i-l;
                ele=arr[i-1];
            }

        }
        out.println(cnt+" "+ele);
        out.close();
    }
}
