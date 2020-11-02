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
        int t=nextInt();
        while(t-->0) ok(); 
        out.close();
    }
    long arr[],brr[];
    boolean find(long mid){
        long sum=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=mid) continue;
            else sum+=brr[i];
        }
        return sum<=mid;
    }

    void ok(){
        int n=nextInt();
        arr=new long[n];
        brr=new long[n];
        long low=1,high=-1;
        for(int i=0;i<n;i++) {arr[i]=nextLong(); high=Math.max(high,arr[i]);}
        for(int i=0;i<n;i++) brr[i]=nextLong();
        long res=high;
        while(low<=high){
            long mid=(low+high)/2;
            if(find(mid)){
                res=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        out.println(res);
    }
}
