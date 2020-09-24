import java.util.*;
import java.io.*;
import java.lang.*;
public class Main{ 
    public static void main(String[] args) {
        FastScanner in =new FastScanner();
        PrintWriter out=new PrintWriter(System.out);
        int t=in.nI();
        while(t-->0){
            int n=in.nI();
            int z=in.nI();
            int arr[]=new int[n];
            for(int i=0;i<n;i++) arr[i]=in.nI();
            List<Integer> q=new ArrayList<>();
            for(int i=0;i<n;i++){
                if(i==0 || i==n-1 || (arr[i]>arr[i+1] && arr[i]>arr[i-1]) || (arr[i]<arr[i+1] && arr[i]<arr[i-1])){
                    q.add(arr[i]);
                }
            }
            // out.println(q);
            if(q.size()==1){
                out.println(q.get(0));
            }
            else{
                int st=0;
                if(q.get(0)<q.get(1)){
                    st=1;
                }
                long res=0;
                boolean flag=false;
                for(int i=st;i<q.size();i++){
                    if(!flag){
                        // out.println("+ "+q.get(i));
                        res+=q.get(i);
                        flag=true;
                    }
                    else{
                        // out.println("- "+q.get(i));
                        res-=q.get(i);
                        flag=false;
                    }
                }
                if(!flag){
                    res+=q.get(q.size()-1);
                }
                out.println(res);
            }
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
    int nI(){
        return Integer.parseInt(next());
    }
    long nL(){
        return Long.parseLong(next());
    }
}    

