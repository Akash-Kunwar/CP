import java.util.*;
import java.io.*;
import java.lang.*;
public class Main{ 
    public static void main(String[] args) {
        FastScanner sc =new FastScanner();
        PrintWriter out=new PrintWriter(System.out);
        int n=sc.nextInt(),c=sc.nextInt();
        int arr[]=new int[n];
        int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            max=Math.max(arr[i],max);
            min=Math.min(arr[i],min);
        }
        if(min+c<max){
            out.println("NO");
            out.close();
            return;
        }
        out.println("YES");
        for(int i=0;i<n;i++){
            for(int j=0;j<arr[i];j++){
                out.print((j)%c+1+" ");
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