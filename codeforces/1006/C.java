import java.util.*;
import java.io.*;
import java.lang.*;
public class Main{ 
    public static void main(String[] args) {
        FastScanner in =new FastScanner();
        PrintWriter out=new PrintWriter(System.out);
        int n=in.nI();
        long arr[] =new long[n],sum=0,res=0;
        Map<Long,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            arr[i]=in.nL();
            sum+=arr[i];
            map.put(sum,i);
        }
        sum=0;
        for(int i=n-1;i>=0;i--){
            sum+=arr[i];
            if(map.containsKey(sum) && map.get(sum)<i){
                res=Math.max(res,sum);
            }
        }
        out.println(res);
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
