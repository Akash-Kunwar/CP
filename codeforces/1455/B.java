import java.util.*;
import java.io.*;
import java.lang.*;
public class Codeforces2{ 
    static int check(int n){
        long l=1,h=n,res=h;
        while(l<=h){
            long mid=(l+h)/2;
            long total =(mid)*(mid+1)/2;
            if(total>=n){
                res=mid;
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return (int)res;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n =sc.nextInt();
            int m=check(n);
            int tt =(m)*(m+1)/2;
            // out.println(mid+" "+n+" "+total);
            if(tt==n || tt-1!=n) System.out.println(m);
            else System.out.println(m+1);
        }
    }
}

