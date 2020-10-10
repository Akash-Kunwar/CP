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
    Node node[]=new Node[101];
    boolean vis[]=new boolean[101];
    void dfs(int start,int end){
        // out.println(start);
        vis[start]=true;
        if(start==end) return;
        if(node[start].adj.size()==0) return;
        int a=node[start].adj.get(0).a,b=node[start].adj.get(0).b;
        // out.println("Source"+a+" "+b);
        for(int i=0;i<101;i++){
            if(i==start) continue;
            if(node[i].adj.size()==0) continue;
            if(vis[i]) continue;
            int curr_a =node[i].adj.get(0).a,curr_b=node[i].adj.get(0).b;
            // out.println("Inner Source"+curr_a+" "+curr_b);
            if((curr_a<a && a<curr_b) || (curr_a<b && b<curr_b)){
                // out.println("YESSS");
                dfs(i,end);
            }
        }
    }
    void solve(){
        for(int i=0;i<101;i++) node[i]=new Node();
        int z=nextInt(),count=0;
        while(z-->0){
            
            int t=nextInt(),a=nextInt(),b=nextInt();
            if(t==1){
                count++;
                node[count].adj.add(new Pair(count,a,b));
            }
            else{
                Arrays.fill(vis,false);
                dfs(a,b);
                // out.println(Arrays.toString(vis));
                if(vis[b]){
                    out.println("YES");
                }
                else{
                    out.println("NO");
                }
            }
        }
        out.close();
    }
}
class Pair{
    int t=0,a=0,b=0;
    Pair(int t,int a,int b){
        this.a=a;
        this.b=b;
        this.t=t;
    }
}
class Node{
    List<Pair> adj =new ArrayList<>();
}