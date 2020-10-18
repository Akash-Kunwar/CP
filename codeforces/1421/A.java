import java.util.*;
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
    long nextLong(){
        return Long.parseLong(next());
    }
    public static void main(String[] args) {
        new Codeforces().solve();
    }
    void solve(){
        int t=nextInt();
        while(t-->0){
            long a=nextLong(),b=nextLong();
            int res[]=new int[62];
            for(int i=61;i>=0;i--){
                int bit1=0,bit2=0;
                if(((a>>i) & 1) ==1){
                    bit1=1;
                }
                if(((b>>i) & 1) ==1){
                    bit2=1;
                }
                if(bit1==bit2){
                    res[i]=bit1;
                }
            }   
            long r=0; 
            for(int i=0;i<62;i++){
                if(res[i]!=0) r+=(long)Math.pow(2,i);
            }   
            out.println((r^a) + (r^b));
        }
        out.close();
    }
}
