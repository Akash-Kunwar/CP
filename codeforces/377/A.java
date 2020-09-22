import java.util.*;
import java.io.*;
import java.lang.*;
public class Main{ 
    static boolean ok(char arr[][],int nx,int ny,int n,int m){
        if(nx>=0 && nx<n && ny>=0 && ny<m && arr[nx][ny]=='.') return true;
        return false;
    }   
    public static void main(String[] args) throws Exception{
        FastScanner in =new FastScanner();
        PrintWriter out = new PrintWriter(System.out);
        int X[]={1,-1,0,0},Y[]={0,0,-1,1};  
        int n=in.nextInt();
        int m=in.nextInt();
        int k=in.nextInt();
        char arr[][]=new char[n][m];
        List<Pair> st=new ArrayList<>();
        Pair start=null;
        boolean visited[][] =new boolean[n][m]; 
        for(int i=0;i<n;i++){
            String temp=in.br.readLine();
            for(int j=0;j<m;j++){
                arr[i][j]=temp.charAt(j);
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]=='.'){
                    start=new Pair(i,j);
                    break;
                }
            }
            if(start!=null) break;
        }
        Queue<Pair> q=new LinkedList<>();
        q.add(start);
        st.add(start);
        visited[start.x][start.y]=true;
        while(q.size()!=0){
            Pair curr=q.poll();
            for(int i=0;i<4;i++){
                int nx=X[i]+curr.x,ny=Y[i]+curr.y;
                if(ok(arr,nx,ny,n,m) && !visited[nx][ny]){
                    q.add(new Pair(nx,ny));
                    st.add(new Pair(nx,ny));
                    visited[nx][ny]=true;
                }
            }
        }
        Collections.reverse(st);
        for(Pair p:st){
            // out.println(p.x+" "+p.y);
            if(k>0){
                arr[p.x][p.y]='X';
                k--;
            }
            else{
                break;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                out.print(arr[i][j]);
            }
            out.println();
        }
        out.close(); 
    }
}
class Pair{
    int x=0,y=0;
    Pair(int a,int b){
        x=a;
        y=b;
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