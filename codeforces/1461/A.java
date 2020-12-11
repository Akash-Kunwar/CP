import java.util.*;
import java.io.*;
import java.lang.*;
public class Solution{
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
        new Solution().solve();
    }
    void solve(){ 
        int t = 1;
        t=nextInt();
        while(t-->0){
            int n = nextInt() , k=nextInt();
            String r="";
            for(int i=0;i<n;i++){
                if(i%3==0) r+='a';
                if(i%3==1) r+='b';
                if(i%3==2) r+='c';
            }
            out.println(r);
        }
        out.close();
    }
}
