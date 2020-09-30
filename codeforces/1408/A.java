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
            int p[]=new int[n];
            for(int i=0;i<n;i++) a[i]=sc.nextInt();
            for(int i=0;i<n;i++) b[i]=sc.nextInt();
            for(int i=0;i<n;i++) c[i]=sc.nextInt();
            p[0]=a[0];
            for(int i=1;i<n;i++){
                if(p[i-1]==a[i]){
                    if(p[i-1]==b[i]){
                        p[i]=c[i];
                    }
                    else{
                        p[i]=b[i];
                    }
                }
                else{
                    p[i]=a[i];
                }
            }
            if(p[n-1]==p[0]){
                if(p[n-2]==c[n-1]){
                    p[n-1]=b[n-1];
                }
                else{
                    p[n-1]=c[n-1];
                }
            }
            for(int i:p){
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