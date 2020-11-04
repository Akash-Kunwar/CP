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
        int n=nextInt();
        long arr []=new long[n];
        for(int i=0;i<n;i++) arr[i]=nextInt();
        Map<Long,List<Long>> map =new HashMap<>();
        for(int i=0;i<n;i++){
            long curr = arr[i]-i;
            if(!map.containsKey(curr)){
                map.put(curr,new ArrayList<>());
            }
            map.get(curr).add(arr[i]);
        }
        long sum=0;
        for(long i : map.keySet()){
            long s=0;
            for(long j:map.get(i)){
                s+=j;
            }
            sum=Math.max(s,sum);
        }
        out.println(sum);
        out.close();
    }
}
