import java.util.*;
import java.io.*;
import java.lang.*;
public class Main{
    public static void main(String[] args) {
        FastScanner sc =new FastScanner();
        PrintWriter out=new PrintWriter(System.out);
        int n=sc.nextInt(),m=sc.nextInt(),k=sc.nextInt();
        int arr[]=new int[n*m];
        Set<Integer> set =new HashSet<>();
        for(int i=0;i<n*m;i++) 
        {
            arr[i]=sc.nextInt();
            set.add(arr[i]%k);
        }
        if(set.size()>1){
            out.println(-1);
            out.close();
            return;
        }
        Arrays.sort(arr);
        int ans=0,x=arr[(n*m)/2];
        for(int i=0;i<n*m;i++){
            ans+=Math.abs(arr[i]-x)/k;
        }
        out.println(ans);
        
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