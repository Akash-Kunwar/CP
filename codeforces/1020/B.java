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
    Node node[];
    int n=0;
    int bfs(int start){
        ArrayDeque<Integer> q=new ArrayDeque<>();
        boolean vis[] =new boolean[n+1];
        vis[start] =true;
        q.add(start);
        while(q.size()!=0){
            int curr = q.poll();
            for(int i:node[curr].adj){
                if(!vis[i]){
                    q.add(i);
                    vis[i]=true;
                }
                else return i;
            }
        }
        return -1;
    }
    void solve(){ 
        n=nextInt();
        node =new Node[n+1];
        for(int i=0;i<=n;i++) node[i]=new Node();
        for(int i=1;i<=n;i++){
            int x=nextInt();
            node[i].adj.add(x);
        }
        for(int i=1;i<=n;i++){
            out.print(bfs(i)+" ");
        }
        out.close();
    }
}
class Node{
    List<Integer> adj =new ArrayList<>();
}