import java.util.*;
import java.io.*;
import java.lang.*;
public class Main{ 
    public static void main(String[] args) {
        FastScanner sc =new FastScanner();
        PrintWriter out=new PrintWriter(System.out);
        int n=sc.nextInt(),m=sc.nextInt();
        Map<Long,Integer> map =new HashMap<>();
        List<Long> ip=new ArrayList<>();
        for(int i=0;i<n;i++){
            ip.add(sc.nextLong());
        }
        for(int i=0;i<m;i++){
            long x=sc.nextLong();
            map.put(x,map.getOrDefault(x,0)+1);
        }
        List<Long> arr=new ArrayList<>();
        for(int i=0;i<n;i++){
            long c=ip.get(i);
            if(map.containsKey(c) && map.get(c)>0){
                map.put(c,map.get(c)-1);
            }
            else{
                arr.add(c);
            }
        }
        int res=0;
        for(int i=0;i<arr.size();i++){
            Long to=null;
            for(long x:map.keySet()){
                if(x>=arr.get(i) && map.get(x)>0){
                    if(to==null) to=x;
                    else{
                        to=Math.min(to,x);
                    }
                }
            }
            if(to==null) res++;
            else{
                map.put(to,map.get(to)-1);
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
    int nextInt(){
        return Integer.parseInt(next());
    }
    long nextLong(){
        return Long.parseLong(next());
    }
}