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
    static int lower_bound(long arr[],long item){
        int l=0,h=arr.length-1,res=-1;
        while(l<=h){
            int mid=(l+h)/2;
            if(arr[mid]>item){
                h=mid-1;
            }
            else{
                res=mid;
                l=mid+1;
            }
        }
        return res;
    }
    void solve(){
        int n=nextInt();
        long d=nextLong();
        long arr[]=new long[n];
        for(int i=0;i<n;i++){
            arr[i]=nextLong();
        }
        long res=0;
        
        for(int i=0;i<n;i++){
            int idx=lower_bound(arr,arr[i]+d);
            // out.println(arr[i]+" "+idx);
            if(idx==n) idx--;
            long m=idx-i-1;
            res+=m*(m+1)/2;
        }       
        out.println(res);
        out.close();
    }
}
