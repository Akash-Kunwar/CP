import java.util.*;
import java.io.*;
import java.lang.*;
public class Main{ 
    static boolean ok(int arr[],int d){
        int i=0,n=arr.length;
        for(i=0;i<n;){
            if(arr[i]>=d){
                if(i+2<n && arr[i+2]>=d){
                    i+=2;
                }
                else if(i+1<n && arr[i+1]>=d){
                    i+=1;
                }
                else{
                    break;
                }
            }
            else{
                break;
            }
        }
        if(i>=n-1) return true;
        return false;
    }
    public static void main(String[] args) {
        FastScanner sc =new FastScanner();
        PrintWriter out=new PrintWriter(System.out);
        int n=sc.nextInt();
        int arr[]=new int[n],max=Integer.MIN_VALUE,min=Integer.MAX_VALUE,res=max;

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            max=Math.max(arr[i],max);
            min=Math.min(arr[i],min);
        }
        // out.println(min+" "+max);
        while(min<=max){
            int mid=(min+max)/2;
            // out.println(mid);
            if(ok(arr,mid)){
                res=mid;
                min=mid+1;
            }
            else{
                max=mid-1;
            }
        }
        out.println(res);
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