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
    long nextLong()
    {
        return Long.parseLong(next());
    }
    public static void main(String[] args) {
        new Codeforces().solve();
    }
    void solve(){ 
        int n = nextInt();
        Map<Long,Long> map =new HashMap<>();
        long max = Long.MIN_VALUE , min = Long.MAX_VALUE;
        for(int i=0;i<n;i++){
            long x = nextLong();
            map.put(x,map.getOrDefault(x, 0l)+1);
            max=Math.max(x,max);
            min=Math.min(x,min);
        }
        out.print(max-min+" ");
        if(max==min){
            out.println((map.get(max)*(map.get(max)-1))/2);
        }
        else{
            out.println(map.get(max)*map.get(min));
        }
        out.close();
    }
}
// 1 1 1 1 2 2 2