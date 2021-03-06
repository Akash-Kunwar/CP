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
            int n=nextInt(),m=nextInt();
            char arr[][]=new char[n][m];
            for(int i=0;i<n;i++){
                Arrays.fill(arr[i],'B');
            }
            arr[0][0]='W';
            for(int i=0;i<n;i++){
                for(char j:arr[i]){
                    out.print(j+"");
                }
                out.println();
            }
        }
        out.close();
    }
}
