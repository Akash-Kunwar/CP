import java.util.*;
import java.lang.*;
import java.io.*;
public class Main
{   
    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);
    
    static int nI(){
        return Integer.parseInt(sc.next());
    }

    static long nl(){
        return Long.parseLong(sc.next());
    }


    public static void main(String args[]) throws Exception
    {
        int t=nI();
        while(t-->0){
            int n=nI();
            int arr[] = new int[n];
            long e=0,o=0,z=0;
            for(int i=0;i<n;i++){
                arr[i]=nI();
                if(i%2==0) e+=arr[i];
                else o+=arr[i];
                if(arr[i]==0) z++;
            }
            if(e==o){
                out.println(n);
                for(int i=0;i<n;i++) out.print(arr[i]+  " ");
            }
            else if(o+e<=n/2){
                out.println(n-o-e);
                for(int i=0;i<n-o-e;i++) out.print(0+" ");
            }
            else{
                if((o+e)%2==0){
                    out.println(o+e);
                    for(int i=0;i<o+e;i++) out.print(1+" ");
                }
                else if((o+e)>n/2){
                    out.println(o+e-1);
                    for(int i=0;i<o+e-1;i++) out.print(1+" ");
                }
                else{
                    out.println(2+z);
                    for(int i=0;i<z;i++) out.print(0+" ");
                    out.print("1 1");
                }
            }
            out.println();

        }
        out.close();
    }
}

