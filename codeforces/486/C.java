import java.util.*;
import java.io.*;
public class pt{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt()-1;
        int p=sc.nextInt()-1;
        String str=sc.next();
        int s=0,l=0,r=0;
        p=Math.min(p,n-p);
        for(int i=0;i<=n/2;i++){
            if(str.charAt(i)!=str.charAt(n-i)){
                if(s==0)l=i;
                r=i;
                int t=Math.abs(str.charAt(i)-str.charAt(n-i));
                s+=Math.min(t,26-t);
            }
        }
 
        System.out.println(s>0?(s+Math.min(Math.abs(p-l),Math.abs(p-r))+r-l):0);
    }
}