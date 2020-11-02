import java.util.*;

import javax.print.attribute.standard.PrinterName;

import java.io.*;
import java.lang.*;
public class Codeforces{
    BufferedReader br =new BufferedReader(new InputStreamReader(System.in)); 
    PrintWriter out =new PrintWriter(System.out);
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
    public static void main(String[] args) {
        new Codeforces().solve();
        
    }
    void solve(){
        int t=nextInt();
        while(t-->0){
            int n=nextInt(),c=n;
            for(int i=4*n-2;i>=0 && c>0 ;i-=2){
                out.print(i+" ");
                c--;
            }
            out.println();
        }
        out.close();
    }
}
