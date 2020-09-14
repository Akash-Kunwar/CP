import java.util.*;
import java.lang.*;
import java.io.*;
public class Main
{       
    static Scanner sc =new Scanner(System.in);
    static PrintWriter out =new PrintWriter(System.out); 
    static int nI(){
        return Integer.parseInt(sc.next());
    }
    static long nL(){
        return Long.parseLong(sc.next());
    } 
   
    public static void main(String args[]) throws Exception{
        int t= nI();
        while(t-->0){
            int n = nI();
            long arr[]= new long[n];
            int check[]= new int[n];
            for(int i=0;i<n;i++) arr[i]=nL();
            for(int i=0;i<n;i++) check[i]=nI();
            List<Long> min =new ArrayList<>(),max=new ArrayList<>();
            for(int i=0;i<n;i++){
                if(check[i]==1) continue;
                max.add(arr[i]);
            }
            Collections.sort(max);
            Collections.reverse(max);

            int l=0;
            long res1[]= new long[n];
            for(int i=0;i<n;i++)
            {
                if(check[i]==1) {
                    res1[i]=arr[i];
                    continue;
                }
                res1[i]=max.get(l);
                l++;
            }

            
            for(long i:res1) out.print(i+" ");
            
            out.println();
        }
        out.close();
    }
}

