import java.util.*;
import java.io.*;
import java.lang.*;
public class Main{ 
    public static void main(String[] args) throws Exception{
        FastScanner in=new FastScanner();
        PrintWriter out=new PrintWriter(System.out);
        int n=in.nextInt();
        Map<String,Integer> map=new HashMap<>();
        int sum[]=new int[n];
        String name[]=new String[n];
        for(int i=0;i<n;i++){
            name[i]=in.next();
            sum[i]=in.nextInt();
            if(map.containsKey(name[i])){
                sum[i]+=map.get(name[i]);
            }
            map.put(name[i],sum[i]);
        }
        int max=Collections.max(map.values());
        for(int i=0;i<n;i++){
            if(map.get(name[i])==max && sum[i]>=max){
                out.println(name[i]);
                break;
            }
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
