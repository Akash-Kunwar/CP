import java.util.*;
import java.io.*;
import java.lang.*;
public class Main{ 
    public static void main(String[] args) {
        FastScanner sc =new FastScanner();
        PrintWriter out=new PrintWriter(System.out);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int res[]=new int[n+1];
            Arrays.fill(res,Integer.MAX_VALUE);
            ArrayList<Integer> st[]=new ArrayList[n+1];
            for(int i=0;i<n+1;i++){
                st[i]=new ArrayList<>();
                st[i].add(-1);
            }
            for(int i=0;i<n;i++){
                st[sc.nextInt()].add(i);
            }
            for(int i=0;i<n;i++){
                st[i].add(n);
            }
            for(int i=0;i<n+1;i++){
                if(st[i].size()>2){
                    int max=0;
                    for(int j=1;j<st[i].size();j++){
                        max=Math.max(st[i].get(j)-st[i].get(j-1),max);
                    }
                    res[max]=Math.min(res[max],i);
                }
            }
            res[0]=-1;
            
            out.println();
            for(int i=1;i<n+1;i++){
                if(res[i]==Integer.MAX_VALUE){
                    res[i]=res[i-1];
                }
                if(res[i-1]!=-1){
                    res[i]=Math.min(res[i],res[i-1]);
                }
            }
            for(int i=1;i<n+1;i++){
                out.print(res[i]+" ");
            }
            out.println();
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
}   