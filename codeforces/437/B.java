import java.util.*;
import java.io.*;
import java.lang.*;
public class Main{ 
    public static void main(String[] args) {
        FastScanner sc =new FastScanner();
        PrintWriter out=new PrintWriter(System.out);
        int n=sc.nextInt(),m=sc.nextInt();
        List<Integer> arr=new ArrayList<>();
        for(int i=m;i>=1;i--){
            if(n==0) break;
            int x=Integer.lowestOneBit(i);
            if(x<=n){
                arr.add(i);
                n-=x;
            }
        }   
        if(n!=0){
            out.println(-1);
            out.close();
            return;
        }
        out.println(arr.size());
        for(int i:arr){
            out.print(i+" ");
        }
        out.close();
    }
}
class FastScanner{
    BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
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
}