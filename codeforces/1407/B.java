import java.util.*;
import java.lang.*;
import java.io.*;
public class Main
{   
    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);
    static int gcd(int a,int b){
        if(a==0) return b;
        return gcd(b%a,a);
    }
    static int nI(){
        return Integer.parseInt(sc.next());
    }
    public static void main(String args[]) throws Exception
    {
        int x=nI();
        while(x-->0){
            int n=nI();
            int arr[] = new int[n];
            int max=Integer.MIN_VALUE;
            int t=0;
            for(int i=0;i<n;i++){
                arr[i]=nI();
                if(max<arr[i]){
                    max=arr[i];
                    t=i;
                }
            }

            int res[]=new int[n];
            int prev_gcd=max;
            res[0]=max;
            arr[t]=-1;
            max=0;
            
            for(int i=1;i<n;i++){
                max=0;t=0;
                for(int j=0;j<n;j++){
                    if(arr[j]!=-1){
                        int g=gcd(prev_gcd,arr[j]);
                        if(g>max){
                            max=g;
                            t=j;
                        }
                        else if(g==max){
                            if(arr[t]<arr[j]){
                                t=j;
                            }
                        }
                    }
                }
                prev_gcd=gcd(prev_gcd,arr[t]);
                res[i]=arr[t];
                arr[t]=-1;
            }
            for(int i=0;i<n;i++){
                out.print(res[i]+" ");
            }
            out.println();

        }
        out.close();
    }
}
