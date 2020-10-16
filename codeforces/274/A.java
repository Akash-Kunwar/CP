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
        long k=nextLong();
        long arr [] =new long[n];
        for(int i=0;i<n;i++) arr[i]=nextLong();
        Arrays.sort(arr);
        Set<Long> set =new HashSet<>();
        for(int i=n-1;i>=0;i--){
            if(!set.contains(arr[i]*k)) set.add(arr[i]);
        }     
        out.println(set.size());
        out.close();
    }
}
