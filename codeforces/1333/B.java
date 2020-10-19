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
        while(t-->0){
            int n=nextInt();
            long arr[]=new long[n];
            for(int i=0;i<n;i++) arr[i]=nextLong();
            long brr[]=new long[n];
            for(int i=0;i<n;i++) brr[i]=nextLong();
            Set<Long> set =new HashSet<>();
            boolean flag=true;
            for(int i=0;i<n;i++){
                if(arr[i]!=brr[i]){
                    if(arr[i]>brr[i]){
                        if(!set.contains(-1l)){
                            flag=false;
                            break;
                        }
                    }
                    if(arr[i]<brr[i]){
                        if(!set.contains(1l)){
                            flag=false;
                            break;
                        }
                    }
                }
                set.add(arr[i]);
            }
            out.println(flag?"YES":"NO");
        }
        out.close();
    }
}
