import java.util.*;
import java.io.*;
import java.lang.*;
public class Main{ 
    
    public static void main(String[] args) throws Exception{
        FastScanner sc =new FastScanner();
        PrintWriter out=new PrintWriter(System.out);
        char str[]=sc.next().toCharArray();
        int n=sc.nextInt();
        int max=0;
        int arr[]=new int[26];
        long total=0;
        for(int i=0;i<26;i++){
            arr[i]=sc.nextInt();
            max=Math.max(arr[i],max);
        }
        for(int i=0;i<str.length;i++){
            total+=(i+1)*arr[str[i]-'a'];
        }
        for(int i=1;i<=n;i++){
            total+=(str.length+i)*max;
        }
        out.println(total);
        
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