import java.util.*;
import java.io.*;
import java.lang.*;
public class Main{ 
    
    public static void main(String[] args) throws Exception{
        FastScanner sc =new FastScanner();
        PrintWriter out=new PrintWriter(System.out);
        int n=sc.nextInt();
        boolean arr[]=new boolean[10000001];
        for(int i=2;i<10000001;i++){
            arr[i]=true;
        }
        for(int i=2;i<1001;i++){
            if(arr[i]){
                for(int j=2*i;j<10000001;j+=i){
                    arr[j]=false;
                }
            }
        }
        for(int i=0;i<n;i++){
            long x=sc.nextLong();
            double y=Math.sqrt(x);
            if(y==(int)y && arr[(int)y]){
                out.println("YES");
            }
            else{
                out.println("NO");
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
    long nextLong(){
        return Long.parseLong(next());
    }
}