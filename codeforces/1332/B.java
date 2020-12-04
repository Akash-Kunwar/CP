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
    int ok(int n){
        int res=n;
        for(int i=2;i*i<=n;i++){
            if(n%i==0) {res=i;break;}
        }
        return res;
    }
    void solve(){ 
        int t=nextInt();
        while(t-->0){
            int n = nextInt(),c=1;
            int arr[]=new int[n];
            Map<Integer,Integer> map=new HashMap<>();
            for(int i=0;i<n;i++)arr[i]=nextInt();
            for(int i=0;i<n;i++){
                int x = ok(arr[i]);
                if(!map.containsKey(x)){
                    map.put(x,c);
                    c++;
                }
                arr[i]=map.get(x);
            }
            out.println(map.size());
            for(int i:arr)out.print(i+" ");
            out.println();
        }
        out.close();
    }
}
