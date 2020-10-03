import java.util.*;
import java.io.*;
import java.lang.*;
public class Main{ 
    public static void main(String[] args) {
        FastScanner sc =new FastScanner();
        PrintWriter out=new PrintWriter(System.out);
        int n=sc.nextInt();
        int arr[]=new int[9];
        int min=Integer.MAX_VALUE,idx=-1;
        for(int i=0;i<9;i++){
            arr[i]=sc.nextInt();
            if(min>=arr[i]){
                min=arr[i];
                idx=i+1;
            }
        }
        if(min>n){
            out.println(-1);
            out.close();
            return;
        }
        int k=n/min,v=n-k*min;

        StringBuilder str =new StringBuilder();
        for(int i=0;i<k;i++){
            int curr=idx;
            for(int j=8;j>=0;j--){
                if(arr[j]-min<=v){
                    curr=j+1;
                    v-=arr[j]-min;
                    break;
                }
            }
            str.append(curr);
        }
        out.println(str);
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