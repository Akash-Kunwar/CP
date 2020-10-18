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
        while(t-->0)
        {
            char arr[]=next().toCharArray();
            Stack<Character> st=new Stack<>();
            for(int i=0;i<arr.length;i++){
                if(st.size()==0) st.push(arr[i]);
                else if(arr[i]=='B') st.pop();
                else st.push(arr[i]);
            }

            out.println(st.size());
        }
        out.close();
    }
}
