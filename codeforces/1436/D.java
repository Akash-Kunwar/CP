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
    Node[] node;
    Pair[] pair;
    long arr[];

    void dfs(int u){
        for(int i:node[u].adj){
            dfs(i);
            pair[u].count+=pair[i].count;
            pair[u].max=Math.max(pair[u].max,pair[i].max);
            pair[u].sum+=pair[i].sum;
        }
        pair[u].sum+=arr[u];
        if(pair[u].count==0){
            pair[u].max=arr[u];
            pair[u].count=1;
        }
        else{
            long avg = (pair[u].sum+pair[u].count-1)/pair[u].count;
            pair[u].max =Math.max(pair[u].max,avg);
        }   
    }

    void solve(){
        int n=nextInt();
        node = new Node[n];
        pair =new Pair[n];
        for(int i=0;i<n;i++) pair[i] =new Pair();
        for(int i=0;i<n;i++) node[i] = new  Node();
        for(int i=0;i<n-1;i++){
            int x=nextInt()-1;
            node[x].adj.add(i+1);
        }
        arr = new long[n];
        for(int i=0;i<n;i++) arr[i] =nextLong();
        dfs(0);
        out.println(pair[0].max);
        out.close();
    }
}
class Pair{
    long max,sum,count;
}
class Node{
    List<Integer> adj =new ArrayList<>();
}