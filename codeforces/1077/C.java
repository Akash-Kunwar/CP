import java.util.*;
import java.io.*;
import java.lang.*;
public class Solution{
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
        new Solution().solve();
    }
    void solve(){ 
        int n = nextInt();
        Pair[] arr=new Pair[n];
        long sum=0;
        for(int i=0;i<n;i++){
            arr[i]=new Pair(nextLong(),i+1);
            sum+=arr[i].ele;
        }
        Arrays.sort(arr,(a,b)->{
            return (int)(a.ele-b.ele);
        });
        List<Integer> res=new ArrayList<>();
        for(int i=0;i<n-1;i++){
            long rem = sum-arr[i].ele-arr[n-1].ele;
            if(rem==arr[n-1].ele) {
                res.add(arr[i].idx);
            }
        }
        if(sum-arr[n-1].ele-arr[n-2].ele==arr[n-2].ele){
            res.add(arr[n-1].idx);
        }
        if(res.size()==0){
            out.println(0);
        }
        else{
            out.println(res.size());
            for(int i:res)out.print(i+" ");
            out.println();
        }
        out.close();
    }
}

class Pair{
    long ele;
    int idx;
    Pair(long ele,int idx){
        this.ele=ele;
        this.idx=idx;
    }
}