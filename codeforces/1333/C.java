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
        int n=nextInt();
        long arr[] =new long[n],pre[]=new long[n+1];
        for(int i=0;i<n;i++){
            arr[i]=nextLong();
            pre[i+1]=pre[i]+arr[i];
        }
        Map<Long,Integer> map =new HashMap<>();
        map.put(0l,0);
        long s=0,res=0;
        int mx=0;
        for(int i=1;i<=n;i++){
            s+=arr[i-1];
            if(map.containsKey(s)){
                mx=Math.max(mx,map.get(s)+1);
            }
            res+=i-mx;
            map.put(s,i);
        }
        out.println(res);
        out.close();
    }
}
