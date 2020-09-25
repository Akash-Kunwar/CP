import java.util.*;
import java.io.*;
import java.lang.*;
public class Main{ 
    public static void main(String[] args) throws Exception{
        FastScanner sc =new FastScanner();
        PrintWriter out=new PrintWriter(System.out);
        int n=sc.nI(),m=sc.nI();
        Map<String,String> map=new HashMap<>();
        for(int i=0;i<m;i++){
            map.put(sc.next(),sc.next());
        } 
        for(int i=0;i<n;i++){
            String x=sc.next(),y=map.get(x);
            out.print(x.length()<=y.length()?x+" ":y+" ");
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
}