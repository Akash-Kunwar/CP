import java.util.*;
import java.io.*;
import java.lang.*;
public class Main{ 
    public static void main(String[] args) {
        FastScanner in =new FastScanner();
        PrintWriter out=new PrintWriter(System.out);
        int t=in.nI();
        while(t-->0){
            int n=in.nI();
            Map<Integer,Integer> map=new HashMap<>();
            long res=0;
            for(int i=0;i<n;i++){
                int x=in.nI();
                int z=Integer.highestOneBit(x);
                res+=map.getOrDefault(z,0);
                map.put(z,map.getOrDefault(z,0)+1);
            }
            out.println(res);
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
    int nI(){
        return Integer.parseInt(next());
    }
    long nL(){
        return Long.parseLong(next());
    }
}