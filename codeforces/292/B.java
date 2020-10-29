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
    void solve(){ 
        int n=nextInt(),m=nextInt();
        node =new Node[n+1];
        for(int i=0;i<n+1;i++) node[i]=new Node();
        for(int i=0;i<m;i++){
            int a =nextInt(),b=nextInt();
            node[a].adj.add(b);
            node[b].adj.add(a);
        }
        int res[]=new int[n+1];
        for(int i=1;i<=n;i++){
            res[i]=node[i].adj.size();
        }
        int notOne=0,two=0,one=0,zero=0;
        for(int i:res){
            if(i==0) zero++;
            if(i!=1) {
                notOne++;
            }
            if(i==2) two++;
            if(i==1) one++;
            
        }
        notOne--;
        if(two==n){
            out.println("ring topology");
        }
        else if(one == 2 && two==n-2){
            out.println("bus topology");
        }
        else if(notOne==1 && one==n-1){
            out.println("star topology");
        }
        else{
            out.println("unknown topology");
        }

        out.close();
    }
}

class Node{
    List<Integer> adj =new ArrayList<>();
}