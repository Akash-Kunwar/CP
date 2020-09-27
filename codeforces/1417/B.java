import java.util.*;
import java.io.*;
import java.lang.*;
public class Main{ 
    public static void main(String[] args) {
        FastScanner sc =new FastScanner();
        PrintWriter out=new PrintWriter(System.out);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            long k=sc.nextLong();
            long arr[]=new long[n];
            for(int i=0;i<n;i++) arr[i]=sc.nextLong();
            Map<Long,Integer> map=new HashMap<>();
            int res[]=new int[n];
            for(int i=0;i<n;i++){
                if(map.containsKey(k-arr[i])){
                    map.put(arr[i],map.get(k-arr[i])^1);
                    res[i]=map.get(arr[i]);
                }
                else{
                    res[i]=1;
                    map.put(arr[i],1);
                }
            }
            for(int i:res){
                out.print(i+" ");
            }
            out.println();
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
    long nextLong(){
        return Long.parseLong(next());
    }
}