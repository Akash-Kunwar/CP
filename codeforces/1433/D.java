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
            int n =nextInt(),x=-1;
            long arr[]=new long[n+1];
            boolean flag=false;
            for(int i=1;i<=n;i++){
                arr[i]=nextLong();
                if(i>1 && arr[i]!=arr[i-1]){
                    flag=true;
                }
            }
            if(!flag){
                out.println("NO");
            }
            else{
                out.println("YES");
                for(int i=1;i<=n;i++){
                    if(arr[i]!=arr[1]){
                        out.println(1+" "+i);
                        x=i;
                    }
                }
                for(int i=2;i<=n;i++){
                    if(arr[i]==arr[1]){
                        out.println(x+" "+i);
                    }
                }
            }
        }
        out.close();
    }
}
