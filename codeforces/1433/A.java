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
    public static void main(String[] args) {
        new Codeforces().solve();
    }
    void solve(){
        int t=nextInt();

        while(t-->0){
            String str=next();
            int x=str.charAt(0)-'0';
            long res=(x-1)*10;
            if(str.length()==1) res++;
            else if(str.length()==2) res+=3;
            else if(str.length()==3) res+=6;
            else if(str.length()==4) res+=10;
            out.println(res);

        }

        out.close();
    }
}

