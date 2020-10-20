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
            List<Integer> arr=new ArrayList<>();
            for(int i=1;i<=n;i++){
                int x=nextInt();
                if(x==1) arr.add(i);
            }
            long res=0;
            // out.println(arr);
            for(int i=1;i<arr.size();i++){
                res+=arr.get(i)-arr.get(i-1)-1;
            }
            out.println(res);
        }
        out.close();
    }
}
