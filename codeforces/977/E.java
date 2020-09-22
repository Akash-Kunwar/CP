import java.util.*;
import java.io.*;
import java.lang.*;
public class Main{ 
    static Node node []=new Node[200005];
    static boolean vis[] =new boolean[200005];
    
    public static void main(String[] args) {
        FastScanner in=new FastScanner();
        PrintWriter out=new PrintWriter(System.out);
        Set<Integer> set=new HashSet<>();
        int n=in.nextInt();
        int m=in.nextInt();
        for(int i=0;i<=n;i++) node[i]=new Node();
        for(int i=0;i<m;i++){
            int a=in.nextInt();
            int b=in.nextInt();
            node[a].adj.add(b);
            node[b].adj.add(a);
        }
        int count=0;
        Queue<Integer> q=new LinkedList<>();
        for(int i=1;i<=n;i++){
            if(!vis[i]){
                boolean good=node[i].adj.size()==2;
                q.add(i);
                vis[i]=true;
                while(q.size()!=0){
                    int curr=q.poll();
                    for(int s:node[curr].adj){
                        if(!vis[s]){
                            good&=node[s].adj.size()==2;
                            q.add(s);
                            vis[s]=true;
                        }
                    }
                } 
                if(good) count++;
               
            } 
        }
        out.println(count);
        out.close();
    }
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
class Node{
    List<Integer> adj=new ArrayList<>();
}
