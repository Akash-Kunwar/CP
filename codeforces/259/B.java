import java.util.*;
import java.io.*;
import java.lang.*;
public class Main{ 
    static boolean ok(long arr[][]){
        List<Long> s=new ArrayList<>();
        s.add(arr[0][0]+arr[0][1]+arr[0][2]);
        s.add(arr[1][0]+arr[1][1]+arr[1][2]);
        s.add(arr[2][0]+arr[2][1]+arr[2][2]);
        s.add(arr[0][0]+arr[1][0]+arr[2][0]);
        s.add(arr[0][1]+arr[1][1]+arr[2][1]);
        s.add(arr[0][2]+arr[1][2]+arr[2][2]);
        s.add(arr[0][0]+arr[1][1]+arr[2][2]);
        s.add(arr[0][2]+arr[1][1]+arr[2][0]);
        long prev=s.get(0);
        for(long i:s){
            if(i!=prev) return false;
        }
        return true;

    }
    public static void main(String[] args) throws Exception{
        FastScanner sc =new FastScanner();
        PrintWriter out=new PrintWriter(System.out);
        long arr[][]=new long[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=1;i<=100005;i++){
            long sumi=arr[0][1]+arr[0][2]+i;
            arr[0][0]=i;
            arr[1][1]=sumi-arr[1][0]-arr[1][2];
            arr[2][2]=sumi-arr[2][0]-arr[2][1];
            if(ok(arr)) break;
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                out.print(arr[i][j]+" ");
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
    long nextLong(){
        return Long.parseLong(next());
    }
}