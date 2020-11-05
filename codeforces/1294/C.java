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
        for(long i=2;i*i<n;i++){
            if(n%i==0){
                arr.add(i);
                n/=i;
            }
            if(arr.size()==2){
                break;
            }
        }
        arr.add(n);
        return;
    }
    void solve(){ 
        int n = nextInt();
        while(n-->0){
            long x =nextLong();
            List<Long>arr =new ArrayList<>();
            ok(arr,x);
            if(arr.size()!=3)out.println("NO");
            else{
                if(arr.get(1)==arr.get(2) || arr.get(1)==arr.get(0) || arr.get(0)==arr.get(2)) out.println("NO");
                else{
                    out.println("YES");
                    out.println(arr.get(0)+" "+arr.get(1)+" "+arr.get(2));
                }
            }
        }
        out.close();
    }
}
