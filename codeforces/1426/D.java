import java.util.*;
import java.io.*;
import java.lang.*;
public class Main{ 
    public static void main(String[] args) {
        FastScanner sc =new FastScanner();
        PrintWriter out=new PrintWriter(System.out);
        int n=sc.nextInt();
        long arr[] =new long[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextLong();
        Map<Long,Long> map=new HashMap<>();
        map.put(0l,1l);
        long sum=0,res=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(map.containsKey(sum)){
                res+=1;
                sum=arr[i];
                map.clear();
                map.put(0l,0l);
            }
            map.put(sum,map.getOrDefault(sum,0l)+1);
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
    int nextInt(){
        return Integer.parseInt(next());
    }
    long nextLong(){
        return Long.parseLong(next());
    }
}