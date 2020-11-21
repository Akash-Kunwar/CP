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
        
        int n = nextInt(); 
        List<Pair> arr =new ArrayList<>();
        for(int i=0;i<n;i++){
            arr.add(new Pair(nextInt(),nextInt()));
        }
        Collections.sort(arr,(a,b)->{
            return a.p-b.p;
        });
        int prev=arr.get(0).v;
        boolean flag=false;
        for(Pair p:arr){
            if(prev>p.v){
                flag=true;
                break;
            }
            prev=Math.max(p.v,prev);
        }
        out.println(flag?"Happy Alex":"Poor Alex");
        out.close();
    }
}
class Pair{
    int p,v;
    Pair(int p,int v){
        this.p=p;
        this.v=v;
    }
}
