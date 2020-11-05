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
    void ok(List<Long> arr,long n){
        long a=-1,b=-1,c=-1;
        for(long i=2;i*i<n;i++){
            if(n%i==0){
                a=i;
                n/=i;
                break;
            }
        }
        if(a==-1) return;
        arr.add(a);
        for(long i=2;i*i<n;i++){
            if(i!=a && n%i==0){
                b=i;
                n/=i;
                break;
            }
        }
        if(b==-1) return;
        arr.add(b);
        if(n<=1 || n==b || n==a) return;

        arr.add(n);
    }
    void solve(){ 
        int n = nextInt();
        while(n-->0){
            long x =nextLong();
            List<Long>arr =new ArrayList<>();
            ok(arr,x);
            // out.println(arr);
            if(arr.size()!=3)out.println("NO");
            else{

                out.println("YES");
                out.println(arr.get(0)+" "+arr.get(1)+" "+arr.get(2));
                
            }
        }
        out.close();
    }
}
