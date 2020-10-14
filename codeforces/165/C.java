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
        int k=nextInt();
        char arr[] =next().toCharArray();
        long sub[]=new long[arr.length];
        for(int i=0;i<arr.length;i++){
            sub[i]+=arr[i]=='1'?1:0;
        }
        Map<Long,Long> map=new HashMap<>();
        map.put(0l,1l);
        long sum=0,res=0;
        for(int i=0;i<arr.length;i++){
            sum+=sub[i];
            if(map.containsKey(sum-k)){
                res+=map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum,0l)+1);
        }
        out.println(res);
        out.close();
    }
}
