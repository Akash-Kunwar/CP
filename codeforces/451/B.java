import java.util.*;
import java.io.*;
import java.lang.*;
public class Main{ 
    public static void main(String[] args) {
        FastScanner in =new FastScanner();
        PrintWriter out=new PrintWriter(System.out);
        int n=in.nI();
        long arr[]=new long[n],brr[]=new long[n];
        Map<Long,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++) arr[i]=in.nL();
        brr=arr.clone();
        Arrays.sort(brr);
        for(int i=0;i<n;i++){
            map.put(brr[i],i);
        }
        for(int i=0;i<n;i++){
            arr[i]=map.get(arr[i]);
        }
        int L=-1 ,R=-1;
        for(int i=0;i<n;i++){
            if(arr[i]!=i) {
                L=i;
                break;
            }
        }
        for(int i=n-1;i>=0;i--){
            if(arr[i]!=i){
                R=i;
                break;
            }
        }
        if(L==-1 || R==-1){
            out.println("yes");
            out.println(1+" "+1);
        }
        else{
            int i=L,j=R;
            while(i<=j){
                long temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;j--;
            }
            boolean ok=true;
            for( i=0;i<n;i++){
                if(arr[i]!=i){
                    ok=false;
                    break;
                }
            }
            if(ok){
                out.println("yes");
                out.println((L+1)+" "+(R+1));
            }
            else{
                out.println("no");
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