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
            int k=sc.nextInt();
            Set<Integer> set =new HashSet<>();
            for(int i=0;i<n;i++) set.add(sc.nextInt());
            if(k==1){
                if(set.size()>1){
                    out.println(-1);
                }
                else{
                    out.println(1);
                }
            }
            else if(k>=set.size()){
                out.println(1);
            }
            else{
                out.println((int)Math.ceil((double)(set.size()-k)/(k-1))+1);
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