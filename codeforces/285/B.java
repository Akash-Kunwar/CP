import java.util.*;
import java.io.*;
import java.lang.*;
public class Main{ 
    public static void main(String[] args) throws Exception{
        FastScanner sc =new FastScanner();
        PrintWriter out=new PrintWriter(System.out);
        int n=sc.nextInt(),s=sc.nextInt(),t=sc.nextInt();
        int arr[]=new int[n+1];
        for(int i=1;i<n+1;i++) arr[i]=sc.nextInt();
        int vis[]=new int[n+1],count=0;
        Arrays.fill(vis,-1);
        for(int i=1;i<n+1;i++){
            if(vis[i]==-1){
                int curr=i,to=arr[i];
                while(vis[curr]==-1){
                    vis[curr]=count;
                    curr=to;to=arr[to];
                }
                count++;
            }
        }
        if(vis[s]!=vis[t]) out.println(-1);
        else if(s==t){
            out.println(0);
        }
        else{
            count=1;
            int start=s,end=arr[s];
            while(end!=t){
                start=end;
                end=arr[end];
                count++;
            }
            out.println(count);
        }
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
    long nextLong(){
        return Long.parseLong(next());
    }
}