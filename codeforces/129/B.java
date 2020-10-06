import java.util.*;
import java.io.*;
import java.lang.*;
public class Main{ 
    static Node[] node;
    static int vis[],nb[];
    static int bfs(int start,int n){
        for(int i=1;i<=n;i++){
            if(vis[i]==-1) continue;
            vis[i]=0;
        }
        int sid=0;
        vis[start]=1;

        ArrayDeque<Integer> q=new ArrayDeque<>();
        q.add(start);
        while(q.size()!=0){
            int curr=q.poll();
            for(int ele:node[curr].adj){
                if(vis[ele]==0){
                    sid++;
                    vis[ele]=1;
                }
            }
        }
        return sid;
    }
    public static void main(String[] args) {
        FastScanner sc =new FastScanner();
        PrintWriter out=new PrintWriter(System.out);
        int n=sc.nextInt();
        int m=sc.nextInt();
        node =new Node[n+1];
        vis=new int[n+1];
        nb=new int[n+1];
        for(int i=0;i<n+1;i++) node[i]=new Node();
        for(int i=0;i<m;i++)
        {
            int u=sc.nextInt(),v=sc.nextInt();
            node[u].adj.add(v);
            node[v].adj.add(u);
        }
        int res=0;
        while(true){
            List<Integer> temp=new ArrayList<>();
            for(int i=1;i<=n;i++){
                if(nb[i]!=-1){
                    int x=bfs(i,n);
                    if(x==1){
                        temp.add(i);
                    }
                }
            }

            if(temp.size()==0) break;
            for(int j:temp)
            {
                vis[j]=-1;
                nb[j]=-1;
            }
            temp.clear();
            res++;
        }
        out.println(res);
        out.close();
    }
}
class Node{
    List<Integer> adj =new ArrayList<>();
}
class FastScanner{
    BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
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
}