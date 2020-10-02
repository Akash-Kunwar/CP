import java.util.*;
import java.io.*;
import java.lang.*;
public class Main{ 
    public static void main(String[] args) {
        FastScanner sc =new FastScanner();
        PrintWriter out=new PrintWriter(System.out);
        int m=sc.nextInt(),n=sc.nextInt();
        int arr[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }   
        }
        int finishTime[]=new int[m];
        for(int i=0;i<n;i++){
            int freeAt=0;
            for(int j=0;j<m;j++){
                int startTime=Math.max(freeAt,finishTime[j]);
                finishTime[j]=startTime+arr[j][i];
                freeAt=finishTime[j];
            }
        }
        for(int x:finishTime){
            out.print(x+" ");
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