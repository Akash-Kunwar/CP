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
            int n=nextInt();
            char arr [][]=new char[n][n];
            for(int i=0;i<n;i++){
                String str =next();
                for(int j=0;j<n;j++){
                    arr[i][j]=str.charAt(j);
                }
            } 
            boolean flag=false;
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(arr[i][j]=='1'){
                        if((j<n-1  && arr[i][j+1]=='0') && (i<n-1 && arr[i+1][j]=='0')) {
                            flag =true;
                            break;
                        }
                    }
                }
            }
            out.println(flag?"NO":"YES");
        } 
        out.close();
    }
}
