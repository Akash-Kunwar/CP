import java.util.*;
import java.io.*;
import java.lang.*;
import java.lang.reflect.Array;
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
        int n=nextInt(),q=nextInt();
        long arr[] =new long[n];
        for(int i=0;i<n;i++) arr[i]=nextLong();
        Arrays.sort(arr);
        BIT bit = new BIT(n);
        for(int i=0;i<q;i++){
            int a=nextInt(),b=nextInt();
            bit.update(a-1,1);
            bit.update(b,-1);
        }
        Long count []=new Long[n];
        for(int i=0;i<n;i++) count[i]=bit.read(i);
        long res=0;
        Arrays.sort(count);
        for(int i=0;i<n;i++){
            res+=count[i]*arr[i];
        }
        out.println(res);
        out.close();
    }
}
class BIT {
    int n;
    long[] tree;
    
    public BIT(int n) {
        this.n = n;
        tree = new long[n + 2];
    }
    
    long read(int i) {
        i++;
        int sum = 0;
        while (i > 0) {
            sum += tree[i];
            i -= i & -i;
        }
        return sum;
    }
    
    void update(int i, int val) {
        i++;
        while (i <= n) {
            tree[i] += val;
            i += i & -i;
        }
    }
    
}