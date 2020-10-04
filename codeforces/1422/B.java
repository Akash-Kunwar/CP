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
            int m=sc.nextInt();
            long arr[][]=new long[n][m];
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    arr[i][j]=sc.nextLong();
                }
            }
            long res=0;
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    List<Long> adj=new ArrayList<>();
                    adj.add(arr[i][j]);
                    adj.add(arr[i][m-1-j]);
                    adj.add(arr[n-1-i][j]);
                    adj.add(arr[n-1-i][m-1-j]);
                    Collections.sort(adj);
                    long avg=(adj.get(1)+adj.get(2))/2;
                    res+=Math.abs(avg-arr[i][j]);
                    arr[i][j]=avg;
                    res+=Math.abs(avg-arr[i][m-1-j]);
                    arr[i][m-1-j]=avg;
                    res+=Math.abs(avg-arr[n-1-i][j]);
                    arr[n-1-i][j]=avg;
                    res+=Math.abs(avg-arr[n-1-i][m-1-j]);
                    arr[n-1-i][m-1-j]=avg;
                }
            }
            // for(int i=0;i<n;i++){
            //     out.println(Arrays.toString(arr[i]));
            // }
            out.println(res);
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