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
        int testCases = 1;
        testCases = nextInt();
        while(testCases-->0){
            ok();
        }
        out.close();

    }
    void ok(){
        int n = nextInt(), d=nextInt();
        List<Pair> arr =new ArrayList<>();
        for(int i=0;i<n;i++){
            arr.add(new Pair(nextInt(),nextInt()));
        }
        int res=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            res=Math.min(res,check(arr,i,d));
        }
        out.println(res==Integer.MAX_VALUE?-1:res);
    }
    int check(List<Pair> arr,int pos,int k){
        for(int i=0;i<arr.size();i++){
            int distance = distance(arr.get(i), arr.get(pos));
            if(distance>k) return Integer.MAX_VALUE;
        }
        return 1;
    }
    int distance(Pair a,Pair b){
        return Math.abs(a.x-b.x)+Math.abs(a.y-b.y);
    }
}
class Pair{
    int x,y;
    Pair(int x,int y){
        this.x=x;
        this.y=y;
    }
}