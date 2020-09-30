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
            int a[]=new int[n],b[]=new int[n],c[]=new int[n];
            for(int i=0;i<n;i++) a[i]=sc.nextInt();
            for(int i=0;i<n;i++) b[i]=sc.nextInt();
            for(int i=0;i<n;i++) c[i]=sc.nextInt();
            for(int i=1;i<n;i++){
                if(a[i]==a[i-1] ){
                    if(a[i]!=b[i-1]){
                        a[i]=b[i];
                    }
                    else{
                        a[i]=c[i];
                    }
                }
                if(i==n-1 && a[i]==a[0]){
                    if(b[i]!=a[0] && b[i]!=a[i-1]){
                        a[i]=b[i];
                    }
                    else{
                        a[i]=c[i];
                    }
                }
            }
            
            for(int i:a){
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
}