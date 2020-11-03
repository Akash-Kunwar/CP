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
    Map<Integer,Double> res = new HashMap<>();
    void solve(){ 
        char arr[]=next().toCharArray();
        char brr[]=next().toCharArray();
        int real =0;
        double ans =0.0;
        for(char i:arr){
            real+=i=='+'?1:-1;
        }
        ok(brr,0,0,1);
        for(int i:res.keySet()){
            if(i==real){
                ans = res.get(i);
            }
        }
        // out.println(real+" "+res);
        out.println(ans);
        out.close();
    }
    void ok(char brr[] , int idx ,int dist, double p){
        // System.out.println(idx);
        if(idx>=brr.length){
            res.put(dist,res.getOrDefault(dist, 0.0)+p);
            return;
        }
        if(brr[idx]=='+'){
            ok(brr,idx+1,dist+1,p);
        }
        else if(brr[idx]=='-'){
            ok(brr,idx+1,dist-1,p);
        }
        else{
            ok(brr,idx+1,dist+1,p*0.5);
            ok(brr,idx+1,dist-1,p*0.5);
        } 


    }
}

