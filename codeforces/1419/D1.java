import java.util.*;
import java.io.*;
import java.lang.*;
public class Main{
    static PrintWriter out = new PrintWriter(System.out);
    static BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st =new StringTokenizer("");
    static String next() throws Exception{
        if(!st.hasMoreTokens()) st=new StringTokenizer(br.readLine());
        return st.nextToken();
    }
    public static void main(String[] args) throws Exception{
        int n=Integer.parseInt(next());
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(next());
        }
        Arrays.sort(arr);
        int limit=(n-1)/2;
        out.println(limit);
        for(int i=0;i<n/2;i++){
            out.print(arr[n-i-1]+" "+arr[i]+" ");
        }
        if(n%2>0){
            out.print(arr[n/2]);
        }
        
        out.close();
    }
}
