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
    Set<Long> set =new HashSet();
    List<Long> res=new ArrayList<>();
    int n =0;
    void ok(int len,long x){
        // out.println(len);
        if(len==n){
            for(long i:res)out.print(i+" ");
        }
        if(x%3==0 && set.contains(x/3)){
            set.remove(x/3);
            res.add(x/3);
            ok(len+1,x/3);
            res.remove(x/3);
            set.add(x/3);
        }

        if(set.contains(x*2)){
            set.remove(x*2);
            res.add(x*2);
            ok(len+1,x*2);
            res.remove(x*2);
            set.add(x*2);
        }
        return;
    }
    void solve(){ 
        n = nextInt();
        long arr[]=new long[n];
        for(int i=0;i<n;i++){
            long x = nextLong();
            arr[i]=x;
            set.add(x);
        }
        for(int i=0;i<n;i++){
            set.remove(arr[i]);
            res.add(arr[i]);
            ok(1,arr[i]);
            res.remove(arr[i]);
            set.add(arr[i]);
        }
        out.close();
    }
}
